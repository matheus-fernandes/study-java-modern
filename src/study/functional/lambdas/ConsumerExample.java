package study.functional.lambdas;

import study.functional.model.Customer;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<Customer> sayHello = customer ->
                System.out.print(
                        "Hello " + customer.name()
                );

        Consumer<Customer> thanksForThePhone = customer ->
                System.out.print(
                        ", thanks for registering phone number: " +
                        customer.phone()
                );

        Consumer<Customer> writeNewLine =
                System.out::println;

        Consumer<Customer> gretting = sayHello
                .andThen(thanksForThePhone)
                .andThen(writeNewLine);

        gretting.accept(new Customer(
                "Matheus",
                "19 9997772273",
                "email@email.com",
                LocalDate.of(1999, 2, 2)
        ));

        List<Customer> people = List.of(
                new Customer(
                        "Jorge",
                        "19 999333300",
                        "email@email.com",
                        LocalDate.of(1999, 2, 2)
                ),
                new Customer(
                        "Shara",
                        "19 999883300",
                        "email@email.com",
                        LocalDate.of(1999, 2, 2)
                )
        );
        people.forEach(gretting);

    }
}
