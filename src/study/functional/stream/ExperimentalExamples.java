package study.functional.stream;

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

/**
 * This example gets a poem and show the most common words used.
 * It was fully codes in functional programming style
 * as a way of learning and practicing.
 */
public class ExperimentalExamples {
    public static void main(String[] args) {
        Stream<String> streamOfWords =
                streamWordsOfFromText.apply(myPoem());

        Stream<String> cleanWords =
                cleanWordsFromText.apply(streamOfWords);

        Map<String, Long> wordsFrequency = cleanWords.collect(
                groupingBy(
                        word -> word,
                        counting()
                ));

        Stream<Occurrence> occurrences =
                wordsFrequency.entrySet().stream()
                        .map(entryToOccurrence);

        Stream<Occurrence> mostCommonOccurrences =
                occurrences.sorted(byMostCommon);

        mostCommonOccurrences
                .forEach(occurrence -> {
                    System.out.println(occurrence.word() + ": " + occurrence.frequency());
                });
    }

    static Comparator<Occurrence> byMostCommon =
            (occurrence1, occurrence2) -> occurrence2.frequency()
                    .compareTo(occurrence1.frequency);

    static IntPredicate checkIsNotSpecial =
            ch -> Character.isLetter(ch) ||
                Character.isSpaceChar(ch) ||
                ch == '\'';

    static IntFunction<String> charToString =
            ch -> Character.toString(ch);


    static IntUnaryOperator charToLowerCase =
            ch -> Character.toLowerCase(ch);

    static Function<Stream<String>, Stream<String>> cleanWordsFromText =
            words -> words.map(
                    w -> w.chars()
                            .filter(checkIsNotSpecial)
                            .map(charToLowerCase)
                            .mapToObj(charToString)
                            .collect(joining())
            );

    static Function<String, Stream<String>> streamWordsOfFromText =
            text ->  Stream.of(text.split(" "));

    static Function<Map.Entry<String, Long>, Occurrence> entryToOccurrence =
            entry -> new Occurrence(entry.getKey(), entry.getValue());

    static String myPoem(){
        return "Here's to the crazy ones. " +
                "The misfits. The rebels. The troublemakers. " +
                "The round pegs in the square holes. " +
                "The ones who see things differently. " +
                "They're not fond of rules. " +
                "And they have no respect for the status quo. " +
                "You can quote them, disagree with them, glorify or vilify them. " +
                "About the only thing you can't do is ignore them. " +
                "Because they change things. They push the human race forward. " +
                "And while some may see them as the crazy ones, we see genius. " +
                "Because the people who are crazy enough to think they can change the world, " +
                "are the ones who do.";
    }

    record Occurrence(String word, Long frequency){}
}
