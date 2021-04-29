package ThinkingInJava.Excercises.Controlling_Execution;

public class Excercise8 {
   
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            switch(i) {
                case 0:   System.out.println(i); break;
                case 1:    System.out.println(i); break;
                case 2:     System.out.println(i); break;
                case 3:    System.out.println(i); break;
                case 4:     System.out.println(i); break;
                case 5:     System.out.println(i); break;
                case 6: System.out.println(i); break;
                case 7:    System.out.println(i); break;
                case 8:     System.out.println(i); break;
                default:       System.out.println("other");
            }
        }

        for(int i = 0; i < 5; i++) {
            switch(i) {
                case 0:     System.out.println(i);
                case 1:     System.out.println(i);
                case 2:     System.out.println(i);
                case 3:   System.out.println(i);
                default:     System.out.println("other");
            }
        }
    }
}

