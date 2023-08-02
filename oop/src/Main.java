import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Book b = new Book("vvvvv",2.0000); // parameterize Constructor
        System.out.println(b.Name);
        System.out.println(b.price);
        System.out.println("=====================");

        Book book = new Book();
        book.Name = "Thing And Grow Reich";
        book.nameOfWriter = "Napoleon Hill";
        book.yearOFPublish = 1937;
        book.numberOfPaper = 100;
        book.countryOfPublishing = "US";
        book.dscr = "Help people to think like rich people";
        book.price = 5.000;

        book.BookDetails();
        book.Booking();







    }
}

class Book {
    Book(){
        System.out.println("Default Constructor: ");
    }
    Book( String BName, double Bprice){
        System.out.println("parameterize Constructor: ");
        System.out.println("the Book Name is: "+BName);
        System.out.println("the Book Salary is: "+Bprice);
        Name = BName;
        price = Bprice;
    }
    String Name;
    int yearOFPublish ;
    int numberOfPaper;
    String nameOfWriter;
    String countryOfPublishing;
    String dscr ;
    String img;
    double price;

    void BookDetails(){
        System.out.println("Book Details: ");
        System.out.println("Book Name: " +Name);
        System.out.println("Name Of Writer: " +nameOfWriter);
        System.out.println("Year OF Publish: " +yearOFPublish);
        System.out.println("Number Of Papers: " +numberOfPaper);
        System.out.println("Country Of Publishing: " +countryOfPublishing);
        System.out.println("Book description: " +dscr);
        System.out.println("Book Price: " +price);

    }

    void Booking(){

        Scanner read = new Scanner(System.in);
        System.out.println("please choose payment methods: (visa/ Cash");
        String payment = read.next();
        if(payment.equals("Visa"))
        {
            System.out.println("You choose visa");
            Scanner  pay = new Scanner(System.in);
            System.out.println("Enter Bank Name: ");
            String BankName =  pay.next();
            System.out.println("Enter Account Number: ");
            int accountNumber = pay.nextInt();

            System.out.println("Bank Name is: " +BankName);
            System.out.println("Account Number is: " +accountNumber);

        }
        else if(payment.equals("Cash"))
        {
            System.out.println("You choose Cash");
        }
        else {
            System.out.println("No Method selected");
        }

    }

}