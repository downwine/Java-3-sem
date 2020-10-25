package ru.downwine._9_NinthLab;

import java.awt.event.*;

public class Mouse implements MouseListener {
    Window4 w;

    Mouse(Window4 w) {
        this.w = w;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        w.paint(w.getGraphics());
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
    }
}
