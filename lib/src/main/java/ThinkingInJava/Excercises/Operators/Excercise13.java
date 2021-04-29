package ThinkingInJava.Excercises.Operators;

public class Excercise13 {
    public static void charBinaryForm(char Char) {
        System.out.println(Char + " in Binary: " + Integer.toBinaryString(Char));
    }
    public static void main(String[] args) {
        char c = '$';
        charBinaryForm(c);
        c = '.';
        charBinaryForm(c);
        c = 'r';
        charBinaryForm(c);
    }
}
