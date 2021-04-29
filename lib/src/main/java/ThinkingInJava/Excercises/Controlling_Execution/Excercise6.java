package ThinkingInJava.Excercises.Controlling_Execution;

public class Excercise6 {
    static int test(int testval, int begin, int end) {
        if(end < begin) {
                System.out.println("Error, end must be greater than begin");
            return 0;
        }
        if((testval > (begin - 1)) && (testval < (end + 1)))
            return +1;
        if((testval < begin) || (testval > end))
            return -1;
        return 50;
    }
    public static void main(String[] args) {
            System.out.println(test(310, 5, 4));
            System.out.println(test(28,7, 10));
            System.out.println(test(0, 5, 6));
        System.out.println(test(3, 2, 100));

    }
}

