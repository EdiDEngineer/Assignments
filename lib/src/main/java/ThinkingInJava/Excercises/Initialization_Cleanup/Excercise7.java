package ThinkingInJava.Excercises.Initialization_Cleanup;

class Init7 {
    void init() {
            System.out.println("Init");
    }
}
public class Excercise7 {
        public static void main(String[] args) {
            Init7 i = new Init7();
        i.init();
    }
}

