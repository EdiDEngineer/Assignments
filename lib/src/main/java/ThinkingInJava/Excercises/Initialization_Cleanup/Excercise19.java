package ThinkingInJava.Excercises.Initialization_Cleanup;

public class Excercise19 {
    static void varArgsStrings(String... varargs) {
        for(String arg : varargs)
            System.out.println(arg);
    }
    public static void main(String[] args) {
        varArgsStrings("just", "checking", "this", "one", "for","you");
        varArgsStrings(new String[]{"enter", "into", "us"});
    }
}

