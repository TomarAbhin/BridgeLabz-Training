import java.util.*;
import java.util.stream.Collectors;

public class WordFrequencyApp {

    public static void main(String[] args) {

        String paragraph ="I am a btech student and my name is Abhinav.";

        Map<String, Integer> wordCount =
            Arrays.stream(paragraph.toLowerCase().split("\\s+"))
                  .collect( Collectors.toMap(word -> word,word -> 1,Integer::sum));
        wordCount.forEach((word, count) ->
            System.out.println(word + " : " + count)
        );
    }
}
