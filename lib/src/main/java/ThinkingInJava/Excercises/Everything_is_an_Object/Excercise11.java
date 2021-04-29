package ThinkingInJava.Excercises.Everything_is_an_Object;

public class Excercise11 {

    public static void main(String[] args) {
        AllTheColorsOfTheRainbow allTheColorsOfTheRainbow = new AllTheColorsOfTheRainbow();
        System.out.println("color = " + allTheColorsOfTheRainbow.colors);
        allTheColorsOfTheRainbow.changeColor(45);
        allTheColorsOfTheRainbow.changeHue(8);
        System.out.println("New color: " + allTheColorsOfTheRainbow.colors);
        System.out.println("hue = " + allTheColorsOfTheRainbow.hue);

    }
}
class AllTheColorsOfTheRainbow {
    int colors = 1;
    int hue = 1;
    void changeHue(int newHue) {
        hue = newHue;
    }
    int changeColor(int newColor) {
        return colors = newColor;
    }
}
