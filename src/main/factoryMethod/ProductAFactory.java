package main.factoryMethod;

public class ProductAFactory extends AbstractFactory{
    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
