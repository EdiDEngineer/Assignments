package ThinkingInJava.Excercises.Initialization_Cleanup;

public class Excercise21 {
    public enum Currency {
        DOLLAR,
        EURO, NAIRA, YEN, CEDI, POUNDS
    }   public static void main(String[] args) {
        for(Currency c : Currency.values())
            System.out.println(c + ": " + c.ordinal());
    }
}

