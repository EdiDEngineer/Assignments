package ThinkingInJava.Excercises.Operators;

public class Excercise12 {

    public static void main(String[] args) {
        int allOne = 0xff;
        System.out.println(Integer.toBinaryString(allOne));
        allOne<<=1;
        System.out.println(Integer.toBinaryString(allOne));
        for(int i = 0; i < 9; i++) {
            allOne >>>= 1;
            System.out.println(Integer.toBinaryString(allOne));
        }
    }
}

