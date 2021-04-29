package ThinkingInJava.Excercises.Initialization_Cleanup;

class Init2 {
    String string1 = "one";
    String string2;
    Init2() { string2 = "two"; }


}

public class Excercise2 {

    public static void main(String[] args) {
        Init2 i = new Init2();
        System.out.println( i.string1);
        System.out.println( i.string2);
    }
}

