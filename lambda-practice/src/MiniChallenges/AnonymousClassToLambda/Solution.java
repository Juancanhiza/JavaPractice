package MiniChallenges.AnonymousClassToLambda;

import java.util.Arrays;
import java.util.function.Consumer;

public class Solution {

    public static void main(String[] args) {
        String input = "Hello world";

        /* SOLUTION 1 */
        Consumer<String> printTheParts = sentence -> {
            String [] parts = sentence.split(" ");
            for(String part: parts){
                System.out.println(part);
            }
        };
        printTheParts.accept(input);


        /* SOLUTION 2 */
        Consumer<String> printTheParts2 = sentence -> {
            String [] parts = sentence.split(" ");
            Arrays.asList(parts).forEach(part -> System.out.println(part));
        };
        printTheParts2.accept(input);

        /* SOLUTION 3 */
        Consumer<String> printTheParts3 = sentence ->
            Arrays.asList(sentence.split(" ")).forEach(part -> System.out.println(part));
        printTheParts3.accept(input);

    }
}
