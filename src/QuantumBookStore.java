import java.time.Year;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class QuantumBookStore {
    private Map <String, Book> books = new HashMap<>();

    public void addBook(Book b) {
        books.put(b.getIsbn(), b);
        System.out.println("Book: " + b.getIsbn() + " added successfully");
    }

    public void removeOutdatedBook(int numOfYears) {
        Iterator<Map.Entry<String, Book>> it = books.entrySet().iterator();
        while (it.hasNext()) {
            Book book = it.next().getValue();
            if(Year.now().getValue() - book.year > numOfYears) {
                it.remove();
                System.out.println("Book: " + book.getIsbn() + " removed successfully");
            }
        }
    }

    public void purchaseBook(String isbn, String email, String address, int quantity ) throws Exception {
        Book book = books.get(isbn);
        if (book != null) {
            if(book.isPurchasable){
                book.buy(address, quantity, email);
                return;
            }
            throw new Exception("This book is just a demo");
        }
        throw new Exception("Book not found");
    }
}
