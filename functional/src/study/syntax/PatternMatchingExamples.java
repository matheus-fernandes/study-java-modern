package study.syntax;

public class PatternMatchingExamples {
    public static void main(String[] args) {
        Object o = "test";

        if (o instanceof String s) {
            System.out.println(s.toUpperCase());
        }
    }
}
