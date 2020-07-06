package decorator;

public class App {


    public static void main(String[] args) {
        ChristmasTree tree1 = new ChristmasTreeImpl();
        ChristmasTree tree2 = new BubbleLights(new Garland(new ChristmasTreeImpl()));


        System.out.println("tree1> " + tree1.decorate());
        System.out.println("tree2> " + tree2.decorate());

    }

}
