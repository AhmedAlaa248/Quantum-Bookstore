public class PaperBook extends Book {
    int stock;


    public PaperBook(String isbn, String title, String author, int year, float price, int stock) {
        super(isbn, title, author, year, price);
        isPurchasable = true;
        this.stock = stock;
    }

    @Override
    public void buy(String address, int quantity, String email) throws Exception {
       if(this.isPurchasable) {
           if (quantity > stock) {
               throw new Exception("Not enough stock!");
           }
           stock -= quantity;
           System.out.println("Paper book bought , you need to pay " + quantity * price);
           System.out.println("It will be shipped to " + address);
       }
    }

    public int getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return "MY ISBN is: " + getIsbn() + ",Title: " + this.title + ", Author: "
                + this.author + ", Year: " + this.year + ", Price: " + this.price + ", Stock: " + this.stock;
    }
}
