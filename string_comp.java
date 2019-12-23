import java.util.Scanner;
public class string_comp{
    public static void main(String[] args) {
        String password = "let me in";
        System.out.println("Enter Password");
        Scanner scan = new Scanner(System.in);
        String pass = scan.nextLine();
        System.out.println(password.equals(pass));

    }
}