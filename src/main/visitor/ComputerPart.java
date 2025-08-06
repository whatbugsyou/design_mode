package main.visitor;

/**
 * Element interface that accepts visitors
 */
public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}