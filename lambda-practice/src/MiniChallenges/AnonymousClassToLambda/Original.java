package MiniChallenges.AnonymousClassToLambda;

import java.util.function.Consumer;

public class Original {

    public static void main(String[] args) {

        Consumer<String> printTheParts = new Consumer<String>() {
            @Override
            public void accept(String sentence) {
                String [] parts = sentence.split(" ");
                for(String part: parts){
                    System.out.println(part);
                }
            }
        };

        String sentence = "Hello world";
        printTheParts.accept(sentence);

    }
}
