package ru.downwine._11_EleventhLab.Ex2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame {
    public App() {
        JFrame window = new JFrame("Это моё 6 окно, не судите строго");

        JPanel myPanel = new JPanel();
        myPanel.setLayout(new BorderLayout());

        JButton northButton = new JButton("NORTH");
        myPanel.add(northButton, BorderLayout.NORTH);
        northButton.setBackground(Color.cyan);
        northButton.setPreferredSize(new Dimension(120,120));

        JButton southButton = new JButton("SOUTH");
        myPanel.add(southButton, BorderLayout.SOUTH);
        southButton.setBackground(Color.orange);
        southButton.setPreferredSize(new Dimension(120,120));

        JButton eastButton = new JButton("EAST");
        myPanel.add(eastButton, BorderLayout.EAST);
        eastButton.setBackground(Color.green);
        eastButton.setPreferredSize(new Dimension(120, 120));

        JButton westButton = new JButton("WEST");
        myPanel.add(westButton, BorderLayout.WEST);
        westButton.setBackground(Color.pink);
        westButton.setPreferredSize(new Dimension(120, 120));

        JButton centerButton = new JButton("CENTER");
        myPanel.add(centerButton, BorderLayout.CENTER);
        centerButton.setBackground(Color.yellow);

        window.getContentPane().add(myPanel);
        window.setPreferredSize(new Dimension(900, 600));

        window.pack();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.setLocationRelativeTo(null);

        ActionListener actionListenerCenter = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(window, "Добро пожаловать в ЦАО", "Диалоговое окно", JOptionPane.DEFAULT_OPTION);
            }
        };
        ActionListener actionListenerNorth = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(window, "Добро пожаловать в САО", "Диалоговое окно", JOptionPane.DEFAULT_OPTION);
            }
        };
        ActionListener actionListenerSouth = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(window, "Добро пожаловать в ЮАО", "Диалоговое окно", JOptionPane.DEFAULT_OPTION);
            }
        };
        ActionListener actionListenerEast = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(window, "Добро пожаловать в ВАО", "Диалоговое окно", JOptionPane.DEFAULT_OPTION);
            }
        };
        ActionListener actionListenerWest = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(window, "Добро пожаловать в ЗАО", "Диалоговое окно", JOptionPane.DEFAULT_OPTION);
            }
        };

        centerButton.addActionListener(actionListenerCenter);
        northButton.addActionListener(actionListenerNorth);
        southButton.addActionListener(actionListenerSouth);
        eastButton.addActionListener(actionListenerEast);
        westButton.addActionListener(actionListenerWest);
    }
}