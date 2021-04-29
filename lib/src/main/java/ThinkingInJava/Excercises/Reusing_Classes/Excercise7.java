package ThinkingInJava.Excercises.Reusing_Classes;

class FirstOne {
    FirstOne(char c, int i) { System.out.println("Now");}
}

class SecondOne extends FirstOne {
    SecondOne(String s, float f){
        super('g', 4);
        System.out.println("Tee");
    }
}

public class Excercise7 extends FirstOne {
    Excercise7(char a, int j) {
        super(a, j);
     }
    SecondOne secondOne = new SecondOne("comp", 78.0f);
    public static void main(String[] args) {
        Excercise7 yor = new Excercise7(']', 76);
    }
}

