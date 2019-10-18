package epam.Training_Java_Epam.Programming_with_classes.Simple_Class.Task8;

/*
8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
и методами. Задать критерии выбора данных и вывести эти данные на консоль.
Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
Найти и вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */

import java.util.ArrayList;

public class Task8 {

    public static void main(String[] args) {

        ArrayList <Customer> customers = new ArrayList<>();
        int i = 0;
        String[] surname = {"Ivanov","Rama","Baranov"};
        String[] name = {"Alexey","Sergey","Dima"};
        String[] pathornymic = {"Alexandrovich","Vladimirovich","Mikhailovich"};
        String[] city = {"Moskow","Gomel","Brest"};

        Customer customer1 = new Customer(
                (int)(Math.random() * 100),
                surname[(int) (Math.random() * surname.length)],
                name[(int) (Math.random() * name.length)],
                pathornymic[(int) (Math.random() * pathornymic.length)],
                city[(int) (Math.random() * pathornymic.length)],
                (int)(Math.random() * 100),
                (int)(Math.random() * 100));

        Customer customer2 = new Customer(
                (int)(Math.random() * 100),
                surname[(int) (Math.random() * surname.length)],
                name[(int) (Math.random() * name.length)],
                pathornymic[(int) (Math.random() * pathornymic.length)],
                city[(int) (Math.random() * pathornymic.length)],
                (int)(Math.random() * 100),
                (int)(Math.random() * 100));

        Customer customer3 = new Customer(
                (int)(Math.random() * 100),
                surname[(int) (Math.random() * surname.length)],
                name[(int) (Math.random() * name.length)],
                pathornymic[(int) (Math.random() * pathornymic.length)],
                city[(int) (Math.random() * pathornymic.length)],
                (int)(Math.random() * 100),
                (int)(Math.random() * 100));

        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);


        System.out.println("Customers: ");
        customers.forEach(customer -> System.out.println(customer.toString()));

        Store.addStoreCustomers(customers);
        System.out.println("Sorted by name: ");
        Store.orderByName().forEach(customer -> System.out.println(customer.toString()));

        System.out.println("Sorted by surname: ");
        Store.orderBySurname().forEach(customer -> System.out.println(customer.toString()));

        System.out.println("Sorted by number: ");
        Store.getStoreCustomersByRangeNumberCard(50,100).forEach(customer -> System.out.println(customer.toString()));

    }

}
