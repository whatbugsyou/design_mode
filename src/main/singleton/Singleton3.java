package main.singleton;

/**
 * Singleton with lazy mode by static inner class
 */
public class Singleton3 {
    Singleton3(){}
    private static class SingletonHolder{
        private static Singleton3 instance = new Singleton3();
    }
    public static Singleton3 getInstance(){
        return SingletonHolder.instance;
    }
}
