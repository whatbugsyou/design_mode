package main.singleton;

/**
 * Singleton with lazy mode by static inner class
 * 1. static inner classes are loaded only when they are used
 * 2. static members only init once by the java mechanism
 */
public class Singleton3 {
    private Singleton3(){}
    private static class SingletonHolder{
        private static Singleton3 instance = new Singleton3();
    }
    public static Singleton3 getInstance(){
        return SingletonHolder.instance;
    }
}
