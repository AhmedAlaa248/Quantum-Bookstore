public class EBook extends Book {
    private String fileType;

    public EBook(String isbn, String title, String author, int year, float price, String fileType) {
        super(isbn, title, author, year, price);
        isPurchasable = true;
        this.fileType = fileType;
    }

    @Override
    public void buy(String address, int quantity, String email) throws Exception {
        if(quantity <= 0) {
            throw new Exception("Quantity must be greater than 0");
        }
        System.out.println("Ebook bought , you need to pay " + quantity * price);
        System.out.println("It will be sent to " + email);
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    @Override
    public String toString() {
        return "MY ISBN is: " + getIsbn() + ",Title: " + this.title + ", Author: "
                + this.author + ", Year: " + this.year + ", Price: " + this.price + ", Type: " + this.fileType;
    }
}
