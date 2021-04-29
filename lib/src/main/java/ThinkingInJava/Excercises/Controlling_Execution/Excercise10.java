package ThinkingInJava.Excercises.Controlling_Execution;

public class Excercise10 {
    static int sigDig1(int i) {
        return i / 1000;
    }

    static int sigDig2(int i) {
        return (i % 1000) / 100;
    }

    static int sigDig3(int i) {
        return ((i % 1000) % 100) / 10;
    }

    static int sigDig4(int i) {
        return ((i % 1000) % 100) % 10;
    }

    static int validate(int i, int j) {
        return (i * 10) + j;
    }

    static void findMethod(int i, int j, int k) {
        if (j * k == i)
            System.out.println("Vampire number: " + i + " = " + j + " * " + k);
    }

    public static void main(String[] args) {
        for (int i = 1000; i < 10000; i++) {
            findMethod(i, validate(sigDig1(i), sigDig2(i)), validate(sigDig3(i), sigDig4(i)));
            findMethod(i, validate(sigDig1(i), sigDig2(i)), validate(sigDig4(i), sigDig3(i)));
            findMethod(i, validate(sigDig1(i), sigDig3(i)), validate(sigDig2(i), sigDig4(i)));
            findMethod(i, validate(sigDig1(i), sigDig3(i)), validate(sigDig4(i), sigDig2(i)));
            findMethod(i, validate(sigDig2(i), sigDig4(i)), validate(sigDig3(i), sigDig1(i)));
            findMethod(i, validate(sigDig3(i), sigDig1(i)), validate(sigDig4(i), sigDig2(i)));
            findMethod(i, validate(sigDig3(i), sigDig2(i)), validate(sigDig4(i), sigDig1(i)));
            findMethod(i, validate(sigDig1(i), sigDig4(i)), validate(sigDig2(i), sigDig3(i)));
            findMethod(i, validate(sigDig1(i), sigDig4(i)), validate(sigDig3(i), sigDig2(i)));
            findMethod(i, validate(sigDig2(i), sigDig1(i)), validate(sigDig3(i), sigDig4(i)));
            findMethod(i, validate(sigDig2(i), sigDig1(i)), validate(sigDig4(i), sigDig3(i)));
            findMethod(i, validate(sigDig2(i), sigDig3(i)), validate(sigDig4(i), sigDig1(i)));

        }

    }
}

