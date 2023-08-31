package org.model;

public class Book {
    private String title;
    private String author;
    private boolean available = true;
    private Person person;


    public Book(String title, String author, boolean available) {
        this.title = title;
        this.author = author;
        this.available = available;
    }

    public String title() {
        return title;
    }

    public String author() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    public Person showPerson() {
        System.out.println("-----------------------------------------------");
        System.out.println("This book (" + title + ", " + author + ") was borrowed by:");
        System.out.println(person.firstName() + " " + person.lastName());
        return this.person = person;
    }
    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Book {" +
                "Title: '" + title + '\'' +
                ", Author:'" + author + '\'' +
                ", Available: " + available +
                '}';
    }
}
