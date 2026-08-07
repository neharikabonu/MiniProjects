import java.util.ArrayList;

public class LibraryManagement {
  private ArrayList<Book> books = new ArrayList<>();

  //add book
  public void addBook(Book book) {
    books.add(book);
  }

  //view books
  public void viewBooks() {
    if (books.isEmpty()) {
      System.out.println("No books found");
    } else {
      for (Book book : books) {
        System.out.println(book);
      }
    }
  }

  //search
  public Book searchBook(int id) {
    for (Book book : books) {
      if (book.getId() == id) {
        return book;
      }
    }
    return null;
  }

  //search by title

  public Book searchBookByTitle(String title) {
    for (Book book : books) {
        if (book.getTitle().equalsIgnoreCase(title)) {
            return book;
        }
    }
    return null;
  }

  // Search by genre
public ArrayList<Book> searchBookByGenre(String genre) {
    ArrayList<Book> result = new ArrayList<>();

    for (Book book : books) {
        if (book.getGenre().equalsIgnoreCase(genre)) {
            result.add(book);
        }
    }

    return result;
}
 

//search by author

public ArrayList<Book> searchBookByAuthor(String author) {
    ArrayList<Book> result = new ArrayList<>();

    for (Book book : books) {
        if (book.getAuthor().equalsIgnoreCase(author)) {
            result.add(book);
        }
    }

    return result;
}

  //update
  public void updateBook(int id, String title, String author, String genre) {
    Book book = searchBook(id);

    if (book == null) {
      System.out.println("No such book present");
      return;
    }

    book.setTitle(title);
    book.setAuthor(author);
    book.setGenre(genre);
  }

  //delete
  public void deleteBook(int id) {
    Book book = searchBook(id);

    if (book == null) {
      System.out.println("Book not found.");
      return;
    }

    books.remove(book);
    System.out.println("Book deleted successfully.");
  }

  //issue book

  public void issueBook(int id) {
    Book book = searchBook(id);

    if (book == null) {
      System.out.println("Book not found.");
      return;
    }

    if (book.isIssued()) {
      System.out.println("Book is already issued.");
    } else {
      book.setIssued(true);
      System.out.println("Book issued successfully.");
    }
  }

  //return book
  public void returnBook(int id) {
    Book book = searchBook(id);

    if (book == null) {
      System.out.println("Book not found.");
      return;
    }

    if (!book.isIssued()) {
      System.out.println("Book is already available / returned");
    } else {
      book.setIssued(false);
      System.out.println("Book returned successfully");
    }
  }
}