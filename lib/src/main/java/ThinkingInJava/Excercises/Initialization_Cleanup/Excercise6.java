package ThinkingInJava.Excercises.Initialization_Cleanup;

public class Excercise6 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.bark(33L,'%');
        dog.bark('L',40L);
    }
}

