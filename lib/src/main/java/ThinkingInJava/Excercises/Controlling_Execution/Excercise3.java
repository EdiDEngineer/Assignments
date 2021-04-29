package ThinkingInJava.Excercises.Controlling_Execution;

import java.util.Random;

public class Excercise3 {

    public static void main(String[] args) {
        Random rand = new Random();
        while(true){
            int x = rand.nextInt();
            int y = rand.nextInt();
            if(x < y) System.out.println(y + " greater than " + x);
            else if(x > y) System.out.println(x + " greater than " + y);
            else System.out.println(x + "equals" + y);
        }
    }
}

