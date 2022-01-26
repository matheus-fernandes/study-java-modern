package study.functional.lambdas;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> connectionUrl =
                () -> "jdbc://localhost:5432/users";

        System.out.println(
                connectionUrl.get()
        );
    }
}
