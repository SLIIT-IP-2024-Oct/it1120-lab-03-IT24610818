import java.util.Scanner;
public class IT24610818Lab3Q4{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a five-digit number: ");
		int amount = input.nextInt();

		int no1, no2, no3, no4, no5;
		no1 = amount/10000;
		amount = amount%10000;

		no2 = amount/1000;
		amount = amount%1000;

		no3 = amount/100;
		amount = amount%100;

		no4 = amount/10;
		amount = amount%10; 

		no5 = amount;

		System.out.println(no1 + " " + no2 + " " + no3 + " " + no4 + " " + no5); 

	}
}