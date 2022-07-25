package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class UsingSupplier {
    public static void main(String[] args) {
        Supplier<List<String>> nameList = () -> Arrays.asList("A", "B", "C");

        System.out.println(nameList.get());
    }
}
