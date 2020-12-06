package ru.downwine._17_SeventeenthLab;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1
        try (FileWriter writer = new FileWriter("seventeen1.txt", false)) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите строчку для записи в файл");
            writer.write(scanner.next());
            writer.flush(); //очистка писателя
        }
        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
        //2
        try (FileReader reader = new FileReader("seventeen1.txt")) {
            String s;
            BufferedReader br = new BufferedReader(reader);
            System.out.println("Информация в файле:");
            while ((s = br.readLine()) != null)
                System.out.println(s);
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        //3
        try (FileWriter writer = new FileWriter("seventeen1.txt", false)) {
            System.out.println("Введите новую строчку для замены в файле");
            Scanner scanner = new Scanner(System.in);
            writer.write(scanner.next());
            writer.flush();
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        //4
        try (FileWriter writer = new FileWriter("seventeen1.txt", true)) {
            System.out.println("Введите строчку для записи в конец файла");
            Scanner scanner = new Scanner(System.in);
            writer.write(scanner.next());
            writer.flush();
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
