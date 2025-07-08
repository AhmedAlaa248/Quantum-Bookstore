import java.awt.print.Paper;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {

        QuantumBookStore bookStore = new QuantumBookStore();

        int x;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Click:" +
                    "\n1- To Add a Book" +
                    "\n2- To buy a book" +
                    "\n3- To remove an outdated book" +
                    "\n4- To quit the program");

            x = input.nextInt();
            if(x == 1){
                int x2;
                System.out.printf("Which to add: " +
                        "\n1- Ebook" +
                        "\n2- Paper book" +
                        "\n3- showcase book");

                x2 = input.nextInt();

                Scanner scanner = new Scanner(System.in);


                System.out.println("Enter the book ISBN: ");
                String isbn = scanner.nextLine();

                System.out.print("Enter book title: ");
                String title = scanner.nextLine();

                System.out.print("Enter author name: ");
                String author = scanner.nextLine();

                System.out.print("Enter publication year: ");
                int year = scanner.nextInt();

                System.out.print("Enter price: ");
                float price = scanner.nextFloat();


                Book b;

                if(x2 == 2){
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.print("Enter the book stock:");
                    int stock = scanner2.nextInt();
                    b = new PaperBook(isbn, title, author, year, price, stock);
                    bookStore.addBook(b);
                }
                else if(x2 == 1){
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("Enter the file type");
                    String fileType = scanner2.nextLine();
                    b = new EBook(isbn, title, author, year, price, fileType);
                    bookStore.addBook(b);
                }else if(x2 == 3){
                    b = new ShowcaseBook(isbn, title, author, year, price);
                    bookStore.addBook(b);
                }else
                {
                    System.out.println("Wrong choice");
                }
            }
            else if(x == 2){
                int x2;
                System.out.printf("Which to buy: " +
                        "\n1- Ebook" +
                        "\n2- Paper book" +
                        "\n3- showcase book");
                x2 = input.nextInt();

                Scanner scanner = new Scanner(System.in);


                System.out.println("Enter the book ISBN: ");
                String isbn = scanner.nextLine();

                if(x2 == 1){
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.printf("Enter book quantity: ");
                    int quantity = scanner2.nextInt();
                    System.out.println("Enter your email");
                    String email = scanner2.nextLine();
                    bookStore.purchaseBook(isbn, email, "", quantity);
                }else if(x2 == 2){
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.printf("Enter book quantity: ");
                    int quantity = scanner2.nextInt();
                    System.out.printf("Enter your address");
                    String address = scanner2.nextLine();
                    bookStore.purchaseBook(isbn, "", address, quantity);
                }else if(x2 == 3){
                    try {
                        bookStore.purchaseBook(isbn, "", "", 0);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
            else if(x == 3){
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter num of years");
                int num = scanner.nextInt();

                bookStore.removeOutdatedBook(num);
            }

        }while (x != 4);
    }
}