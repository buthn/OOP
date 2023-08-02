import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regular_expressions {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        User email1 = new User();
        System.out.println("Enter Your Email: ");
        email1.email = scanner.next();

        System.out.println("Enter Your pasword: ");
        email1.pass = scanner.next();

        System.out.println(email1.EmailCheckPattre());
        System.out.println(email1.PasswordCheckPatten());




    }
}
class User {
    String email;
    String pass;


    Boolean EmailCheckPattre() {

        Pattern emailpatt = Pattern.compile("^[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?$");
        if (emailpatt.matcher(email).find()) {
            return true;
        }
        else {
            return false;
        }
    }
    Boolean PasswordCheckPatten(){
        Pattern passpattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$");
        if (passpattern.matcher(pass).find()) {
            return true;
        }
        else {
            return false;
        }
    }
}
class register {

}