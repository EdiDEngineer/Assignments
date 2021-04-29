package ThinkingInJava.Excercises.Operators;

import java.util.Random;

public class Excercise7 {
    public static void main(String[] args) {

        Random rand = new Random();
        int coin = rand.nextInt();
        if(coin % 2 == 0)   System.out.println( "Head");
        else   System.out.println( "Tail");
    }
}

