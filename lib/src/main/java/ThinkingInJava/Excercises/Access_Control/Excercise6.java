package ThinkingInJava.Excercises.Access_Control;

class Protection {
    protected int i = 28;
}

class MethodClass {
    static void change(Protection p, int i) { p.i = i; }
}
public class Excercise6 {

    public static void main(String[] args) {
        Protection p =new Protection();
        System.out.println(p.i);
        MethodClass.change(p, 50);
        System.out.println(p.i);
    }
}

