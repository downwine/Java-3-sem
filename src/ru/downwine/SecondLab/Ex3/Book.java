package ru.downwine.SecondLab.Ex3;

public class Book {
    private String author, color, title;
    private int width, height, pages;
    public Book(String author, String color, String title, int width, int height, int pages)
    {
        setAuthor(author);
        setColor(color);
        setHeight(height);
        setTitle(title);
        setWidth(width);
        setPages(pages);
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String getTitle() {
        return title;
    }

    public String getColor() {
        return color;
    }
    @Override
    public String toString() {
        return "Book {" +
                "author = '" + author + '\'' +
                ", color = '" + color + '\'' +
                ", title = '" + title + '\'' +
                ", width = " + width +
                ", height = " + height +
                ", pages = " + pages +
                '}';
    }
}
