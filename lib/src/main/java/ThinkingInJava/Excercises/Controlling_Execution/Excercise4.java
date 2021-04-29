package ThinkingInJava.Excercises.Controlling_Execution;

public class Excercise4 {

    public static void main(String[] args) {

        for(int i = 1; i < 200; i++ ) {
            int factors = 0;
            for(int j = 1; j < (i + 2)/2; j++ ) {
                if((i % j) == 0) factors++;
            }
            if(factors < 2)
                System.out.println("Prime number: " + i);
        }
    }
}

