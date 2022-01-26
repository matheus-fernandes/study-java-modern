package study.functional.combinator.example;

import study.functional.combinator.core.Validator;
import study.functional.model.Customer;

import java.time.LocalDate;

import static study.functional.combinator.example.CustomerValidators.*;

public class CombinatorExample {
    public static void main(String[] args) {
        // validator
        Validator<Customer> validator = emailValidator
                .and(phoneValidator).and(isAdultValidator);

        // validation ok
        Customer customer1 = new Customer(
                "Matheus",
                "9997772273",
                "email@email.com",
                LocalDate.of(1999, 2, 2)
        );
        System.out.println(validator.validate(customer1));

        // something invalid
        Customer customer2 = new Customer(
                "Matheus",
                "9997772273",
                "emailemail.com",
                LocalDate.of(2005, 2, 2)
        );
        System.out.println(validator.validate(customer2));

    }
}
