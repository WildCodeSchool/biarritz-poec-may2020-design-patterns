package singleton;

public class Singleton {


    // static variable instance of type Singleton
    private static Singleton instance = null;

    // variable of type String
    public String s;

    // private constructor restricted to this class itself
    private Singleton() {
        s = "Hello I am a string part of Singleton class";
    }

    // static method to create instance of Singleton class
    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }
}
