package ThinkingInJava.Excercises.Initialization_Cleanup;

class Init10 {

    boolean in = false;
    Init10(boolean check){
        in = check;
    }
    void clear(){
        in = false;
    }
    void start(){
        in = true;
    }
    protected void finalize() {
        if(in)
            System.out.println("Error: started");
    }
}

public class Excercise10 {

    public static void main(String[] args) {
        Init10 init101 = new Init10(false);
        init101.start();
        Init10 init102 = new Init10(true);
        init102.clear();

        new Init10(true);
        System.gc();
    }
}

