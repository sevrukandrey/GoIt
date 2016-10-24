package Task7.Task2;

import java.util.*;

/**
 * Created by asevruk on 10/6/2016.
 */


//????? ? ??????????? ??? ???? ??? ?? ??????? ???? ?????????? ?? ?????? ????????, ???? ??? ????? ?? ?? ??????? ???????? ? ??.
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
        List<Order> newList = new ArrayList<>();
        Iterator<Order> iterator = list.iterator();
        while
                (iterator.hasNext()) {

            Order order = iterator.next();

            if (order.getCurrency().equals(Currency.EUR)) {
                newList.add(order);
                iterator.remove();

            }

        }
        System.out.println("Separete list on two");
        System.out.println("USD list");
        System.out.println(list);
        System.out.println("EUR list");
        System.out.println(newList);


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


        System.out.println("Delete items where  Price less than 1500");
        System.out.println(list);
        System.out.println("-----------------------------------------------------------------");
    }


    private static void deleteDublicate(List createlist) {
        Set<Order> set = new HashSet<>();
        Iterator<Order> iterator = createlist.iterator();

        while (iterator.hasNext()) {
            set.add(iterator.next());
        }
        System.out.println("Delete dublicates");
        System.out.println(set);
        System.out.println("-----------------------------------------------------------------");
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

        System.out.println("Sort list by order and name and id");
        System.out.println(list);
        System.out.println("-----------------------------------------------------------------");
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
        System.out.println("Sort by order and city");
        System.out.println(list);
        System.out.println("-----------------------------------------------------------------");

    }


    private static void decreaseSortByOrder(List list) {

        Comparator<Order> comp = new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return o2.getPrice() - o1.getPrice();

            }
        };

        list.sort(comp);
        System.out.println("decrease Sort By Order");
        System.out.println(list);
        System.out.println("-----------------------------------------------------------------");
    }


    private static List createlist() {

        List<Order> list = new ArrayList<Order>();

        list.add(new Order(110, 0, Currency.EUR, "a", "a", new User(1, "andrey", "sevruk", "b", 200)));
        list.add(new Order(120, 0, Currency.EUR, "a", "a", new User(1, "andrey", "sevruk", "b", 200)));
        list.add( new Order(140, 0, Currency.EUR, "a", "a", new User(1, "andrey", "sevruk", "b", 200)));
        list.add(new Order(5, 500, Currency.EUR, "f", "b", new User(5, "andrey", "sevruk", "kiev", 200)));
        list.add(new Order(7, 700, Currency.EUR, "c", "b", new User(2, "andrey", "sevruk", "kiev", 200)));
        list.add(new Order(8, 800, Currency.USD, "a", "b", new User(3, "andrey", "sevruk", "kiev", 200)));
        list.add(new Order(9, 900, Currency.EUR, "aa12aa", "b", new User(4, "andrey", "sevruk", "kiev", 200)));
        list.add(new Order(10, 1500, Currency.USD, "aaaaa12a", "b", new User(5, "andrey", "sevruk", "kiev", 200)));

        return list;

    }


}
