package ThinkingInJava.Excercises.Reusing_Classes;

class One { One(){   System.out.println("One()");} }

class Two extends One { Two(){   System.out.println("Two()");} }

class Four extends Two { Four(){   System.out.println("Four()");} }

class Seven extends Four {
    Seven() {
        System.out.println("Seven()");
    }

    public static Seven makeSeven() {
        return new Seven();
    }

    public static void main(String[] args) {
        Seven a = new Seven();
        Seven b = makeSeven();
    }
}

public class Excercise4 {
    Excercise4() {   System.out.println("Excercise4()"); }

    public static void main(String[] args) {
        Excercise4 excercise4 = new Excercise4();
        Seven.main(args);
    }
}

