
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LibraryManagement management = new LibraryManagement();

        int choice;

        do {
            System.out.println("================Library-Management-System================");
            System.out.println();
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search book");
            System.out.println("4. Update Book");
            System.out.println("5. Delete Book");
            System.out.println("6. Issue Book");
            System.out.println("7. Return Book");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    Book existingBook = management.searchBook(id);

                    if (existingBook != null) {
                        System.out.println("Book already exists.");
                        break;
                    }

                    System.out.print("Enter title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter author: ");
                    String author = sc.nextLine();

                    System.out.print("Enter genre: ");
                    String genre = sc.nextLine();

                    Book newBook = new Book(id, title, author, genre);
                    management.addBook(newBook);
                }

                case 2 -> {
                    management.viewBooks();
                }

                case 3 -> {

    int searchChoice;

    do {
        System.out.println("\n===== Search Book =====");
        System.out.println("1. Search by ID");
        System.out.println("2. Search by Title");
        System.out.println("3. Search by Author");
        System.out.println("4. Search by Genre");
        System.out.println("5. Back");

        System.out.print("Enter your choice: ");
        searchChoice = sc.nextInt();
        sc.nextLine();

        switch (searchChoice) {

            case 1 -> {
                System.out.print("Enter Book ID: ");
                int id = sc.nextInt();

                Book book = management.searchBook(id);

                if (book == null) {
                    System.out.println("Book not found.");
                } else {
                    System.out.println(book);
                }
            }

            case 2 -> {
                System.out.print("Enter Book Title: ");
                String title = sc.nextLine();

                Book book = management.searchBookByTitle(title);

                if (book == null) {
                    System.out.println("Book not found.");
                } else {
                    System.out.println(book);
                }
            }

            case 3 -> {
                System.out.print("Enter Author Name: ");
                String author = sc.nextLine();

                ArrayList<Book> books = management.searchBookByAuthor(author);

                if (books.isEmpty()) {
                    System.out.println("No books found.");
                } else {
                    for (Book book : books) {
                        System.out.println(book);
                    }
                }
            }

            case 4 -> {
                System.out.print("Enter Genre: ");
                String genre = sc.nextLine();

                ArrayList<Book> books = management.searchBookByGenre(genre);

                if (books.isEmpty()) {
                    System.out.println("No books found.");
                } else {
                    for (Book book : books) {
                        System.out.println(book);
                    }
                }
            }

            case 5 -> {
                // Back to main menu
            }

            default -> {
                System.out.println("Invalid choice.");
            }
        }

    } while (searchChoice != 5);
}

                case 4 -> {
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    Book book = management.searchBook(id);

                    if (book == null) {
                        System.out.println("Book not found.");
                        break;
                    }

                    System.out.print("Enter new title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter new author: ");
                    String author = sc.nextLine();

                    System.out.print("Enter new genre: ");
                    String genre = sc.nextLine();

                    management.updateBook(id, title, author, genre);
                }

                case 5 -> {
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();

                    management.deleteBook(id);
                }

                case 6 -> {
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();

                    management.issueBook(id);
                }

                case 7 -> {
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();

                    management.returnBook(id);
                }

                case 8 -> {
                    System.out.println("Thank you for using Library Management System!");
                }

                default -> {
                    System.out.println("Invalid choice. Please try again.");
                }
            }
        } while (choice != 8);

        sc.close();
    }
}
