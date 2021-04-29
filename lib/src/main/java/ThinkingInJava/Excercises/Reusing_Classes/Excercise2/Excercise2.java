package ThinkingInJava.Excercises.Reusing_Classes.Excercise2;

public class Excercise2 extends Detergent {
    public void scrub() { append(" Sterilizer.scrub()"); }
    public void sterilize() { append(" sterilize()"); }
    public static void main(String[] args) {
        Excercise2 x = new Excercise2();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        x.sterilize();
       System.out. println(x);
        System.out.  println("Testing base class:");
        Detergent.main(args);
    }
}

