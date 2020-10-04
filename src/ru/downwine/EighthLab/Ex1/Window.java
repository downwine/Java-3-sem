package ru.downwine.EighthLab.Ex1;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    public Window() {
        MyPanel mp = new MyPanel();
        Container cont = getContentPane();
        cont.add(mp);
        setBounds(0, 0, 1800, 1000);
        setTitle("Это моё первое окно, не судите строго");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Window window = new Window();
        window.setVisible(true);
    }
}
/*import java.awt.*; //импортируем всё содержимое пакетов
//обеспечивает взаимодействие программ на Java с графической подсистемой операционной системы
//позволяет графическим интерфейсам, написанным на Java задействовать графические возможности операционной системы и
//отображаться графическим объектам, созданным в программах Java, на экране монитора
import javax.swing.*;
//отвечает за формирование легковесных графических интерфейсов
//lightweight - кнопки, списки, деревья, метки, таблицы
//heavyweight - окна
//вместо import java.awt.Window; import javax.swing.JFrame;
import java.awt.event.*;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

public class Window extends JFrame {
    Rectangle r;
    Oval o;
    Circle c;
    Square s;
    //В классе JFrame определены основные свойства и поведение «стандартных» графических окон
    public Window () {
        setTitle ("Это моё первое окно, не судите строго"); //Название вверху окна
        setSize (new Dimension (700, 600)); //Устанавливаем размер окна
        Dimension sSize = Toolkit.getDefaultToolkit ().getScreenSize (), fSize = getSize (); //Узнали разрешение экрана
        if (fSize.height > sSize.height) {
            fSize.height = sSize.height;
        }
        if (fSize.width > sSize.width) {
            fSize.width = sSize.width;
        } //Рассчитываем координаты верхнего левого угла
        setLocation ((sSize.width - fSize.width)/2,(sSize.height - fSize.height)/2); //Центровка окна
        setDefaultCloseOperation (EXIT_ON_CLOSE); //При закрытии окна в системном меню приложение завершает работу
        setVisible (true); //Делаем окно видимым
    }

    public void paint(Graphics g) {
        Shape o = new Oval();
        Shape s = new Square();
        Shape r = new Rectangle();
        Shape c = new Circle();
        for (int i = 0; i < 20; i++) {
            int k = (int) (Math.random() * 4);
            switch(k) {
                case 0: {
                    o.paint(g);
                    break;
                }
                case 1: {
                    s.paint(g);
                    break;
                }
                case 2: {
                    r.paint(g);
                    break;
                }
                case 3: {
                    c.paint(g);
                    break;
                }
            }
        }
    }

    public static void main (String [] args) {
        try { UIManager.setLookAndFeel (UIManager.getSystemLookAndFeelClassName ()); }
        catch (Exception lfe) {}
        //Теперь внешний вид окна соответствовует стандарту, принятому в конкретной операционной системе
        Window w = new Window(); //Создание окна

    }
}
*/
