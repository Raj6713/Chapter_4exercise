/*Write  a progrma which will calculate the salary of the person using the given attributes*/
import java.util.Scanner;
public class Salary
{
    public static void main(String[] args)
     {
         Scanner scanner=new Scanner(System.in);
         System.out.println("Enter the Employee id: ");
         String emp_id=scanner.nextLine();
         System.out.println("Enter total hours of work: ");
         int hours=scanner.nextInt();
         System.out.println("Enter wage rate: ");
         double wage_rate=scanner.nextDouble();
         double total=0;
         if(hours>0)
         {
             if(hours<40)
             total=wage_rate*hours;
             else
             total=(hours-40)*1.5*wage_rate+40*wage_rate;
         }
         System.out.printf("The total wage earned is $ %.2f",total);

    }
}