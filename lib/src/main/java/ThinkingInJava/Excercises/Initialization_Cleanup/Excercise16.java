package ThinkingInJava.Excercises.Initialization_Cleanup;

public class Excercise16 {

    public static void main(String[] args) {
        String[] stringArray = new String[]{"first","one","in","here"};
        for(int i=0; i<stringArray.length; i++){
            System.out.println("stringArray["+i+"] = " + stringArray[i]);
        }
    }
}

