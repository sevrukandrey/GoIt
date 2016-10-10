package Task7.Task3;


import Task7.Task2.Currency;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by asevruk on 10/10/2016.
 */
public class Main {
    public static void main(String[] args) {

        largestPrice(createlist());
        deleteOrdersWithUsd(createlist());

        System.out.println("User is exist? " + findBySurname(createlist(), "Petrov"));


    }
   private static void deleteOrdersWithUsd(Set<Order> set) {


        Iterator<Order> iterator= set.iterator();

       while (iterator.hasNext()){
       Order order = iterator.next();
           if (order.getCurrency().equals(Currency.USD)){
                iterator.remove();
            }
        }
        System.out.println(set);
    }


    private static void largestPrice(Set<Order> createlist) {
        int price = 0;

        for (Order ord : createlist) {
            if (ord.getPrice() > price) {
                price = ord.getPrice();
            }
        }
        for (Order ord : createlist) {
            if (ord.getPrice() == price) {
                System.out.println(ord);
            }
        }


    }
    private static boolean findBySurname(Set<Order> list, String surmane) {
        Iterator<Order> iterator = list.iterator();
        int count = 0;
        while (iterator.hasNext()){
            Order order = iterator.next();
            if (order.getUser().getLastName().equals(surmane)){
                count++;
            }
        }
        if (count> 0)
                return true;
        return false;
    }


    private static Set<Order> createlist() {

        Set<Order> set = new TreeSet<>();
        set.add(new Order(0, 100, Currency.USD, "a", "a", new User(1, "andrey", "Petrov", "b", 200)));
        set.add(new Order(1, 1, Task7.Task2.Currency.EUR, "b", "a", new User(1, "andrey", "sevruk", "b", 200)));
        set.add(new Order(2, 2, Task7.Task2.Currency.EUR, "c", "a", new User(1, "andrey", "sevruk", "b", 200)));
        set.add(new Order(3, 3, Currency.USD, "d", "a", new User(1, "andrey", "sevruk", "b", 200)));
        set.add(new Order(4, 4123, Task7.Task2.Currency.EUR, "aa", "a", new User(1, "andrey", "sevruk", "b", 200)));
        set.add(new Order(5, 5, Task7.Task2.Currency.EUR, "aaa", "a", new User(1, "andrey", "sevruk", "b", 200)));
        set.add(new Order(6, 3333336, Task7.Task2.Currency.EUR, "aaaa", "a", new User(1, "andrey", "sevruk", "b", 200)));
        set.add(new Order(7, 7, Task7.Task2.Currency.EUR, "aaaaa", "a", new User(1, "andrey", "sevruk", "b", 200)));
        set.add(new Order(0, 0, Task7.Task2.Currency.EUR, "a", "a", new User(1, "andrey", "sevruk", "b", 200)));
        set.add(new Order(0, 11110, Task7.Task2.Currency.USD, "a", "a", new User(1, "andrey", "sevruk", "b", 200)));
        return set;
    }
}