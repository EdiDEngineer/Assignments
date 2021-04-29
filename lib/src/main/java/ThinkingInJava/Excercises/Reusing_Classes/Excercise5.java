package ThinkingInJava.Excercises.Reusing_Classes;

class myOne {
    myOne() {
        System.out.println("OP");
    }
}

class myTwo extends One {
    myTwo() {
        System.out.println("rt");
    }
}


public class Excercise5 extends myOne {
    myTwo two = new myTwo();

    public static void main(String[] args) {
        Excercise5 excercise5 = new Excercise5();
    }
}

