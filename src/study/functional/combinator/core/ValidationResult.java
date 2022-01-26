package study.functional.combinator.core;

import java.util.ArrayList;
import java.util.Collection;

public class ValidationResult<E> {
    public final Collection<E> errors;

    public ValidationResult(){
        this.errors = new ArrayList<>();
    }

    public void append(E error){
        errors.add(error);
    }

    @Override
    public String toString() {
        return "ValidationResult{" +
                "errors=" + errors +
                '}';
    }
}
