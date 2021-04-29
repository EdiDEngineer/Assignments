package ThinkingInJava.Excercises.Initialization_Cleanup;

class Init18 {
    Init18(String s) {
        System.out.println(s);
    }
}

public class Excercise18 {

    public static void main(String[] args) {
        Init18[] array = new Init18[]{new Init18("Enter"),new Init18("One"),};
    }
}

