package ThinkingInJava.Excercises.Everything_is_an_Object;


public class Excercise8 {
    static class DataOnly {
        int i;
        double d;
        boolean b;
    }

    public static void main(String[] args) {

        System.out.println("StaticTest.i = " + StaticTest.i);
        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();
        System.out.println("st1.i = " + st1.i);
        System.out.println("st2.i = " + st2.i);
        System.out.println("Incrementable.increment() :");
        Incrementable.increment();
        System.out.println("st1.i = " + st1.i);
        System.out.println("st2.i = " + st2.i);
        System.out.println("sf.increment() :");
        Incrementable sf = new Incrementable();
        sf.increment();
        System.out.println("st1.i = " + st1.i);
        System.out.println("st2.i = " + st2.i);


    }
}

