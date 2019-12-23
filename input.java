import java.util.Scanner;

public class input{
    public static void main(String[]args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter some numbers");
        double input = scan.nextDouble();
        System.out.println("Entered Value is:");
        System.out.println(input);
        Scanner scanw = new Scanner (System.in);
        System.out.println("Enter some text");
        String word = scanw.nextLine();
        System.out.println("you typed :");
        System.out.println(word);
    }
}