package ThinkingInJava.Excercises.Operators;

public class Excercise4 {

    static float velocitySolution (float distance, float time) {
        if(time == 0) {
            return 0f;
        }
        else {
            return distance/time;
        }
    }
    public static void main(String[] args) {
        float distance = 670f;
        float time = 23f;
        float v = velocitySolution(distance, time);
        System.out.println("Velocity: " + v);	    }
}

