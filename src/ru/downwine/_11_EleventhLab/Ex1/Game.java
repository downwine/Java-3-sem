package ru.downwine._11_EleventhLab.Ex1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Game extends JFrame {
    public int number;
    public int attempts = 0;
    public int result = 0;
    public Game() {
        Random rnd = new Random();
        number = rnd.nextInt(20);
        Font myFont = new Font("Courier", Font.BOLD, 20);

        JFrame window = new JFrame("Это моё 5 окно, не судите строго");
        JButton button = new JButton("Я угадал?");
        button.setBackground(Color.pink);
        button.setFont(myFont);

        JButton button_exit = new JButton("Выход");
        button_exit.setBackground(Color.magenta);
        button_exit.setFont(myFont);

        JTextField bigField = new JTextField("", 25);
        bigField.setFont(myFont);
        bigField.setHorizontalAlignment(JTextField.CENTER);
        bigField.setBackground(Color.pink);

        bigField.setBounds(30, 100, 320, 40);
        button.setBounds(30,160,320,40);
        button_exit.setBounds(30,260,320,40);
        button_exit.setVisible(false);

        window.add(button);
        window.add(bigField);
        window.add(button_exit);
        JTextField text = new JTextField("Результат угадывания", 20);
        window.add(text);
        text.setFont(myFont);
        text.setHorizontalAlignment(JTextField.CENTER);
        text.setBackground(Color.pink);

        text.setBounds(30, 230, 320, 30);
        window.setSize(400,400);

        window.setLayout(null);
        window.getContentPane().setBackground(new Color(100, 200, 233));
        window.setVisible(true);
        window.setLocationRelativeTo(null);
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int input = Integer.parseInt(bigField.getText());
                if (input > number) {
                    text.setText("Число больше необходимого");
                }
                else if (input < number) {
                    text.setText("Число меньше необходимого");
                }
                else if (input==number){
                    text.setText("Вы победили");
                    result = 1;
                    button_exit.setVisible(true);
                    button.setVisible(false);
                }
                attempts++;
                if ((attempts==3)&&(result!=1)) {
                    text.setText("Вы проиграли");
                    button_exit.setVisible(true);
                    button.setVisible(false);
                }
            }
        };
        ActionListener actionListener2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        };
        button.addActionListener(actionListener);
        button_exit.addActionListener(actionListener2);
    }

}