package MiniChallenges.SupplierExample;

import java.util.function.Supplier;

public class Solution {

    public static void main(String [] args){
        Supplier<String> iLoveJava = () -> "I Love Java";
        System.out.println(iLoveJava.get());
    }

}
