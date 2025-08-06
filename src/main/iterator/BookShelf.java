package main.iterator;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Aggregate<Book> {
    private List<Book> books;
    
    public BookShelf() {
        this.books = new ArrayList<>();
    }
    
    public void addBook(Book book) {
        books.add(book);
    }
    
    public void removeBook(Book book) {
        books.remove(book);
    }
    
    public Book getBookAt(int index) {
        if (index >= 0 && index < books.size()) {
            return books.get(index);
        }
        return null;
    }
    
    public int getLength() {
        return books.size();
    }
    
    @Override
    public Iterator<Book> createIterator() {
        return new BookShelfIterator(this);
    }
    
    // Create a reverse iterator
    public Iterator<Book> createReverseIterator() {
        return new BookShelfReverseIterator(this);
    }
}