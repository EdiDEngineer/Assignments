package ThinkingInJava.Excercises.Initialization_Cleanup;

class Init4 {

    Init4() {
        System.out.println("Init 4");
    }

    Init4(String s) {
        System.out.println(s);
    }

}


public class Excercise4 {
    public static void main(String[] args) {
        Init4 i1 = new Init4();
        Init4 i2 = new Init4("Init 4 (2)");
    }
}

