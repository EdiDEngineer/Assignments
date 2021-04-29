package ThinkingInJava.Excercises.Initialization_Cleanup;


class Init8 {
    void init() {
        System.out.println("Init");
        innerInit();
        this.innerInit();
    }
    void innerInit() {
        System.out.println("Inner Init");
    }

}
public class Excercise8 {

    public static void main(String[] args) {
     Init8 init8 = new Init8();
     init8.init();
    }
}

