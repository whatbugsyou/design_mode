package main.nullObject;

public class Normal extends Base {
    public Normal(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }
}
