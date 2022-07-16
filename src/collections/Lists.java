package collections;

import java.util.ArrayList;

public class Lists {

    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        list.add(new User("Bob"));
        list.add(new User("William"));
        list.add(new User("Victor"));
        list.add(new User("Louis"));

        System.out.println(list.get(3));

        System.out.println(">>> " + list.remove(1));
        System.out.println(list.remove(new User("Louis")));
        System.out.println("Contains? " + list.contains(new User("Victor")));

        for(User u: list) {
            System.out.println(u.name);
        }
    }
}
