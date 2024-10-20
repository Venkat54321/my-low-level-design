package librarymanagementsystem;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LibrarySystem {
    private static LibrarySystem instance = null;
    private Map<String,Member> members;
    private  Map<String,Book> books;

    private LibrarySystem() {
        members = new ConcurrentHashMap<>();
        books = new ConcurrentHashMap<>();
    }

    public static LibrarySystem getInstance(){
        if(instance == null){
            instance = new LibrarySystem();
        }
        return instance;
    }

    public void addBook(Book book){
        books.put(book.getId(),book);
    }

    public void removeBook(Book book){
        books.remove(book.getId());
    }

    public void addMember(Member member){
        members.put(member.getId(),member);
    }

    public void removeMember(Member member){
        members.remove(member.getId());
    }

    public boolean searchBook(Book book){
        if(books.containsKey(book.getId())){
            return true;
        }
        return false;
    }

    public void borrowBook(String memberId, String bookId){
        Book book = books.get(bookId);
        Member member = members.get(memberId);

        if(member.getBorrowHistory().size() >= 4){
            System.out.println("Maximum number of books borrow reached, so return book then borrow it again.");
        }else{
            member.borrowBook(book);
            book.setAvailable(false);
            System.out.println("Borrow book successfully.");
        }
    }

    public void returnBook(String memberId, String bookId){
        Book book = books.get(bookId);
        Member member = members.get(memberId);

        if(member != null) {
            member.returnBook(book);
            book.setAvailable(true);
            System.out.println("member return book successfully.");
        }
    }

}
