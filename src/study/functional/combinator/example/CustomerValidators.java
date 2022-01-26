package study.functional.combinator.example;

import study.functional.combinator.core.Validator;
import study.functional.model.Customer;

import java.time.LocalDate;
import java.time.Period;

import static study.functional.combinator.core.ValidationError.*;

public interface CustomerValidators {

    Validator<Customer> emailValidator = (result, customer) -> {
        if (!customer.email().contains("@")) {
            result.append(EMAIL_NOT_VALID);
        }
    };

    Validator<Customer> phoneValidator = (result, customer) -> {
        if (!customer.phone().startsWith("9")){
            result.append(PHONE_NOT_VALID);
        }
    };

    Validator<Customer> isAdultValidator = (result, customer) -> {
        if (Period.between(customer.birth(), LocalDate.now()).getYears() < 18){
            result.append(IS_NOT_AN_ADULT);
        }
    };
}
