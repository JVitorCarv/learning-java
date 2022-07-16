package collections;

import java.util.HashSet;
import java.util.Set;

public class MessySet {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add(2);
        set.add(1.2); // double -> Double
        set.add(true); // boolean -> Booleans
        set.add("String");
        System.out.println(set.size());

        set.remove("String");
        System.out.println(set.contains(1.2));

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(set);

        // set.addAll(nums); unites two sets
        set.retainAll(nums);
        System.out.println(set);
    }
}
