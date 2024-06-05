package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double price = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double bought = sc.nextDouble();
		
		double converted = CurrencyConverter.converter(price, bought);
		double iof = CurrencyConverter.iof(converted);
		
		System.out.printf("Amout to be paid in reais = %.2f", converted + iof);
		
		sc.close();
		
	}

}
