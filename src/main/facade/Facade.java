package main.facade;

public class Facade {
    private A a;
    private B b;
    private C c;

    public Facade() {
        a = new A();
        b = new B();
        c = new C();
    }
    public void aDo(){
        a.doSomething();
    }
    public void bDo(){
        b.doSomething();
    }
    public void cDp(){
        c.doSomething();
    }
}
