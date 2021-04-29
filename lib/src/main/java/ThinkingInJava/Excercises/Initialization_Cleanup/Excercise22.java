package ThinkingInJava.Excercises.Initialization_Cleanup;

public class Excercise22 {
    public enum Currency {
        DOLLAR,
        EURO, NAIRA, YEN, CEDI, POUNDS
    }
    public static void main(String[] args) {
        for(Currency c : Currency.values())
            switch(c) {
                case DOLLAR: System.out.println("Dollar"); break;
                case EURO: System.out.println("Euro"); break;
                case NAIRA: System.out.println("Naira"); break;
                case YEN: System.out.println("Yen"); break;
                case CEDI: System.out.println("Cedi"); break;
                case POUNDS: System.out.println("Pounds"); break;
                default: break;
            }
    }
}

