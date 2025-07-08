public class ShowcaseBook extends Book {

    public ShowcaseBook(String isbn, String title, String author, int year, float price) {
        super(isbn, title, author, year, price);
    }

    @Override
    public void buy(String address, int quantity, String email) throws Exception {
        throw new Exception("This isn't for buying");
    }

    @Override
    public String toString() {
        return "MY ISBN is: " + getIsbn() + ",Title: " + this.title + ", Author: "
                + this.author + ", Year: " + this.year + ", Price: " + this.price;
    }
}
