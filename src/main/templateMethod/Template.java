package main.templateMethod;

public abstract class Template {
    abstract void first();
    abstract void second();
    public final void templeteMethod(){
        first();
        //do some other operations
        second();
    }
}
