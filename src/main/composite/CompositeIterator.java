package main.composite;

import java.util.Iterator;
import java.util.Stack;

/**
 * Iterator for composite structure - traverses the entire tree
 */
public class CompositeIterator implements Iterator<MenuComponent> {
    private Stack<Iterator<MenuComponent>> stack = new Stack<>();
    
    public CompositeIterator(Iterator<MenuComponent> iterator) {
        stack.push(iterator);
    }
    
    @Override
    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        } else {
            Iterator<MenuComponent> iterator = stack.peek();
            if (!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }
    
    @Override
    public MenuComponent next() {
        if (hasNext()) {
            Iterator<MenuComponent> iterator = stack.peek();
            MenuComponent component = iterator.next();
            if (component instanceof Menu) {
                stack.push(component.createIterator());
            }
            return component;
        } else {
            return null;
        }
    }
    
    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}