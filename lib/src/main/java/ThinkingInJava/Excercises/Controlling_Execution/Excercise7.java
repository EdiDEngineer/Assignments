package ThinkingInJava.Excercises.Controlling_Execution;

public class Excercise7 {

    static void countWithBreak() {
        for(int i = 0; i < 101; i++) {
                System.out.println(i + 1);
            if(i == 99)
                break;
        }
    }
    static void countWithReturn() {
        for(int i = 0; i < 101; i++) {
                System.out.println(i + 1);
            if(i == 99)
                return;
        }
    }
    public static void main(String[] args) {
        countWithBreak();
        countWithReturn();
    }
}

