package ru.downwine._21_TwentyfirstLab.Ex3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Application extends JFrame {
    public Application() {
        setTitle ("Это моё 9 окно, не судите строго");
        setSize (new Dimension(700, 600));
        JMenuBar menu = new JMenuBar();
        menu.add(createFileMenu());
        setJMenuBar(menu);
        setVisible (true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation (EXIT_ON_CLOSE);
    }
    public JMenu createFileMenu() {
        JMenu file = new JMenu("Файл");
        JMenu file_new = new JMenu("Новый");
        file.add(file_new);
        JMenuItem file_open = new JMenuItem("Открыть");
        file.add(file_open);
        JMenuItem file_save = new JMenuItem("Сохранить");
        file.add(file_save);
        JMenuItem file_exit = new JMenuItem("Выйти");
        file.add(file_exit);
        JMenuItem text_doc = new JMenuItem("TextDocument");
        file_new.add(text_doc);
        JMenuItem image_doc = new JMenuItem("ImageDocument");
        file_new.add(image_doc);
        JMenuItem music_doc = new JMenuItem("MusicDocument");
        file_new.add(music_doc);
        text_doc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CreateTextDocument createTextDocument = new CreateTextDocument();
                createTextDocument.CreateNew();
                System.out.println("Текстовый документ создан");
            }
        });
        image_doc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CreateTextDocument createTextDocument = new CreateTextDocument();
                createTextDocument.CreateNew();
                System.out.println("Изображение создано");
            }
        });
        music_doc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CreateTextDocument createTextDocument = new CreateTextDocument();
                createTextDocument.CreateNew();
                System.out.println("Музыкальный файл создан");
            }
        });
        file_open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CreateTextDocument createTextDocument = new CreateTextDocument();
                createTextDocument.CreateOpen();
                System.out.println("Файл открыт");
            }
        });
        file_save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CreateTextDocument createTextDocument = new CreateTextDocument();
                createTextDocument.CreateOpen();
                System.out.println("Файл сохранён");
            }
        });
        file_exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CreateTextDocument createTextDocument = new CreateTextDocument();
                createTextDocument.CreateOpen();
                System.out.println("Файл закрыт");
            }
        });
        return file;
    }
    public static void main(String[] args) {
        new Application();
    }
}
