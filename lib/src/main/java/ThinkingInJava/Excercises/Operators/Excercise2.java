package ThinkingInJava.Excercises.Operators;



 class Square{
    float side;
}
public class Excercise2 {

    public static void main(String[] args) {
        Square sq1 = new Square();
        Square sq2 = new Square();
        sq1.side = 45.9f;
        sq2.side = 4.2f;
        System.out.println("sq1= " + sq1.side + ", sq2= " + sq2.side);
        sq1 = sq2;
        System.out.println("sq1= " + sq1.side + ", sq2= " + sq2.side);
        sq1.side = 1.0000f;
        System.out.println("sq1= " + sq1.side + ", sq2= " + sq2.side);
    }
}

