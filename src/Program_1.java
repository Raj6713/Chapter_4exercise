/*Write a program which will take the miles and galons both integes and than will find out the average of the cart*/
import java.util.Scanner;
public class Program_1
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int miles ,gallons,total_miles,total_gallons;
        double average;
        total_gallons=total_miles=0;
        System.out.println("Enter the miles driven: ");
        miles=scanner.nextInt();
        System.out.println("Enter gallons consumed: ");
        gallons=scanner.nextInt();
        while(miles!=-1)
        {
            total_miles+=miles;
            total_gallons+=gallons;
            System.out.println("Enter the miles driven: ");
            miles=scanner.nextInt();
            System.out.println("Enter gallons consumed: ");
            gallons=scanner.nextInt();
        }
        System.out.printf("The average of the cart is %f",total_miles/total_gallons);

    }

}