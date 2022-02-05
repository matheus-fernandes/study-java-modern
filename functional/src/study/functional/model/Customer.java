package study.functional.model;

import java.time.LocalDate;

public record Customer(String name, String phone, String email, LocalDate birth) {
}
