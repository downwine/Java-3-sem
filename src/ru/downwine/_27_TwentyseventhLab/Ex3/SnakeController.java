package ru.downwine._27_TwentyseventhLab.Ex3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Timer;

public class SnakeController implements KeyListener, ActionListener {
    private final SnakeView snakeView;
    private final Timer timer;
    private final Snake snake;

    public SnakeController() {
        snake = new Snake();
        snakeView = new SnakeView(this);
        this.snakeView.addKeyListener(this);
        this.timer = new Timer(200, this);
        startGame();
    }

    public void stopGame() {
        timer.stop();
    }

    public void startGame() {
        timer.start();
    }

    public void keyPressed(KeyEvent e) {
        snake.onMove(e.getKeyCode());
    }

    public void keyReleased(KeyEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void actionPerformed(ActionEvent arg) {
        snakeView.moveForward();
    }

    public Snake getSnake() {
        return snake;
    }
}
