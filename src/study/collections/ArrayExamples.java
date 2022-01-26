package study.collections;

import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args){
        int [] numbers = {1, 3, 5, 7, 9};
        System.out.println(Arrays.toString(numbers));
        for(int n : numbers){
            System.out.println(n);
        }
        Arrays.stream(numbers).forEach((n)->{
            System.out.println(n);
        });
        Arrays.stream(numbers).forEach(System.out::println);

        int [][] table = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        System.out.println(Arrays.deepToString(table));

        char[][] board = {
            { ' ', ' ', ' ' },
            { ' ', ' ', ' ' },
            { ' ', ' ', ' ' },
        };
        System.out.println(Arrays.deepToString(board));
    }
}
