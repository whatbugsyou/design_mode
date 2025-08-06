package main.composite;

import java.util.Iterator;

/**
 * Null iterator for leaf nodes
 */
public class NullIterator implements Iterator<MenuComponent> {
    
    @Override
    public boolean hasNext() {
        return false;
    }
    
    @Override
    public MenuComponent next() {
        return null;
    }
    
    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}