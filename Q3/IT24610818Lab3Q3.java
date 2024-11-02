import java.util.Scanner;

public class IT24610818Lab3Q3{
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter the Rupee amout: ");
		int amount= input.nextInt();

		int C_5000,C_1000,C_500,C_200,C_100,C_50,C_20,C_10,C_5,C_2,C_1;

		C_5000 = amount/5000;
		amount = amount%5000;
		System.out.println("5000 Notes - "+C_5000);

		C_1000 = amount/1000;
		amount = amount%1000;
		System.out.println("1000 Notes - "+C_1000);

		C_500 = amount/500;
		amount = amount%500;
		System.out.println("500 Notes - "+C_500);

		C_200 = amount/200;
		amount = amount%200;
		System.out.println("200 Notes - "+C_200);

		C_100 = amount/100;
		amount = amount%100;
		System.out.println("100 Notes - "+C_100);

		C_50 = amount/50;
		amount = amount%50;
		System.out.println("50 Notes - "+C_50);

		C_20 = amount/20;
		amount = amount%20;
		System.out.println("20 Notes - "+C_20);

		C_10 = amount/10;
		amount = amount%10;
		System.out.println("10 Coins - "+C_10);

		C_5 = amount/5;
		amount = amount%5;
		System.out.println("5 Coins - "+C_5);

		C_2 = amount/2;
		amount = amount%2;
		System.out.println("2 Coins - "+C_2);

		C_1 = amount/1;
		amount = amount%1;
		System.out.println("1 Coins - "+C_1);
		
		}
}