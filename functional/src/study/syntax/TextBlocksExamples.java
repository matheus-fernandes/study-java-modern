package study.syntax;

public class TextBlocksExamples {
    public static void main(String[] args) {
        String person = """
                {
                    name: "%s",
                    age: %d  
                }
                """
                .formatted("Matt", 20);

        System.out.println(person);
    }
}
