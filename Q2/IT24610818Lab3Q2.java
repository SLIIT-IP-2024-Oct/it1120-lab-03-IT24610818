import java.util.Scanner;

public class IT24610818Lab3Q2 {
   
     public static void main(String[] args) {
Scanner input = new Scanner(System.in);
double Amount;
double hours;
double hourlyrate;
double Monthlysalary;
double Totalsalary;

System.out.println("Enter the monthly salary:");
Monthlysalary = input.nextDouble();

System.out.println("Enter the number OT hours:");
hours = input.nextDouble();

System.out.println("Enter the OT hourly rate:");
hourlyrate = input.nextDouble();

Amount = (hours*hourlyrate);
Totalsalary = (Monthlysalary+Amount);

System.out.println("The total salary including OT is:"+ Totalsalary);
}

}