package ThinkingInJava.Excercises.Operators;


public class Excercise3 {
    static void func(Square sq) {
        sq.side = 0f;
    }

    public static void main(String[] args) {
        Square sq = new Square();
        sq.side = 45.9f;
        System.out.println("sq= " + sq.side);
        func(sq);
        System.out.println("sq= " + sq.side);
    }
}

