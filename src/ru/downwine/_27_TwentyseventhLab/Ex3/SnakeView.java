package ru.downwine._27_TwentyseventhLab.Ex3;

import java.awt.*;
import javax.swing.*;
import java.util.Random;

public class SnakeView extends JFrame {
    private final Snake snake;
    private final SnakeController snakeController;
    public JPanel panel;
    public JButton bonusFruit;
    public Fruits fruit;
    public Random random = new Random();
    public JButton[] ButtonBody = new JButton[500];
    private final int WIDTH = 1000;
    private final int HEIGHT = 600;

    SnakeView(SnakeController snakeController) {
        super("Snake");
        setBounds(200, 160, 1000, 600);
        this.snakeController = snakeController;
        snake = snakeController.getSnake();
        fruit = new Fruits();
        panel = new JPanel();
        bonusFruit = new JButton();
        bonusFruit.setBackground(Color.RED);
        bonusFruit.setEnabled(false);
        createFirstSnake();
        panel.setLayout(null);
        panel.setBounds(0, 0, WIDTH, HEIGHT);
        panel.setBackground(new Color(234, 219, 184));
        getContentPane().setLayout(null);
        getContentPane().add(panel);
        show();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void createFirstSnake() {
        for (int i = 0; i < 3; i++) {
            ButtonBody[i] = new JButton("" + i);
            ButtonBody[i].setEnabled(false);
            ButtonBody[i].setBackground(new Color (72, 189, 249));
            panel.add(ButtonBody[i]);
            ButtonBody[i].setBounds(snake.x[i], snake.y[i], 10, 10);
            snake.x[i + 1] = snake.x[i] - 10;
            snake.y[i + 1] = snake.y[i];
        }
    }

    void growUp() {
        ButtonBody[snake.getLength()] = new JButton(" " + snake.getLength());
        ButtonBody[snake.getLength()].setEnabled(false);
        ButtonBody[snake.getLength()].setBackground(new Color (72, 189, 249));
        panel.add(ButtonBody[snake.getLength()]);
        ButtonBody[snake.getLength()].setBounds(snake.getPointBody()[snake.getLength() - 1].x, snake.getPointBody()[snake.getLength() - 1].y, 10, 10);
        snake.setLength(snake.getLength() + 1);
    }

    void moveForward() {
        for (int i = 0; i < snake.getLength(); i++) {
            snake.getPointBody()[i] = ButtonBody[i].getLocation();
        }
        snake.x[0] += snake.getDirectionX();
        snake.y[0] += snake.getDirectionY();
        ButtonBody[0].setBounds(snake.x[0], snake.y[0], 10, 10);

        for (int i = 1; i < snake.getLength(); i++) {
            ButtonBody[i].setLocation(snake.getPointBody()[i - 1]);
        }
        if (snake.x[0] == WIDTH)
            snakeController.stopGame();
        else if (snake.x[0] == 0)
            snakeController.stopGame();
        else if (snake.y[0] == HEIGHT)
            snakeController.stopGame();
        else if (snake.y[0] == 0)
            snakeController.stopGame();

        createFruit();
        collisionFruit();
        panel.repaint();
    }

    private void collisionFruit() {
        if (fruit.isFood()) {
            if (fruit.getPoint().x == snake.x[0] && fruit.getPoint().y == snake.y[0]) {
                panel.remove(bonusFruit);
                growUp();
                fruit.setFood(false);
            }
        }
    }

    private void createFruit() {
        if (!fruit.isFood()) {
            panel.add(bonusFruit);
            bonusFruit.setBounds((10 * random.nextInt(49)), (10 * random.nextInt(24)), 10, 10);
            fruit.setPoint(bonusFruit.getLocation());
            fruit.setFood(true);
        }
    }

}
