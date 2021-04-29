package ThinkingInJava.Excercises.Controlling_Execution;

public class Excercise5 {

    static String ternaryBitwisePrint(int a) {
        StringBuilder ans = new StringBuilder();
        if (a == 0) {
            return "0";
        } else {
            int b = Integer.numberOfLeadingZeros(a);
            a <<= b;
            for (int p = 0; p < 32 - b; p++) {
                int n = (Integer.numberOfLeadingZeros(a) == 0) ? 1 : 0;
                ans.append(n);
                a <<= 1;
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        int endWithZeros = 0xAAA;
        int endWithOnes = 0x555;
        System.out.println(ternaryBitwisePrint(endWithZeros));
        System.out.println(ternaryBitwisePrint(endWithOnes));
        System.out.println(ternaryBitwisePrint(endWithZeros ^ endWithOnes));
        System.out.println(ternaryBitwisePrint(~endWithOnes));
        System.out.println(ternaryBitwisePrint(endWithZeros & endWithOnes));
        System.out.println(ternaryBitwisePrint(endWithZeros | endWithOnes));
        System.out.println(ternaryBitwisePrint(~endWithZeros));


    }
}

