package main.iterator;

/**
 * Iterator interface for traversing collections
 */
public interface Iterator<T> {
    boolean hasNext();
    T next();
}