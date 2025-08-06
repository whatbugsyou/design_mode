package main.iterator;

public class BookShelfReverseIterator implements Iterator<Book> {
    private BookShelf bookShelf;
    private int index;
    
    public BookShelfReverseIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = bookShelf.getLength() - 1;
    }
    
    @Override
    public boolean hasNext() {
        return index >= 0;
    }
    
    @Override
    public Book next() {
        if (!hasNext()) {
            throw new IllegalStateException("No more elements");
        }
        Book book = bookShelf.getBookAt(index);
        index--;
        return book;
    }
}