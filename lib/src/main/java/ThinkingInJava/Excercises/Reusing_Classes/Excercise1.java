package ThinkingInJava.Excercises.Reusing_Classes;

class Computer {
    private String s;
    Computer() {
        s = "Main";
    }
    public String toString() { return s; }
}

public class Excercise1 {
    private String variable;
    private Computer c;
    public Excercise1() {
        variable = "Body";
    }
    public String toString() {
        if(c == null) // lazy initialization:
            c = new Computer();
        return "variable = " + variable + ", " + "Computer = " + c;
    }
    public static void main(String[] args) {
        Excercise1 one = new Excercise1();
        System.out.println(one);
    }
}

