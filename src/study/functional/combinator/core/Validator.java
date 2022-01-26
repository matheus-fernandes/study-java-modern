package study.functional.combinator.core;

import java.util.function.BiConsumer;

public interface Validator<T> extends
        BiConsumer<ValidationResult, T> {

    default Validator<T> and(Validator<T> other) {
        return (result, t) -> {
            this.accept(result, t);
            other.accept(result, t);
        };
    }

    default ValidationResult validate(T object){
        ValidationResult result = new ValidationResult();
        this.accept(result, object);
        return result;
    }
}
