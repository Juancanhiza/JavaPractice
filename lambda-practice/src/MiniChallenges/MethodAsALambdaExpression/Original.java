package MiniChallenges.MethodAsALambdaExpression;

public class Original {

    public static void main(String[] args){
        String input = "123456789";
        System.out.println(everySecondChar(input));

    }
    public static String everySecondChar(String source){
        StringBuilder returnVal = new StringBuilder();
        for(int i=0; i < source.length(); i++){
            if (i % 2 == 1){
                returnVal.append(source.charAt(i));
            }
        }
        return returnVal.toString();
    }
}
