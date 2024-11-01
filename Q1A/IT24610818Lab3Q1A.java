import java.util.Scanner;

public class IT24610818Lab3Q1A {
   
     public static void main(String[] args) {

Scanner input = new Scanner(System.in);
double pricePerKg;
double number;
double total;


System.out.println("Enter the price of 1kg of rice:");
pricePerKg = input.nextDouble();

System.out.println("Enter the number of kilograms you want to buy:");
number = input.nextDouble();

total = (pricePerKg*number);

 
System.out.println("The Total amount is:"+ total);
}
}

