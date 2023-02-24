package main.factoryMethod;

public abstract class AbstractFactory {
    //bizCode is the so-called factory method.
    public void bizCode(){
        Product product = createProduct();
        product.work();
    }
    public abstract Product createProduct();
}
