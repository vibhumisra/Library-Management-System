import java.util.Scanner;

public class LibraryManagementSystem {
    private static Library library = new Library();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initializeLibrary();
        showMenu();
    }

    private static void initializeLibrary() {
        // Adding books to the library
        library.addBook(new Book("Introduction to Algorithms", "Thomas H. Cormen", "9780262033848"));
        library.addBook(new Book("Artificial Intelligence: A Modern Approach", "Stuart Russell", "9780136042594"));
        library.addBook(new Book("Clean Code", "Robert C. Martin", "9780132350884"));
        library.addBook(new Book("Design Patterns: Elements of Reusable Object-Oriented Software", "Erich Gamma", "9780201633610"));
        library.addBook(new Book("Computer Networks", "Andrew S. Tanenbaum", "9780132126953"));
        library.addBook(new Book("Digital Design and Computer Architecture", "David Harris", "9780123944245"));
        library.addBook(new Book("The C Programming Language", "Brian W. Kernighan", "9780131103627"));
        library.addBook(new Book("Operating System Concepts", "Abraham Silberschatz", "9781118063330"));
        library.addBook(new Book("Principles of Compiler Design", "Alfred V. Aho", "9780201100884"));
        library.addBook(new Book("Computer Organization and Design", "David A. Patterson", "9780124077263"));
        library.addBook(new Book("Software Engineering: A Practitioner's Approach", "Roger S. Pressman", "9780078022128"));
        library.addBook(new Book("The Art of Computer Programming", "Donald E. Knuth", "9780201896848"));
        library.addBook(new Book("Fundamentals of Database Systems", "Ramez Elmasri", "9780133970777"));
        library.addBook(new Book("Computer Graphics: Principles and Practice", "James D. Foley", "9780321399526"));

        // Registering members to the library
        library.registerMember(new Member("Alice Smith", "M001"));
        library.registerMember(new Member("Bob Johnson", "M002"));
        library.registerMember(new Member("Charlie Brown", "M003"));
        library.registerMember(new Member("Diana Prince", "M004"));
        library.registerMember(new Member("Edward Elric", "M005"));
    }

    private static void showMenu() {
        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. List all books");
            System.out.println("2. Find book by ISBN");
            System.out.println("3. Add new book");
            System.out.println("4. Remove book");
            System.out.println("5. Register new member");
            System.out.println("6. Borrow book");
            System.out.println("7. Return book");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    listAllBooks();
                    break;
                case 2:
                    findBookByIsbn();
                    break;
                case 3:
                    addNewBook();
                    break;
                case 4:
                    removeBook();
                    break;
                case 5:
                    registerNewMember();
                    break;
                case 6:
                    borrowBook();
                    break;
                case 7:
                    returnBook();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void listAllBooks() {
        System.out.println("\nListing all books:");
        for (Book book : library.findAllBooks()) {
            System.out.println(book);
        }
    }

    private static void findBookByIsbn() {
        System.out.print("\nEnter ISBN: ");
        String isbn = scanner.nextLine();
        Book book = library.findBookByIsbn(isbn);
        if (book != null) {
            System.out.println(book);
        } else {
            System.out.println("Book not found.");
        }
    }

    private static void addNewBook() {
        System.out.print("\nEnter title: ");
        String title = scanner.nextLine();
        System.out.print("Enter author: ");
        String author = scanner.nextLine();
        System.out.print("Enter ISBN: ");
        String isbn = scanner.nextLine();
        library.addBook(new Book(title, author, isbn));
        System.out.println("Book added.");
    }

    private static void removeBook() {
        System.out.print("\nEnter ISBN: ");
        String isbn = scanner.nextLine();
        library.removeBook(isbn);
        System.out.println("Book removed.");
    }

    private static void registerNewMember() {
        System.out.print("\nEnter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter member ID: ");
        String memberId = scanner.nextLine();
        library.registerMember(new Member(name, memberId));
        System.out.println("Member registered.");
    }

    private static void borrowBook() {
        System.out.print("\nEnter member ID: ");
        String memberId = scanner.nextLine();
        System.out.print("Enter ISBN: ");
        String isbn = scanner.nextLine();
        library.borrowBook(memberId, isbn);
        System.out.println("Book borrowed.");
    }

    private static void returnBook() {
        System.out.print("\nEnter member ID: ");
        String memberId = scanner.nextLine();
        System.out.print("Enter ISBN: ");
        String isbn = scanner.nextLine();
        library.returnBook(memberId, isbn);
        System.out.println("Book returned.");
    }
}
