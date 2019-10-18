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
import java.util.Comparator;

public class Library {

    private static ArrayList<Book> bookCollection = new ArrayList<>();
    private static class orderByAuthorComporator implements Comparator<Book> {

        @Override
        public int compare(Book book1, Book book2) {
            return book1.getAuthor().compareTo(book2.getAuthor());
        }

    }
    private static class orderByPublishingCompanyComporator implements Comparator<Book> {

        @Override
        public int compare(Book book1, Book book2) {
            return book1.getPublishingCompany().compareTo(book2.getPublishingCompany());
        }

    }

    public static void addBook(Book book) {
        bookCollection.add(book);
    }

    public static void addBooks(ArrayList<Book> books) {
        bookCollection.addAll(books);
    }

    public static ArrayList<Book> orderByAuthor() {

        bookCollection.sort(new orderByAuthorComporator());
        return bookCollection;

    }

    public static ArrayList<Book> orderByPublishing() {

        bookCollection.sort(new orderByPublishingCompanyComporator());
        return bookCollection;

    }

    public static ArrayList<Book> orderByAfterGivenYear(int Year) {

        ArrayList<Book> booksAfterGivenYear = new ArrayList<>();
        for (Book book : bookCollection) {
            if (book.getYear() > Year) booksAfterGivenYear.add(book);
        }

        return booksAfterGivenYear;

    }


}
