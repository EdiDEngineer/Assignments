package ThinkingInJava.Excercises.Everything_is_an_Object;


import static net.mindview.util.Print.*;

/** Class creating and testing tree objects
 */
public class Excercise16 {


    public static void main(String[] args) {

        for(int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("overloaded method");
        }
        // Overloaded constructor:
        new Tree();
           }
}

/**  class  type Tree
 */
class Tree {
    /** field height
     */
    int height;

    /** no argument constructor
     */
    Tree() {
        print("Planting a seedling");
        height = 0;
    }
    /** constructor taking an int and assigns to height
     *
     */

    Tree(int initialHeight) {
        height = initialHeight;
        print("Creating new Tree that is " +
                height + " feet tall");
    }
    /** method printing the tree height
     */
    void info() {
        print("Tree is " + height + " feet tall");
    }
    /** method printing string argument and tree height
     */
    void info(String s) {
        print(s + ": Tree is " + height + " feet tall");
    }
}