package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class OrganizedSet {
    public static void main(String[] args) {
        // Set<String> list = new HashSet<>(); // does not maintain insertion order, nor orders
        SortedSet<String> list = new TreeSet<>(); // does not maintain insertion order, orders
        list.add("Hello");
        list.add("World");
        list.add("HashSet");
        list.add("TreeSet");
        System.out.println(list);
    }
}
