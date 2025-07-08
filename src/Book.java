public abstract class Book {
    private String isbn;
    String title;
    String author;
    int year;
    float price;
    boolean isPurchasable;

    public Book(String isbn, String title, String author, int year, float price) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.year = year;
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public abstract void buy(String address, int quantity, String email) throws Exception;

    @Override
    public String toString() {
        return "MY ISBN is: " + this.isbn + ",Title: " + this.title + ", Author: "
                + this.author + ", Year: " + this.year + ", Price: " + this.price;
    }
}
