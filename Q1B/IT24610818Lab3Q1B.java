import java.util.Scanner;

public class IT24610818Lab3Q1B {
   
     public static void main(String[] args) {

Scanner input = new Scanner(System.in);
double pricePerKg;
double number;
double total;
double discount;


System.out.println("Enter the price of 1kg of rice:");
pricePerKg = input.nextDouble();

System.out.println("Enter the number of kilograms you want to buy:");
number = input.nextDouble();

total = (pricePerKg*number);
discount= (total*0.9); 
 
System.out.println("The Total amount with 10% discount is:"+ discount);
}
}

