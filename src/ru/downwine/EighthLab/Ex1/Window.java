package ru.downwine.EighthLab.Ex1;

import java.awt.*; //импортируем всё содержимое пакетов
//обеспечивает взаимодействие программ на Java с графической подсистемой операционной системы
//позволяет графическим интерфейсам, написанным на Java задействовать графические возможности операционной системы и
//отображаться графическим объектам, созданным в программах Java, на экране монитора
import javax.swing.*;
//отвечает за формирование легковесных графических интерфейсов
//lightweight - кнопки, списки, деревья, метки, таблицы
//heavyweight - окна
//вместо import java.awt.Window; import javax.swing.JFrame;

public class Window extends JFrame {
    Shape r, o, c, s;
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
        for (int i = 0; i < 20; i++) {
            int k = (int) (Math.random() * 4);
            switch (k) {
                case 0: {
                    o = new Oval();
                    o.paintF(g);
                    break;
                }
                case 1: {
                    s = new Square();
                    s.paintF(g);
                    break;
                }
                case 2: {
                    r = new Rectangle();
                    r.paintF(g);
                    break;
                }
                case 3: {
                    c = new Circle();
                    c.paintF(g);
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
