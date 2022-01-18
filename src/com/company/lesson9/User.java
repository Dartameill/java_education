package com.company.lesson9;

import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;

public class User implements Comparable<User>, FindByName, SortByAge, ReturnBySex {

    public String name;
    public int age;
    public boolean sex;

    User(String name, int age, boolean sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && sex == user.sex && name.equals(user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex);
    }
    @Override
    public int compareTo(User user) {
       if(age < user.age) {
           return -1;
       } else if (age == user.age) {
           return name.compareTo(user.name);
       } else {
           return 1;
       }
        }

    public Collection<User> ByName(String name, Collection<User> collection) {
        Collection<User> collection1 = new HashSet<>();
            for (User userByName : collection) {
                if(userByName.name.equals(name)) {
                    collection1.add(userByName);
                }
                }
            return collection1;
    }

    @Override
    public Collection<User> BySex(boolean isSex, Collection<User> collection) {
        Collection<User> collection1 = new HashSet<>();
        for(User userBySex : collection) {
            if(userBySex.sex == isSex) {
                collection1.add(userBySex);
            }
        } return collection1;
    }

    @Override
    public Collection<User> ByAge (int age, Collection<User> collection) {
        Collection<User> collection1 = new HashSet<>();
        for(User userByAge : collection) {
            if(userByAge.age == age) {
                collection1.add(userByAge);
            }
        } return collection1;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

}

