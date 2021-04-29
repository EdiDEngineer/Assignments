package ThinkingInJava.Excercises.Initialization_Cleanup;

class Init9 {
     Init9() {
        this(90);
    }
    Init9(int i) {
        System.out.println(i);
    }

}

public class Excercise9 {

    public static void main(String[] args) {
        Init9 init9 = new Init9();
    }
}

