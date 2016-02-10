/*Write a program which will calculate the sales commision and than will show it on the screen */
import java.util.Scanner;
public class Commision
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int i=1;
        double base_salary,item_price,total_price;
        String sales_id;
        total_price=0.0;

        System.out.println("Enter the salesman id: ");
        sales_id=scanner.nextLine();

        System.out.println("Enter items sold by salesman: ");
        int item_sold=scanner.nextInt();

        while(item_sold>0)
        {
            System.out.printf("Enter price of Item:%f ",i);
            item_price=scanner.nextDouble();
            total_price+=item_price;
            item_sold-=1;
            i+=1;
        }
        base_salary=200;
        base_salary+=(0.09)*total_price;
        System.out.printf("Sales_id:%s\nTotal cost of item sold:%f\nWeekly salary:%f",sales_id,total_price,base_salary);
    }
}