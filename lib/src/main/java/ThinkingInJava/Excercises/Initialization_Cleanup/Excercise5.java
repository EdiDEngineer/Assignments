package ThinkingInJava.Excercises.Initialization_Cleanup;


class Dog {
    void bark() {System.out.println("default");}
    void bark(char c) {System.out.println(c);}
    void bark(byte b) {System.out.println(b);}
    void bark(short s) {System.out.println(s);}
    void bark(int i) {System.out.println(i);}
    void bark(long l) {System.out.println(l);}
    void bark(float f) {System.out.println(f);}
    void bark(double d) {System.out.println(d);}
    void bark(char c, long l) {System.out.println(c +" "+ l);}
    void bark(long l, char c) {System.out.println( l+" "+c);}
}

public class Excercise5 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        byte b = 6;
        short s = 5;
        dog.bark('.');
        dog.bark(20);
        dog.bark(12L);
        dog.bark(45.7f);
        dog.bark(b);
        dog.bark(s);
        dog.bark(33.3);
    }
}

