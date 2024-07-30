import java.util.HashMap;
import java.util.TreeSet;

public class Library {
    private HashMap<String, Book> booksByIsbn;
    private TreeSet<Book> booksByTitle;
    private HashMap<String, Member> members;

    public Library() {
        booksByIsbn = new HashMap<>();
        booksByTitle = new TreeSet<>();
        members = new HashMap<>();
    }

    public void addBook(Book book) {
        booksByIsbn.put(book.getIsbn(), book);
        booksByTitle.add(book);
    }

    public void removeBook(String isbn) {
        Book book = booksByIsbn.remove(isbn);
        if (book != null) {
            booksByTitle.remove(book);
        }
    }

    public Book findBookByIsbn(String isbn) {
        return booksByIsbn.get(isbn);
    }

    public TreeSet<Book> findAllBooks() {
        return booksByTitle;
    }

    public void registerMember(Member member) {
        members.put(member.getMemberId(), member);
    }

    public Member findMemberById(String memberId) {
        return members.get(memberId);
    }

    public void borrowBook(String memberId, String isbn) {
        Member member = members.get(memberId);
        Book book = booksByIsbn.get(isbn);

        if (member != null && book != null && book.isAvailable()) {
            member.borrowBook(book);
        } else {
            System.out.println("Cannot borrow book. Either the book is unavailable or member not found.");
        }
    }

    public void returnBook(String memberId, String isbn) {
        Member member = members.get(memberId);
        Book book = booksByIsbn.get(isbn);

        if (member != null && book != null && !book.isAvailable()) {
            member.returnBook(book);
        } else {
            System.out.println("Cannot return book. Either the book was not borrowed by this member or member not found.");
        }
    }
}
