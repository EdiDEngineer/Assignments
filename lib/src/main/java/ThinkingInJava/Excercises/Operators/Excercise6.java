package ThinkingInJava.Excercises.Operators;

public class Excercise6 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setName("spot");
        dog1.setSays("Ruff!");
        Dog dog3 = new Dog();
        dog1.setName("dog3");
        dog1.setSays("Not!");

        System.out.println( dog1 == dog3);
        System.out.println( dog1 .equals( dog3));
        System.out.println( dog3 .equals( dog1));

        dog3 = dog1 ;
        System.out.println( dog1 == dog3);
        System.out.println( dog1 .equals( dog3));
        System.out.println( dog3 .equals( dog1));

    }
}

