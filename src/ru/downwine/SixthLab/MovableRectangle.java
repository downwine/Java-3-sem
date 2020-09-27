package ru.downwine.SixthLab;

public class MovableRectangle extends MovablePoint implements Movable {
    private final MovablePoint topLeft;
    private final MovablePoint bottomRight;

    public MovableRectangle (int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public boolean isBoth() {
        return topLeft.xSpeed == bottomRight.xSpeed && topLeft.ySpeed == bottomRight.ySpeed;
    }

    @Override
    public void moveUp() {
        if (isBoth()) {
            topLeft.moveUp();
            bottomRight.moveUp();
        }
    }

    @Override
    public void moveDown() {
        if (isBoth()) {
            topLeft.moveDown();
            bottomRight.moveDown();
        }
    }

    @Override
    public void moveLeft() {
        if (isBoth()) {
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }
    }

    @Override
    public void moveRight() {
        if (isBoth()) {
            topLeft.moveRight();
            bottomRight.moveRight();
        }
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft = " + topLeft +
                ", bottomRight = " + bottomRight +
                '}';
    }
}
