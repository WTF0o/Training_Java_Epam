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
import java.util.Collections;
import java.util.Comparator;

public class Store {

    private static ArrayList<Customer> storeCustomers = new ArrayList<>();

    private static class orderByNameComporator implements Comparator <Customer>{

        @Override
        public int compare(Customer customer1, Customer customer2) {

            return customer1.getName().compareTo(customer2.getName());

        }
    }

    private static class orderBySurnameComporator implements Comparator <Customer>{

        @Override
        public int compare(Customer customer1, Customer customer2) {

            return customer1.getSurname().compareTo(customer2.getSurname());

        }
    }

    private static class orderByPatronymicComporator implements Comparator <Customer>{

        @Override
        public int compare(Customer customer1, Customer customer2) {

            return customer1.getPatronymic().compareTo(customer2.getPatronymic());

        }
    }

    public static void addStoreCustomers(ArrayList<Customer> customers){

        storeCustomers.addAll(customers);

    }

    public static void addStoreCustomers(Customer customer){

        storeCustomers.add(customer);

    }

    public static ArrayList<Customer> orderByName(){

       orderByNameComporator NameComporator = new orderByNameComporator();
       Collections.sort(storeCustomers,NameComporator);
       return  storeCustomers;

    }

    public static ArrayList<Customer> orderBySurname(){

        orderBySurnameComporator SurnameComporator = new orderBySurnameComporator();
        Collections.sort(storeCustomers,SurnameComporator);
        return  storeCustomers;

    }

    public static ArrayList<Customer> orderByPatronymic(){

        orderByPatronymicComporator PatronymicComporator = new orderByPatronymicComporator();
        Collections.sort(storeCustomers,PatronymicComporator);
        return  storeCustomers;

    }

    public static ArrayList<Customer> getStoreCustomersByRangeNumberCard(int startRange,int endRange){

        ArrayList<Customer> storeCustomersRange = new ArrayList<>();
        for (Customer customer:storeCustomers) {

            if(customer.getNumberCard() >= startRange && customer.getNumberCard() <=endRange) storeCustomersRange.add(customer);

        }

        return storeCustomersRange;

    }


}
