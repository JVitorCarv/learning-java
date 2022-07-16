package collections;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet<User> users = new HashSet<>();
        users.add(new User("Robert"));
        users.add(new User("Andrew"));
        users.add(new User("Frederick"));

        // Always have equals and hashcode implemented!
        System.out.println(users.contains(new User("Andrew")));

    }



}
