package ThinkingInJava.Excercises.Access_Control;

class Initnew {
    int one = 33;
    public String set = "r";
    protected double kol = 5.22;
    private float cam = 8.3f;

    void print() {
        System.out.println(one);
    }

    public void printPublic() {
        System.out.println(set);
    }

    protected void printProtected() {
        System.out.println(kol);
    }

    private void printPrivate() {
        System.out.println(cam);
    }

}


public class Excercise5 {

    public static void main(String[] args) {
        Initnew i = new Initnew();
        i.kol = 3.4;
        i.one = 20;
        i.set = "434";
        //i.cam private compiler error
        i.print();
        i.printProtected();
        i.printPublic();
       // i.printPrivate(); private compiler error
    }
}

