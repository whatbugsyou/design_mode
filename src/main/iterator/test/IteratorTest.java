package main.iterator.test;

import main.iterator.*;

public class IteratorTest {
    public static void main(String[] args) {
        System.out.println("=== Iterator Pattern Demo - BookShelf ===\n");
        
        // Create a bookshelf and add books
        BookShelf bookShelf = new BookShelf();
        bookShelf.addBook(new Book("Design Patterns", "Gang of Four", "978-0201633610"));
        bookShelf.addBook(new Book("Clean Code", "Robert Martin", "978-0132350884"));
        bookShelf.addBook(new Book("Effective Java", "Joshua Bloch", "978-0134685991"));
        bookShelf.addBook(new Book("Head First Design Patterns", "Freeman & Robson", "978-0596007126"));
        bookShelf.addBook(new Book("Java: The Complete Reference", "Herbert Schildt", "978-1260440232"));
        
        System.out.println("Total books: " + bookShelf.getLength());
        System.out.println();
        
        // Test forward iteration
        System.out.println("1. Forward iteration:");
        Iterator<Book> iterator = bookShelf.createIterator();
        int count = 1;
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(count + ". " + book.getTitle() + " by " + book.getAuthor());
            count++;
        }
        System.out.println();
        
        // Test reverse iteration
        System.out.println("2. Reverse iteration:");
        Iterator<Book> reverseIterator = bookShelf.createReverseIterator();
        count = 1;
        while (reverseIterator.hasNext()) {
            Book book = reverseIterator.next();
            System.out.println(count + ". " + book.getTitle() + " by " + book.getAuthor());
            count++;
        }
        System.out.println();
        
        // Test iterator independence
        System.out.println("3. Testing iterator independence:");
        Iterator<Book> iter1 = bookShelf.createIterator();
        Iterator<Book> iter2 = bookShelf.createIterator();
        
        System.out.println("Iterator 1 - First book: " + iter1.next().getTitle());
        System.out.println("Iterator 1 - Second book: " + iter1.next().getTitle());
        System.out.println("Iterator 2 - First book: " + iter2.next().getTitle());
        System.out.println();
        
        // Test enhanced for-loop style iteration (manual implementation)
        System.out.println("4. Enhanced iteration with custom method:");
        printAllBooks(bookShelf);
        System.out.println();
        
        // Test empty collection
        System.out.println("5. Testing empty collection:");
        BookShelf emptyShelf = new BookShelf();
        Iterator<Book> emptyIterator = emptyShelf.createIterator();
        System.out.println("Has books in empty shelf: " + emptyIterator.hasNext());
        
        // Test modification during iteration (adding book)
        System.out.println("\n6. Testing modification (adding book):");
        bookShelf.addBook(new Book("Spring in Action", "Craig Walls", "978-1617294945"));
        System.out.println("Added new book. Total books now: " + bookShelf.getLength());
        
        // Create new iterator to see the added book
        Iterator<Book> newIterator = bookShelf.createIterator();
        System.out.println("Books after addition:");
        count = 1;
        while (newIterator.hasNext()) {
            Book book = newIterator.next();
            System.out.println(count + ". " + book.getTitle());
            count++;
        }
    }
    
    // Helper method to demonstrate encapsulation of iteration logic
    private static void printAllBooks(BookShelf bookShelf) {
        Iterator<Book> iterator = bookShelf.createIterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println("📖 " + book.getTitle() + " (ISBN: " + book.getIsbn() + ")");
        }
    }
}