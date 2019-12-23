import java.util.Scanner;
public class table{
    public static void main(String[]args){
        System.out.println("Enter the number you want to print table: ");
        Scanner num_scan = new Scanner (System.in);
        int num_input = num_scan.nextInt();
        System.out.println("TABLE!");
        for(int i = 1 ; i <= 10 ; i++){
            System.out.println(i +" x "+ num_input + " = " + i*num_input);
        }
    }
}