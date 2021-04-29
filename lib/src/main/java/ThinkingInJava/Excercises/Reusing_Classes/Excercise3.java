package ThinkingInJava.Excercises.Reusing_Classes;


class Art {
    Art() {   System.out.println("Art constructor"); }
}

class Drawing extends Art {
    Drawing() {   System.out.println("Drawing constructor"); }
}

public class Excercise3 extends Drawing {

    public static void main(String[] args) {
        Excercise3 ex3 = new Excercise3();

    }
}

