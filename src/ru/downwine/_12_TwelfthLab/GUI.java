package ru.downwine._12_TwelfthLab;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame{
    public static double G = 6.67 * Math.pow(10, (-11));
    public GUI() {
        JFrame window = new JFrame("Это моё 8 окно, не судите строго");

        Label label1 = new Label("Выберите планету");
        label1.setBounds(30, 30, 320, 20);
        label1.setFont(new Font("Arial", Font.ITALIC, 20));
        label1.setBackground(new Color (162, 162, 208));
        window.add(label1);

        JComboBox planetBox = new JComboBox();
        planetBox.setEditable(true);
        planetBox.addItem("Меркурий");
        planetBox.addItem("Венера");
        planetBox.addItem("Земля");
        planetBox.addItem("Марс");
        planetBox.addItem("Юпитер");
        planetBox.addItem("Сатурн");
        planetBox.addItem("Уран");
        planetBox.addItem("Нептун");

        planetBox.setBounds(30, 60, 320, 40);
        window.add(planetBox);

        Label label2 = new Label("");
        label2.setBounds(30, 170, 320, 40);
        label2.setFont(new Font("Arial", Font.ITALIC, 15));
        label2.setBackground(new Color (162, 162, 208));
        window.add(label2);

        Label label3 = new Label("Притяжение выбранной планеты:");
        label3.setBounds(30, 140, 320, 40);
        label3.setFont(new Font("Arial", Font.ITALIC, 15));
        label3.setBackground(new Color (162, 162, 208));
        window.add(label3);

        planetBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (planetBox.getSelectedIndex() == 0) {
                    double res = G * Planets.Mercury.mass / (Planets.Mercury.radius * Planets.Mercury.radius);
                    String str = Double.toString(res);
                    label2.setText(str + " кг/с^2");
                }
                else if (planetBox.getSelectedIndex() == 1) {
                    double res = G * Planets.Venus.mass / (Planets.Venus.radius * Planets.Venus.radius);
                    String str = Double.toString(res);
                    label2.setText(str + " кг/с^2");
                }
                else if (planetBox.getSelectedIndex() == 2) {
                    double res = G * Planets.Earth.mass / (Planets.Earth.radius * Planets.Earth.radius);
                    String str = Double.toString(res);
                    label2.setText(str + " кг/с^2");
                }
                else if (planetBox.getSelectedIndex() == 3) {
                    double res = G * Planets.Mars.mass / (Planets.Mars.radius * Planets.Mars.radius);
                    String str = Double.toString(res);
                    label2.setText(str + " кг/с^2");
                }
                else if (planetBox.getSelectedIndex() == 4) {
                    double res = G * Planets.Jupiter.mass / (Planets.Jupiter.radius * Planets.Jupiter.radius);
                    String str = Double.toString(res);
                    label2.setText(str + " кг/с^2");
                }
                else if (planetBox.getSelectedIndex() == 5) {
                    double res = G * Planets.Saturn.mass / (Planets.Saturn.radius * Planets.Saturn.radius);
                    String str = Double.toString(res);
                    label2.setText(str + " кг/с^2");
                }
                else if (planetBox.getSelectedIndex() == 6) {
                    double res = G * Planets.Uranus.mass / (Planets.Uranus.radius * Planets.Uranus.radius);
                    String str = Double.toString(res);
                    label2.setText(str + " кг/с^2");
                }
                else if (planetBox.getSelectedIndex() == 7) {
                    double res = G * Planets.Neptune.mass / (Planets.Neptune.radius * Planets.Neptune.radius);
                    String str = Double.toString(res);
                    label2.setText(str + " кг/с^2");
                }

            }
        });

        window.setSize(400,300);
        window.setLayout(null);
        window.setVisible(true);
        window.setLocationRelativeTo(null);
        window.getContentPane().setBackground(new Color (162, 162, 208));
    }

}
