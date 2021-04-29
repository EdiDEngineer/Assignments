package ThinkingInJava.Excercises.Initialization_Cleanup;


class Tank {
    boolean fillStatus = false;
    Tank(boolean fullness) {
        fillStatus = fullness;
    }
    void full() {
        fillStatus = true;
        }
    void empty() {
        fillStatus = false;
    }
    protected void finalize() {
        if(fillStatus)
            System.out.println("Error: Tank full, please empty");
    }
}

public class Excercise12 {

    public static void main(String[] args) {
        Tank tank1 = new Tank(true);
        tank1.empty();
        new Tank(true);
        System.gc();
    }
}

