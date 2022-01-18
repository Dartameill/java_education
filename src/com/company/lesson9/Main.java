package com.company.lesson9;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Ivan", 22, true);
        User user2 = new User("Vita", 22, false);
        User user3 = new User("Daniil", 25, true);


        Collection<User> list = new ArrayList<>();
        Collection<User> set = new HashSet<>();

        list.add(user1);
        list.add(user2);
        list.add(user3);

        set.add(user1);
        set.add(user2);
        set.add(user3);

        System.out.println(user1.ByName("Ivan", set));
        System.out.println(user2.BySex(false, set));
        System.out.println(user3.ByAge(25, set));
        System.out.println(user1.compareTo(user2));
       // System.out.println(list);
       // System.out.println(map.entrySet());


    }
}
