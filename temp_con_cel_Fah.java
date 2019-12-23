import java.util.Scanner;
public class temp_con_cel_Fah{
    public static void main(String[]args){
        System.out.println("Enter the temperature you wanted to convert in to Fahrenheit");
        Scanner temp_scan = new Scanner (System.in);
        double temp_input = temp_scan.nextDouble();
        double temperature = 0;
        temperature = ((temp_input - 32 )*5)/9;
        System.out.println(temperature);
    }
}