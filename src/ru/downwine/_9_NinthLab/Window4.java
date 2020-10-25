package ru.downwine._9_NinthLab;

import ru.downwine._8_EighthLab.Ex1.Circle;
import ru.downwine._8_EighthLab.Ex1.Oval;
import ru.downwine._8_EighthLab.Ex1.Rectangle;
import ru.downwine._8_EighthLab.Ex1.Square;

import javax.swing.*;
import java.awt.*;

public class Window4 extends JFrame {
    JButton but;

    public Window4 () {
        setTitle ("Это моё четвёртое окно, не судите строго");
        setSize (new Dimension (700, 600));
        Dimension sSize = Toolkit.getDefaultToolkit ().getScreenSize (), fSize = getSize ();
        if (fSize.height > sSize.height) {
            fSize.height = sSize.height;
        }
        if (fSize.width > sSize.width) {
            fSize.width = sSize.width;
        }
        but = new JButton("Create figure");
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        but.setSize(100, 20);
        container.add(but);
        but.addMouseListener(new Mouse(this));
        setLocation ((sSize.width - fSize.width)/2,(sSize.height - fSize.height)/2);
        setDefaultCloseOperation (EXIT_ON_CLOSE);
        setVisible (true);
    }

    public void paint(Graphics g) {
        int k = (int) (Math.random() * 4);
        switch (k) {
            case 0: {
                Oval o = new Oval();
                o.paintF(g);
                break;
            }
            case 1: {
                Square s = new Square();
                s.paintF(g);
                break;
            }
            case 2: {
                Rectangle r = new Rectangle();
                r.paintF(g);
                break;
            }
            case 3: {
                Circle c = new Circle();
                c.paintF(g);
                break;
            }
        }
    }

    public static void main (String [] args) {
        try { UIManager.setLookAndFeel (UIManager.getSystemLookAndFeelClassName ()); }
        catch (Exception lfe) {}
        Window4 w = new Window4();
    }

}
