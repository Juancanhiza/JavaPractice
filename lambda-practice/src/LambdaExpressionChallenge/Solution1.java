package LambdaExpressionChallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.UnaryOperator;

public class Solution1 {

    public static void main(String[] args) {
         /*
            Array of Strings with names spelled the same backwards and forwards. Example: Bob or Anna
            use Arrays.setAll or List.replaceAll
          */

        List<String> names = new ArrayList<>(List.of("Anna", "Bob", "Peter", "John"));


        // EXERCISE 1: ToUpperCaseFunction
        System.out.println("EXERCISE 1: ToUpperCaseFunction");
        UnaryOperator<List<String>> toUpperCase = elements -> {
            List<String> edited = new ArrayList<>();
            elements.forEach(element -> edited.add(element.toUpperCase()));
            return edited;
        };
        operateOnStringList(names, toUpperCase).forEach(element -> System.out.println(element));

        // EXERCISE 2: Add Random Generate Middle Initial
        System.out.println("EXERCISE 2: Add Random Generate Middle Initial");
        UnaryOperator<List<String>> randomMiddleInitial = elements -> {
            List<String> edited = new ArrayList<>();
            Random random = new Random();
            elements.forEach(element -> edited.add(element + (char) (random.nextInt(26) + 'A')));
            return edited;
        };
        operateOnStringList(names, randomMiddleInitial).forEach(element -> System.out.println(element));

        // EXERCISE 3: Add a Last Name that is the reverse of the First Name
        System.out.println("EXERCISE 3: Add a Last Name that is the reverse of the First Name");
        UnaryOperator<List<String>> addInvertedLastName = elements -> {
            List<String> edited = new ArrayList<>();
            elements.forEach(element -> {
                StringBuilder builder = new StringBuilder(element);
                edited.add(element + " " + builder.reverse());
            });
            return edited;
        };
        operateOnStringList(names, addInvertedLastName).forEach(element -> System.out.println(element));

        // EXERCISE 4: Create a new list removing elements that has equals first and last names
        System.out.println("EXERCISE 4: Create a new list removing elements that has equals first and last names");
        UnaryOperator<List<String>> removePalindromeNames = elements -> {
            List<String> edited = new ArrayList<>();
            elements.forEach(element -> {
                StringBuilder builder = new StringBuilder(element);
                if(!element.equalsIgnoreCase(builder.reverse().toString())){
                    edited.add(element + " " + builder.reverse());
                }
            });
            return edited;
        };
        operateOnStringList(names, removePalindromeNames).forEach(element -> System.out.println(element));

    }

    public static List<String> operateOnStringList(List<String> array, UnaryOperator<List<String>> operator){
        return operator.apply(array);
    }
}
