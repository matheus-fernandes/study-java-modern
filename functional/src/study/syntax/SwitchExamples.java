package study.syntax;

public class SwitchExamples {
    public static void main(String[] args) {
        String name = "Michael";

        switch (name) {
            case "Ana" -> System.out.println("Hello mom");
            case "Michael" -> System.out.println("Hi brother");
            case "Bob" -> System.out.println("Hey friend");
        }
    }
}
