package librarymanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String id;
    private String name;
    private Long phoneNumber;
    private List<Book> borrowHistory;

    public Member(String id, String name, Long phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        borrowHistory = new ArrayList<>();
    }

    public void borrowBook(Book book){
        borrowHistory.add(book);
    }

    public void returnBook(Book book){
        borrowHistory.remove(book);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Book> getBorrowHistory() {
        return borrowHistory;
    }

    public void setBorrowHistory(List<Book> borrowHistory) {
        this.borrowHistory = borrowHistory;
    }
}
