package Task9;




import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

       //sortListByPrice(createlist());
       // sortListInIncreaseAndCity(createlist());
       // sortListByNameByIdByCity(createlist());
        
        //deleteDublicate(createlist());
        //deleteByPrice(createlist());
       // separetaListOnTwoList(createlist());
        
        //separetaListOnMany(createlist());
        //System.out.println(isSetContainsName(createset()));
        System.out.println(deleteOrdersFromSet(createset())); ;


    }

    private static Set<Order> deleteOrdersFromSet(Set<Order> createset) {
        createset = createset.stream().filter((p)-> p.getCurrency().equals(Currency.EUR)).collect(Collectors.toSet());
        return createset;
    }

    private static boolean isSetContainsName(Set<Order> createset) {
        System.out.println(createset);

        return createset.stream().anyMatch(p->p.getUser().getFirstName().contains("1"));

    }


    private static Set createset() {
        Set<Order> set = new HashSet<>();
        set.add(new Order(0, 0,Currency.USD , "b", "a", new User(1, "1", "1", "b", 200)));



        set.add(new Order(0, 0, Currency.USD, "a", "a", new User(1, "1", "1", "b", 200)));
        set.add(new Order(0, 0, Currency.USD, "c", "a", new User(1, "1", "1", "b", 200)));
        set.add(new Order(0, 0, Currency.USD, "d", "a", new User(1, "1", "1", "b", 200)));
       // set.add(new Order(2, 0, Currency.USD, "c", "a", new User(1, "andrey", "Petrov", "b", 200)));
       // set.add(new Order(3, 0, Currency.USD, "c", "a", new User(1, "andrey", "Petrov", "b", 200)));
        return  set;
    }

    private static void separetaListOnMany(List<Order> createlist) {

    }

    private static void separetaListOnTwoList(List<Order> createlist) {
        List<Order> usdlist = createlist.stream().filter((p)-> p.getCurrency().equals(Currency.USD)).collect(Collectors.toList());
        List<Order> eurlist = createlist.stream().filter((p)-> p.getCurrency().equals(Currency.EUR)).collect(Collectors.toList());

        System.out.println(usdlist);
        System.out.println("---------------------------------------------------------------------------");
        System.out.println(eurlist);
    }

    private static void deleteByPrice(List<Order> createlist) {
       // System.out.println(createlist);
        createlist = createlist.stream().filter((p)-> p.getPrice() >= 18 ).collect(Collectors.toList());
        System.out.println(createlist);
    }

    private static void deleteDublicate(List<Order> createlist) {
        createlist = createlist.stream().distinct().collect(Collectors.toList());
        System.out.println(createlist);

    }

    private static void sortListByNameByIdByCity(List<Order> createlist) {

        createlist.sort((Order o1, Order o2)-> {
            if (o1.getItemName().compareTo(o2.getItemName()) == 0) {
                if (o1.getShopIdentificator().compareTo(o2.getShopIdentificator()) == 0) {
                    return o1.getUser().getCity().compareTo(o2.getUser().getCity());
                }
                return o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
            }
            return o1.getItemName().compareTo(o2.getItemName());

            });
        System.out.println(createlist);
    }

    private static void sortListInIncreaseAndCity(List<Order> createlist) {
        createlist.sort((Order o1, Order o2)-> {
            if (o1.getPrice() - o2.getPrice() == 0) {
                return o1.getUser().getCity().compareTo(o2.getUser().getCity());
            }
            return o1.getPrice() - o2.getPrice();
        });

        System.out.println(createlist);

    }

    private static void sortListByPrice(List<Order> createlist){
        createlist.sort((Order o1,Order o2 )->o2.getPrice()-o1.getPrice());
       System.out.println(createlist);
   }




    private static List<Order> createlist() {

        List<Order> list = new ArrayList<>();
        list.add(new Order(0, 0, Currency.USD, "c", "a", new User(1, "andrey", "Petrov", "b", 200)));

        list.add(new Order(1, 1501, Currency.USD, "c", "a", new User(1, "andrey", "Petrov", "b", 200)));
        list.add(new Order(2, 0, Currency.USD, "c", "a", new User(1, "andrey", "Petrov", "b", 200)));
        list.add(new Order(1, 0, Currency.EUR, "a", "a", new User(1, "andrey", "sevruk", "a", 200)));
        /*list.add(new Order(2, 2, Currency.EUR, "aaa", "a", new User(1, "andrey", "sevruk", "b", 200)));
        list.add(new Order(3, 3, Currency.USD, "aaaa", "a", new User(1, "andrey", "sevruk", "b", 200)));
        list.add(new Order(4, 4123, Currency.EUR, "aaaaa", "a", new User(1, "andrey", "sevruk", "b", 200)));
        list.add(new Order(5, 5, Currency.EUR, "aaaaaa", "a", new User(1, "andrey", "sevruk", "b", 200)));
        list.add(new Order(6, 3333336, Currency.EUR, "aaaa", "a", new User(1, "andrey", "sevruk", "b", 200)));
        list.add(new Order(7, 7, Currency.EUR, "aaaaa", "a", new User(1, "andrey", "sevruk", "b", 200)));
        list.add(new Order(10, 0, Currency.EUR, "a", "a", new User(1, "andrey", "sevruk", "b", 200)));
        list.add(new Order(11   , 11110, Currency.USD, "aa", "a", new User(1, "andrey", "sevruk", "b", 200)));
        */
        return list;
    }
}