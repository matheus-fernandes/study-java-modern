package study.functional.lambdas;

import study.functional.model.Customer;

import java.time.LocalDate;
import java.util.function.BiConsumer;

public class BiConsumerExamples {
    public static void main(String[] args) {
        BiConsumer<Customer, Boolean> politeGretting = (customer, showGretting) -> {
            System.out.print("Hello " + customer.name());

            if (showGretting) {
                System.out.print(
                        ", thanks for registering phone number: " + customer.phone()
                );
            }

            System.out.println();
        };

        politeGretting.accept(
                new Customer(
                        "Matheus", "",
                        "", LocalDate.now().minusYears(18)
                ), true
        );

        politeGretting.accept(
                new Customer(
                        "Bob", "",
                        "", LocalDate.now().minusYears(18)
                ), false
        );
    }
}
