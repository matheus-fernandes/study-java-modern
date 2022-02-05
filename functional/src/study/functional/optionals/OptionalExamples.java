package study.functional.optionals;

import java.util.Optional;

public class OptionalExamples {
    public static void main(String[] args) throws Exception {
        Optional<String> writtenName = Optional.of(null);
        Optional<String> writtenEmail = Optional.of("matheus@email.com");

        writtenName.ifPresent(
                name -> System.out.println("Hi" + name));

        writtenEmail.ifPresent(
                email -> System.out.println("Email to" + email));

        writtenName.ifPresentOrElse(
                name -> System.out.println("Hi " + name),
                () -> System.out.println("What is your name?"));

        writtenEmail.ifPresentOrElse(
                (email) -> System.out.println("Email to" + email),
                () -> System.out.println("Email not found"));

        System.out.println(
                writtenName.orElse( "Matheus"));

        System.out.println(
                writtenEmail.orElseThrow(Exception::new));

    }
}
