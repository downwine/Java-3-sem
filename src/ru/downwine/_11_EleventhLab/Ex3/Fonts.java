package ru.downwine._11_EleventhLab.Ex3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fonts extends JFrame {
    public Fonts() {
        JFrame window = new JFrame("Это моё 7 окно, не судите строго");

        Label label1 = new Label("Выберите шрифт");
        label1.setBounds(70, 40, 360, 20);
        label1.setFont(new Font("Arial", Font.ITALIC, 15));
        window.add(label1);

        JComboBox fontBox = new JComboBox();
        fontBox.setEditable(true);
        fontBox.addItem("Times New Roman");
        fontBox.addItem("MS Sans Serif");
        fontBox.addItem("Courier New");
        fontBox.setBounds(70, 70, 360, 40);
        window.add(fontBox);

        Label label2 = new Label("Выберите цвет");
        label2.setBounds(70, 120, 360, 20);
        label2.setFont(new Font("Arial", Font.ITALIC, 15));
        window.add(label2);

        JComboBox colorBox = new JComboBox();
        colorBox.setEditable(true);
        colorBox.addItem("Blue");
        colorBox.addItem("Red");
        colorBox.addItem("Black");
        colorBox.setBounds(70, 150, 360, 40);
        window.add(colorBox);

        JTextArea text = new JTextArea("Здесь могла быть ваша реклама", 2, 3);
        text.setFont(new Font("Arial", Font.PLAIN, 20));
        text.setForeground(Color.BLUE);
        text.setBounds(70, 220, 360, 40);

        fontBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (fontBox.getSelectedIndex() == 0) {
                    text.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                }
                else if (fontBox.getSelectedIndex() == 1) {
                    text.setFont(new Font("MS Sans Serif", Font.PLAIN, 20));
                }
                else if (fontBox.getSelectedIndex() == 2) {
                    text.setFont(new Font("Courier New", Font.PLAIN, 20));
                }
            }
        });

        colorBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (colorBox.getSelectedIndex() == 0) {
                    text.setForeground(Color.BLUE);
                }
                else if (colorBox.getSelectedIndex() == 1) {
                    text.setForeground(Color.RED);
                }
                else if (colorBox.getSelectedIndex() == 2) {
                    text.setForeground(Color.BLACK);
                }
            }
        });
        window.add(text);
        window.setSize(500,340);
        window.setLayout(null);
        window.getContentPane().setBackground(new Color(176, 196, 222));
        window.setVisible(true);
        window.setLocationRelativeTo(null);
    }
}
