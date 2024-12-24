package Service;

import Model.Book;
import Model.Member;
import Model.Transaction;

import java.util.ArrayList;
import java.util.List;

public class LibraryService{
    private List<Book> books;
    private List<Member> members;
    private List<Transaction> transactions;

    public LibraryService()
    {
        books=new ArrayList<>();
        members=new ArrayList<>();
        transactions=new ArrayList<>();
    }

    public void addBook(Book book)
    {
        books.add(book);
        System.out.println("Book added: "+ book);
    }

    public void viewBooks(){
        System.out.println("Available Books:");
        for(Book book:books){
            System.out.println(book);
        }
    }

    public void addMember(Member member){
        members.add(member);
        System.out.println("Member added: "+ member);
    }

    public void viewMembers(){
        System.out.println("Registered Members");
        for(Member member:members)
        {
            System.out.println(member);
        }
    }

    public void borrowBook(int memberId, int bookId){
        Book book=null;
        Member member=null;

        for(Book b:books)
        {
            if(b.getId()==bookId && b.isAvailable())
            {
                book=b;
                break;
            }
        }

        for(Member m:members)
        {
            if(m.getId()==memberId)
            {
                member=m;
                break;
            }
        }

        if(book==null)
        {
            System.out.println("Book not available or doesn't exist");
            return;
        }
        if(member==null)
        {
            System.out.println("Member not found.");
            return;
        }
        book.setAvailable(false);

        Transaction transaction=new Transaction(transactions.size()+1,memberId, bookId, java.time.LocalDate.now(),null);
        transactions.add(transaction);

        System.out.println("Book borrowed Successfully: "+ book);
    }

}

