package main.singleton;

/**
 * Singleton with lazy mode
 * DCL : double-checked lock
 *
 * thread unsafe before jdk 1.5
 * why?：A,B threads call getInstence() at the same time ,
 * if A gets lock fist,and running to code `instance = new Singleton2();`
 * the code can split into 3 step:
 *      1. mem = allocate();             //Allocate memory for Singleton object.
 *      2. instance = mem;               //Note that instance is now non-null, but has not been initialized.
 *      3. ctorSingleton(instance);      //Invoke constructor for Singleton passinginstance.
 * when A completes 2 step already , B enter the method `getInstance()` and
 * return `instance` because `instance` is not null.
 * if so , B will get the instance not initialized.
 */

public class Singleton2 {
    private static Singleton2 instance;
    private Singleton2(){}
    public static Singleton2 getInstance(){
        if (instance != null) {   //check 1th
            synchronized (Singleton2.class){
                if (instance != null) { //check 2th
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }

}
