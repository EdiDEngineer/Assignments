package ThinkingInJava.Excercises.Operators;

public class Excercise14 {
    static void comp(String string1, String string2) {
        System.out.println(string1 == string2);
        System.out.println(string1.equals(string2));
        System.out.println(string2.equals(string1));
        System.out.println(string1 != string2);
        }
    public static void main(String[] args) {
        comp("Ag","green");
        System.out.println();
        comp("blue","blue");

    }

}

