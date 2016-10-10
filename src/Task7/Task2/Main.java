package Task7.Task2;

import java.util.*;

/**
 * Created by asevruk on 10/6/2016.
 */
public class Main {
    public static void main(String[] args) {

        decreaseSortByOrder(createlist());
        increaseSortByOrderAndCitySort(createlist());
        sortListByOrderItemNameAndShopIdentificatorAndUserCity(createlist());
        deleteDublicate(createlist());
        deleteItemsWherePriceLess1500(createlist());
        separateList(createlist());


    }


    private static void separateList(List list) {
        List<Order> newlist = new ArrayList<>();
        Iterator<Order> iterator = list.iterator();
        while
                (iterator.hasNext()) {

            Order order = iterator.next();

            if (order.getCurrency().equals(Currency.EUR)) {
                newlist.add(order);
                iterator.remove();

            }

        }
        System.out.println(list.size());
        System.out.println(list);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println(newlist.size());
        System.out.println(newlist);


    }

    private static void deleteItemsWherePriceLess1500(List list) {

        Iterator<Order> iterator = list.iterator();


        while
                (iterator.hasNext()) {
            int price = iterator.next().getPrice();
            if (price < 1500) {
                iterator.remove();
            }

        }


        System.out.println(list);
    }


    private static void deleteDublicate(List createlist) {
        System.out.println(createlist.size());

        Set<Order> set = new HashSet<>();


        Iterator<Order> iterator = createlist.iterator();

        while (iterator.hasNext()) {
            set.add(iterator.next());
        }
        System.out.println(set.size());
        System.out.println(set);
    }

    private static void sortListByOrderItemNameAndShopIdentificatorAndUserCity(List list) {
        Comparator<Order> comp = new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                if (o1.getItemName().compareTo(o2.getItemName()) == 0) {
                    if (o1.getShopIdentificator().compareTo(o2.getShopIdentificator()) == 0) {
                        return o1.getUser().getCity().compareTo(o2.getUser().getCity());
                    }
                    return o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
                }
                return o1.getItemName().compareTo(o2.getItemName());
            }
        };
        list.sort(comp);
        System.out.println(list);
    }

    private static void increaseSortByOrderAndCitySort(List list) {
        Comparator<Order> comp = new Comparator<Order>() {

            @Override
            public int compare(Order o1, Order o2) {
                if (o1.getPrice() - o2.getPrice() == 0) {
                    return o1.getUser().getCity().compareTo(o2.getUser().getCity());

                }
                return o1.getPrice() - o2.getPrice();
            }
        };
        list.sort(comp);
        System.out.println(list);

    }


    private static void decreaseSortByOrder(List list) {

        Comparator<Order> comp = new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return o2.getPrice() - o1.getPrice();

            }
        };

        list.sort(comp);
        System.out.println(list);
    }


    private static List createlist() {

        List<Order> list = new ArrayList<Order>();

        Order o1 = new Order(0, 0, Currency.EUR, "a", "a", new User(1, "andrey", "sevruk", "b", 200));
        Order o2 = new Order(0, 0, Currency.EUR, "a", "a", new User(1, "andrey", "sevruk", "b", 200));
        Order o3 = new Order(0, 0, Currency.EUR, "a", "a", new User(1, "andrey", "sevruk", "b", 200));
        Order o4 = new Order(4, 400, Currency.EUR, "d", "b", new User(4, "andrey", "sevruk", "kiev", 200));
        Order o5 = new Order(5, 500, Currency.EUR, "f", "b", new User(5, "andrey", "sevruk", "kiev", 200));
        Order o6 = new Order(6, 600, Currency.EUR, "g", "b", new User(1, "andrey", "sevruk", "kiev", 200));
        Order o7 = new Order(7, 700, Currency.EUR, "c", "b", new User(2, "andrey", "sevruk", "kiev", 200));
        Order o8 = new Order(8, 800, Currency.USD, "a", "b", new User(3, "andrey", "sevruk", "kiev", 200));
        Order o9 = new Order(9, 900, Currency.EUR, "aa12aa", "b", new User(4, "andrey", "sevruk", "kiev", 200));
        Order o10 = new Order(10, 1500, Currency.USD, "aaaaa12a", "b", new User(5, "andrey", "sevruk", "kiev", 200));

        list.add(o1);
        list.add(o2);
        list.add(o3);
        list.add(o4);
        list.add(o5);
        list.add(o6);
        list.add(o7);
        list.add(o8);
        list.add(o9);
        list.add(o10);
        return list;

    }


}
