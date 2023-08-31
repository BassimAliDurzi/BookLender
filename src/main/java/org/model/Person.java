package org.model;

public class Person {
    private int personID;
    private String firstName;
    private String lastName;
    private Book borrowedBook;
    Book[] borrowedBookList = new Book[5];

    public Person(int personID, String firstName, String lastName) {
        this.personID = personID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int personID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public String firstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String lastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    //Execute loan a book.
    public void loanBook(Book book, Person Person) {
        if (!book.isAvailable())
            throw new IllegalArgumentException("This Book '" + book.title() + "' has been borrowed.");
        this.borrowedBook = book;
        changeStatusToNotAvailable();
        updateBorrowedBookList();
        book.setPerson(Person);
    }

    public boolean changeStatusToNotAvailable() {
        borrowedBook.setAvailable(false);
        return false;
    }

    public Book[] updateBorrowedBookList() {
        for (int i = 0; i < borrowedBookList.length; i++) {
            if (borrowedBookList[i] == null) {
                borrowedBookList[i] = borrowedBook;
                break;
            }
        }
        return borrowedBookList;
    }
    public void displayBook() {
        System.out.println("-----------------------------------------------");
        System.out.println("The books which '" + firstName + " " + lastName + "' has borrowed:");
        for (int i = 0; i < borrowedBookList.length; i++) {
            if (borrowedBookList[i] != null) {
                System.out.println("Book " + (i + 1) +": " + borrowedBookList[i].title() + ", Author: " + borrowedBookList[i].author());
            }
        }
    }

    @Override
    public String toString() {
        return "Person {" +
                "Person ID: " + personID +
                ", First Name: '" + firstName + '\'' +
                ", Last Name: '" + lastName + '\'' +
                '}';
    }
}
