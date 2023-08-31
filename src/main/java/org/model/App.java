package org.model;

public class App {
    public static void main(String[] args) {

        Book alchemist = new Book("The Alchemist", "Paulo Coelho", true);
        Book daVinciCode = new Book("The Da Vinci Code", "Dan Brown", true);
        Book aTaleOfTwoCities = new Book("A Tale of Two Cities", "Charles Dickens", true);
        Book dreamTown = new Book("Dream Town", "David Baldacci", true);
        Book houseOfSkyAndBreath = new Book("House of Sky and Breath", "Sarah J. Maas", true);

        Person bassim = new Person(111, "Bassim", "Durzi");
        Person jacob = new Person(222, "Jacob", "Isaksson");


        bassim.loanBook(alchemist, bassim);
        jacob.loanBook(daVinciCode,jacob);
        bassim.loanBook(houseOfSkyAndBreath, bassim);

        bassim.displayBook();
        jacob.displayBook();

        alchemist.showPerson();
        daVinciCode.showPerson();
    }
}
