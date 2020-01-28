import java.util.*;
class main
{
    public static void main(String[] args)
    {
        System.out.println("1.Enter details about customer?");
        System.out.println("2.dont want to enter details about customer?");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        random rand = new random();
        if(choice == 1)
        {
            System.out.print("Enter first name: ");
            String firstname = scan.nextLine();
            System.out.print("\nEnter lastname: ");
            String lastname = scan.nextLine();
            System.out.print("\nEnter id: ");
            int identity = scan.nextInt();
            customers customer = new customers(firstname,lastname, identity);
            customer.printfinfo();
            rand.Account();


        }
        else if(choice == 2)
        {
            System.out.print("\nEnter id: ");
            int identity = scan.nextInt();
            customers customer = new customers(identity);
            customer.printfinfo();
            rand.Account();

        }
        else
        {
            System.out.println("wrong choice");
        }
    }
}