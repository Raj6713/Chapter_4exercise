/*Write a program which will find out the credit card expenditure */
import java.util.Scanner;
public class Program_2
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        String Acc_no;
        double balance,item_cost,credit_lim,credit;
        System.out.println("Enter account number:");
        Acc_no=scanner.nextLine();
        System.out.println("Enter initial balance: ");
        balance=scanner.nextDouble();
        System.out.println("Enter item cost: ");
        item_cost=scanner.nextDouble();
        System.out.println("Enter credit limit: ");
        credit_lim=scanner.nextDouble();
        System.out.println("Enter the credited amount: ");
        credit=scanner.nextDouble();
        balance=balance+credit-item_cost;
        if(balance>item_cost)
        {
            balance=balance-item_cost;
            System.out.printf("The new Balance is given by: Rs. %f",balance);
        }
        else
        {
            System.out.println("Credit limit exceeded.");
        }
    }
}