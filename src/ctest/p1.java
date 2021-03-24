package ctest;

import java.util.Comparator;
import java.util.TreeSet;

class User {
    String name;
    int age;

    User(String n, int a) {
        name = n;
        age = a;
    }
}

public class p1 {
    public static void main(String[] args) {
        TreeSet<User> tree = new TreeSet<>(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.name.compareTo(o2.name);
            }
        });
    }
}
