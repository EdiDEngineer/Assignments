package ThinkingInJava.Excercises.Initialization_Cleanup;

public class Excercise11 {

    public static void main(String[] args) {
        Init10 init101 = new Init10(false);
        init101.start();
        Init10 init102 = new Init10(true);
        init102.clear();

        new Init10(true);
        System.runFinalization();
        Runtime.getRuntime().runFinalization();
        System.gc();
        System.runFinalizersOnExit(true);
    }
}

