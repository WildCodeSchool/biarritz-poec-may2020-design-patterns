package delegation;

public class TypeBImpl implements TypeB {

    @Override
    public void b() {
        System.out.println("i know how to do b()");
    }

    public void c() {
        System.out.println("i know how to do c2()");
    }

}

