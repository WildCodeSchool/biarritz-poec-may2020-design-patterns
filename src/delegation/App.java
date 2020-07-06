package delegation;

public class App {

    public static void main(String[] args) {
        Child c = new Child();
        c.a();
        c.b();
        c.c();
        System.out.println("is instance of TypeA: " + (c instanceof TypeA));
        System.out.println("is instance of TypeB: " + (c instanceof TypeB));
    }

}
