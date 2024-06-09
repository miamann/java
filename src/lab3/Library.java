package lab3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("добавленные книги: " + book);
    }

    public void removeBook(String isbn) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getIsbn().equals(isbn)) {
                iterator.remove();
                System.out.println("измененные книги: " + book);
                return;
            }
        }
        System.out.println("книга с таким ISBN " + isbn + " не найдена.");
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("таких книг нет в библиотеке");
        } else {
            System.out.println("книга в библиотеке:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "1234567890");
        Book book2 = new Book("1984", "George Orwell", "1234567891");
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", "1234567892");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.displayBooks();
        library.removeBook("1234567891");
        library.displayBooks();
    }
}
