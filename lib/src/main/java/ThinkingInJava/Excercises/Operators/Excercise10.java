package ThinkingInJava.Excercises.Operators;

public class Excercise10 {
    public static void main(String[] args) {

        int endWithZeros = 0xAAA;
        int endWithOnes = 0x555;
        System.out.println(Integer.toBinaryString(endWithZeros));
        System.out.println(Integer.toBinaryString(endWithOnes));
        System.out.println(Integer.toBinaryString(endWithZeros ^ endWithOnes));
        System.out.println(Integer.toBinaryString(~endWithOnes));
        System.out.println(Integer.toBinaryString(endWithZeros & endWithOnes));
        System.out.println(Integer.toBinaryString(endWithZeros | endWithOnes));
        System.out.println(Integer.toBinaryString(~endWithZeros));


    }
}

