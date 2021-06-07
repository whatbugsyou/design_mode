package main.prototype;

public abstract class ProtypeAbs implements Cloneable {

    @Override
    public SimplePrototype clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (SimplePrototype) clone;
    }
}
