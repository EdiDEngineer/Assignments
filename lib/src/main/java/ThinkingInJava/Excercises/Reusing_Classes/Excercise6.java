package ThinkingInJava.Excercises.Reusing_Classes;

class Game {
    Game(int i) {
        System.out.println("Game");
    }
}

class BoardGame extends Game {
    BoardGame(int i) {
          super(i);
          System.out.println("BoardGame");
    }
}

public class Excercise6 extends BoardGame{
    Excercise6() {
        super(11);
        System.out.println("Chess");
    }
    public static void main(String[] args) {
        Excercise6 x = new Excercise6();

    }
}

