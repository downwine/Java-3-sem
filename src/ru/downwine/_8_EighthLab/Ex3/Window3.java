package ru.downwine._8_EighthLab.Ex3;

import javax.imageio.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class Window3 extends JFrame {
    Image image;
    String a;

    Window3(String a) {
        this.a = a;
        try {
            image = ImageIO.read(new File(a));
        } catch (IOException e) {
            e.printStackTrace();
        }
        setSize (new Dimension (300, 160));
        Dimension sSize = Toolkit.getDefaultToolkit ().getScreenSize (), fSize = getSize ();
        if (fSize.height > sSize.height) {
            fSize.height = sSize.height;
        }
        if (fSize.width > sSize.width) {
            fSize.width = sSize.width;
        }
        setLocation ((sSize.width - fSize.width)/2,(sSize.height - fSize.height)/2);
        setTitle ("Это моё третье окно, не судите строго");
        Container container = getContentPane();
        container.setLayout(new GridLayout());
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void selectPicture(String abcArg) {
        try {
            image = ImageIO.read(new File(abcArg));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void paint(Graphics g) {
        if (image != null) {
            g.drawImage(image, 0, 0, null);
        }
    }

    public static void main(String[] args) {
        Animation animation = new Animation(args);
        animation.run();
    }
}
