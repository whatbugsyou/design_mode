package main.bridge;

public class Star extends Shape{
    @Override
    public void description() {
        System.out.println(color.getColor()+" Star");
    }
}
