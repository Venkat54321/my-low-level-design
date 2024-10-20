package librarymanagementsystem;

public class Main {
    public static void main(String[] args) {
        LibrarySystem librarySystem = LibrarySystem.getInstance();

        Book book1 = new Book("1","Book1","Venkat","123",true);
        Book book2 = new Book("2","Book2","Venkat1","123",true);
        Book book3 = new Book("3","Book3","Venkat2","123",true);
        Book book4 = new Book("4","Book4","Venkat3","123",true);
        Book book5 = new Book("5","Book5","Venkat4","123",true);
        Book book6 = new Book("6","Book6","Venkat5","123",true);

        Member member1 = new Member("1","Venkat",7353058795l);
        Member member2 = new Member("2","Venkat",7353058795l);
        Member member3 = new Member("3","Venkat",7353058795l);
        Member member4 = new Member("4","Venkat",7353058795l);
        Member member5 = new Member("5","Venkat",7353058795l);

        librarySystem.addBook(book1);
        librarySystem.addBook(book2);
        librarySystem.addBook(book3);
        librarySystem.addBook(book4);
        librarySystem.addBook(book5);
        librarySystem.addBook(book6);

        librarySystem.addMember(member1);
        librarySystem.addMember(member2);
        librarySystem.addMember(member3);
        librarySystem.addMember(member4);
        librarySystem.addMember(member5);

        librarySystem.borrowBook("2","2");
        librarySystem.borrowBook("2","3");
        librarySystem.borrowBook("2","4");
        librarySystem.borrowBook("2","5");
        librarySystem.borrowBook("2","6");

        librarySystem.borrowBook("1","2");

        librarySystem.borrowBook("3","3");
        librarySystem.returnBook("3","3");
    }
}
