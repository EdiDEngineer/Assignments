package ThinkingInJava.Excercises.Operators;

class Dog {
    String name;
    String says;
    void setName(String n) {
        name = n;
    }
    void setSays(String s) {
        says = s;
    }

}

public class Excercise5 {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setName("spot");
        dog1.setSays("Ruff!");
        Dog dog2 = new Dog();
        dog2.setName("scruffy");
        dog2.setSays("Wurf!");

        System.out.println(dog1.says);
        System.out.println(dog1.name);
        System.out.println(dog2.says);
        System.out.println(dog2.name);
    }
}

