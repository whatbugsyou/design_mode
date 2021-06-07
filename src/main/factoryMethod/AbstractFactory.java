package main.factoryMethod;

public abstract class AbstractFactory {
    public void bizCode(){
        Product product = createProduct();
        product.work();
    }
    public abstract Product createProduct();
}
