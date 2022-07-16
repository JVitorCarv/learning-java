package classe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EqualsHashcode {
    @Test
    public static void main(String[] args) {
        User u1 = new User("user", "user@email.com");
        User u2 = new User("user", "user@email.com");
        Assertions.assertNotSame(u1, u2);
    }
}
