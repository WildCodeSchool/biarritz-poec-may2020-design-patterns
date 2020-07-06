package delegation;

public class Child extends TypeA implements TypeB {

    private TypeB delegate = new TypeBImpl();

    @Override
    public void b() {
        delegate.b();
    }

//    public void c() {
//        delegate.c();
//    }

}
