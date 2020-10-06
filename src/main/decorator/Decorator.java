package main.decorator;

public class Decorator implements Base{
    private Base origin;

    public Decorator(Base origin) {
        this.origin = origin;
    }

    @Override
    public void dosomthing() {
        System.out.println("before do (decorated)");
        origin.dosomthing();
        System.out.println("after do (decorated)");
    }
}
