package ru.downwine.EighthLab.Ex2;

import javax.imageio.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class Window2 extends JFrame {
    Image image;
    String a;

    Window2(String a){
        this.a = a;
        try {
            image = ImageIO.read(new File(a));
        } catch (IOException e) {
            e.printStackTrace();
        }
        setBounds(0,0,image.getHeight(null),image.getWidth(null));
        setTitle ("Это моё второе окно, не судите строго");
        Container container = getContentPane();
        container.setLayout(new GridLayout());
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        if(image!=null) {
            g.drawImage(image, 0, 0, null);
        }
    }
    public static void main(String[] args) {
        new Window2(args[0]); //C:\Право\Скан_20200516.jpg
    }

}
