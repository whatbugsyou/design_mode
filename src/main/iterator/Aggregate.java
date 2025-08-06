package main.iterator;

/**
 * Aggregate interface that creates iterators
 */
public interface Aggregate<T> {
    Iterator<T> createIterator();
}