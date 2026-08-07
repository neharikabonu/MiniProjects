public class Book {
  private int id;
  private String title;
  private String author;
  private String genre;
  private boolean isIssued;

  public Book (int id, String title, String author, String genre) {
    this.id = id;
    this.title = title;
    this.author = author;
    this.genre = genre;
    this.isIssued = false;
  }

  //setters

  public void setId(int id) {
    this.id = id;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public void setGenre (String genre) {
    this.genre = genre;
  }

  public void setIssued (boolean isIssued) {
    this.isIssued = isIssued;
  }

  //getters

  public int getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public String getGenre () {
    return genre;
  }

  public boolean isIssued () {
    return isIssued;
  }

  @Override
  public String toString() {
    return "ID: " + id +
           "\nTitle: " + title + 
           "\nAuthor: " + author +
           "\nGenre: " + genre +
           "\nAvailability: " + (isIssued ? "Issued" : "Available") +
           "\n\n===============================";
  }
}