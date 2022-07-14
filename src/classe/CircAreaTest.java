package classe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CircAreaTest {
    @Test
    public static void main(String[] args) {
        CircArea a1= new CircArea(10);
        CircArea.pi = 3.14561;
        Assertions.assertEquals(314.561, a1.getArea(), 0.001);
        System.out.println(a1.getArea());

        Assertions.assertEquals(78.640, CircArea.getArea(5.0), 0.001);
        System.out.println(CircArea.getArea(5.0));
    }
}
