package ThinkingInJava.Excercises.Controlling_Execution;

public class Excercise9 {
   static int fibonacci(int i) {
        if(i < 2) return 1;
        return (fibonacci(i - 2) + fibonacci(i - 1));
    }
    static void fibonacciDisplay(int n) {
        for(int i = 0; i <n; i++)
            System.out.println(fibonacci(i));
    }
    public static void main(String[] args) {
        fibonacciDisplay(15);
    }
}

