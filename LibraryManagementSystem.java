import java.util.*;

// Book class to represent a book in the library
class Book {
    private String id;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Book ID: " + id + ", Title: " + title + ", Author: " + author + ", Available: " + isAvailable;
    }
}

// Library class to manage books and users
class Library {
    private List<Book> books;
    private Map<String, String> issuedBooks; // Map of Book ID to User

    public Library() {
        books = new ArrayList<>();
        issuedBooks = new HashMap<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void displayBooks() {
        System.out.println("\nBooks in the Library:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void issueBook(String bookId, String userId) {
        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                if (book.isAvailable()) {
                    book.setAvailable(false);
                    issuedBooks.put(bookId, userId);
                    System.out.println("Book issued successfully to User: " + userId);
                } else {
                    System.out.println("Book is already issued.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void returnBook(String bookId) {
        if (issuedBooks.containsKey(bookId)) {
            for (Book book : books) {
                if (book.getId().equals(bookId)) {
                    book.setAvailable(true);
                    issuedBooks.remove(bookId);
                    System.out.println("Book returned successfully.");
                    return;
                }
            }
        } else {
            System.out.println("Book is not issued.");
        }
    }
}

// Main class to test the library management system
public class LibraryManagementSystem {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("\nLibrary Management System:");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Book Author: ");
                    String author = scanner.nextLine();
                    library.addBook(new Book(id, title, author));
                    break;
                case 2:
                    library.displayBooks();
                    break;
                case 3:
                    System.out.print("Enter Book ID to issue: ");
                    String bookId = scanner.nextLine();
                    System.out.print("Enter User ID: ");
                    String userId = scanner.nextLine();
                    library.issueBook(bookId, userId);
                    break;
                case 4:
                    System.out.print("Enter Book ID to return: ");
                    String returnBookId = scanner.nextLine();
                    library.returnBook(returnBookId);
                    break;
                case 5:
                    System.out.println("Exiting Library Management System.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
