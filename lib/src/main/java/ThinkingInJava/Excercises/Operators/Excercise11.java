package ThinkingInJava.Excercises.Operators;

public class Excercise11 {
      public static void main(String[] args) {
          int mostSigOne = 0x100000;
          System.out.println(Integer.toBinaryString(mostSigOne));
        for(int i = 0; i < 20; i++) {
            mostSigOne >>>= 1;
            System.out.println(Integer.toBinaryString(mostSigOne));
        }
    }
}

