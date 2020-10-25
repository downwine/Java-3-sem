package ru.downwine._3_ThirdLab.Ex3;

public class Book {
    private String author, title;
    private int year, pages;

    public Book(String author, String title, int year, int pages) {
        this.author = author;
        this.title = title;
        this.year = year;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book {" +
                "author = '" + author + '\'' +
                ", title = '" + title + '\'' +
                ", year = " + year +
                ", pages = " + pages +
                '}';
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public int getYear() {
        return year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
