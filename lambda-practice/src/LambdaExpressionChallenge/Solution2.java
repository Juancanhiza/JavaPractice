package LambdaExpressionChallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.UnaryOperator;

public class Solution2 {

    public static void main(String[] args) {
         /*
            Array of Strings with names spelled the same backwards and forwards. Example: Bob or Anna
            use Arrays.setAll or List.replaceAll
          */

        List<String> names = new ArrayList<>(List.of("Anna", "Bob", "Peter", "John"));


        // EXERCISE 1: ToUpperCaseFunction
        System.out.println("EXERCISE 1: ToUpperCaseFunction");
        UnaryOperator<String> toUpperCase = element -> element.toUpperCase();
        operateAndPrintList(names, toUpperCase);

        // EXERCISE 2: Add Random Generate Middle Initial
        System.out.println("EXERCISE 2: Add Random Generate Middle Initial");
        UnaryOperator<String> randomMiddleInitial = element -> {
            Random random = new Random();
            return element + " " + (char) (random.nextInt(26) + 'A') + "." ;
        };
        operateAndPrintList(names, randomMiddleInitial);


        // EXERCISE 3: Add a Last Name that is the reverse of the First Name
        System.out.println("EXERCISE 3: Add a Last Name that is the reverse of the First Name");
        UnaryOperator<String> addInvertedLastName = element -> {
            StringBuilder builder = new StringBuilder(element.split(" ")[0]);
            return element + " " + builder.reverse();
        };
        operateAndPrintList(names, addInvertedLastName);

        // EXERCISE 4: Create a new list removing elements that has equals first and last names
        System.out.println("EXERCISE 4: Create a new list removing elements that has equals first and last names");
        names.removeIf(element -> {
            String firstName = element.split(" ")[0];
            String lastName = element.split(" ")[2];
            return firstName.equals(lastName);
        });
        names.forEach(element -> System.out.println(element));
    }

    public static void operateAndPrintList(List<String> array, UnaryOperator<String> operator){
        array.replaceAll(operator);
        array.forEach(element -> System.out.println(element));
    }
}
