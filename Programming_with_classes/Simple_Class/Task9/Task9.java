package epam.Training_Java_Epam.Programming_with_classes.Simple_Class.Task9;

/*
9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.
Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
Найти и вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.
 */

import java.util.ArrayList;

public class Task9 {

    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Clean Architecture","Robert Martin","Prentice Hall",2008));
        books.add(new Book("Head First Java","Kathy Sierra","O'Reilly Media",2005));
        books.add(new Book("Herding Cats: A Primer for Programmers Who Lead Programmers","Rainwater","Apress",2002));
        books.add(new Book("Code complete","Steven C. McConnell","Microsoft Press",2004));
        Library.addBooks(books);

        System.out.println("Books: ");
        books.forEach(book -> System.out.println(book.toString()));

        System.out.println("Order by book after 2002: ");
        books = Library.orderByAfterGivenYear(2002);
        books.forEach(book -> System.out.println(book.toString()));

        System.out.println("Order by book autor: ");
        books = Library.orderByAuthor();
        books.forEach(book -> System.out.println(book.toString()));

        System.out.println("Order by book publishing company: ");
        books = Library.orderByPublishing();
        books.forEach(book -> System.out.println(book.toString()));


    }

}
