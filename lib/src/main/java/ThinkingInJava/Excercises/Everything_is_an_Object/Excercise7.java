package ThinkingInJava.Excercises.Everything_is_an_Object;

class StaticTest {
    static int i = 47;
}

class Incrementable {
    static void increment() { StaticTest.i++; }
}
public class Excercise7 {

    public static void main(String[] args) {

        Incrementable sf = new Incrementable();
        sf.increment();
        Incrementable.increment();


    }
}

