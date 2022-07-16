package classe;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<Integer, String> users = new HashMap<>();
        users.put(1, "Roert");
        users.put(1, "Robert");
        users.put(2, "Kent");
        users.put(3, "Fred");

        System.out.println(users.size());
        System.out.println(users.isEmpty());

        System.out.println(users.keySet());
        System.out.println(users.values());
        System.out.println(users.entrySet());

        System.out.println(users.containsKey(2));
        System.out.println(users.containsValue("Fred"));

        System.out.println(users.get(3));

        for (int key: users.keySet()) {
            System.out.println(key);
        }

        for (String value: users.values()) {
            System.out.println(value);
        }

        for (Map.Entry<Integer, String> register: users.entrySet()) {
            System.out.println(register.getKey());
            System.out.println(register.getValue());
        }

        System.out.println(users.remove(1));
        System.out.println(users.remove(2, "Beck"));
    }
}
