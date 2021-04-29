package ThinkingInJava.Excercises.Initialization_Cleanup;

class Init14 {
    private static String string1 = "without block";
    private static String string2;
    static {
        string2 = "with block";
    }
    public static void showValues() {
            System.out.println( string1 + ", " + string2);
    }
}


public class Excercise14 {

    public static void main(String[] args) {
        Init14.showValues();
    }
}

