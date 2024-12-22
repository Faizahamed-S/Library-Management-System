package Model;

import java.time.LocalDate;

public class Transaction {
    private int transactionId;
    private int memberId;
    private int bookId;
    private LocalDate borrowDate;
    private LocalDate returnDate;

    public Transaction(int transactionId, int memberId, int bookId, LocalDate borrowDate, LocalDate returnDate) {
        this.transactionId = transactionId;
        this.memberId = memberId;
        this.bookId = bookId;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }
    public int getTransactionId() {
        return transactionId;
    }
    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }
    public int getMemberId() {
        return memberId;
    }
    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }
    public int getBookId() {
        return bookId;
    }
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    public LocalDate getBorrowDate() {
        return borrowDate;
    }
    public void setBorrowDate(LocalDate borrowDate) {
        this.borrowDate = borrowDate;
    }
    public LocalDate getReturnDate() {
        return returnDate;
    }
    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }
    @Override
    public String toString() {
        return "Transaction [transactionId=" + transactionId + ", memberId=" + memberId + ", bookId=" + bookId
                + ", borrowDate=" + borrowDate + ", returnDate=" + returnDate + "]";
    }
}
