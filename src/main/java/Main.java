import Model.Book;
import Model.Member;
import Service.LibraryService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LibraryService libraryService = new LibraryService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Add Member");
            System.out.println("4. View All Members");
            System.out.println("5. Borrow Book");
            System.out.println("6. Return Book");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Book ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Book Author: ");
                    String author = scanner.nextLine();
                    libraryService.addBook(new Book(id, title, author, true));
                }
                case 2 -> libraryService.viewBooks();
                case 3 -> {
                    System.out.print("Enter Member ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Member Name: ");
                    String name = scanner.nextLine();
                    libraryService.addMember(new Member(id, name, java.time.LocalDate.now()));
                }
                case 4 -> libraryService.viewMembers();
                case 5 -> {
                    System.out.print("Enter Member ID: ");
                    int memberId = scanner.nextInt();
                    System.out.print("Enter Book ID: ");
                    int bookId = scanner.nextInt();
                    libraryService.borrowBook(memberId, bookId);
                }
                case 6 -> {
                    System.out.print("Enter Book ID to Return: ");
                    int bookId = scanner.nextInt();
                    libraryService.returnBook(bookId);
                }
                case 7 -> {
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
