package MiniChallenges.MethodUsingLambdaExpression;

import java.util.function.UnaryOperator;

public class Solution {
    public static void main(String[] args){
        String input = "1234567890";
        UnaryOperator<String> everySecondLambda = sentence -> {
            StringBuilder returnVal = new StringBuilder();
            for(int i=0; i < sentence.length(); i++){
                if (i % 2 == 1){
                    returnVal.append(sentence.charAt(i));
                }
            }
            return returnVal.toString();
        };
        System.out.println(everySecondCharacter(everySecondLambda, input));
    }

    public static String everySecondCharacter(UnaryOperator<String> operator, String input){
        return operator.apply(input);
    }
}
