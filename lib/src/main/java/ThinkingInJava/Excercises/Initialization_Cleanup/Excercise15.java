package ThinkingInJava.Excercises.Initialization_Cleanup;

class Init15 {
    String string; {
        string = "Instance";
        System.out.println( string);

    }

}

public class Excercise15 {

    public static void main(String[] args) {
        new  Init15();
    }
}

