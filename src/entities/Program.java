package entities;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// fatorial N

		int n;
		int fatorialN = 1;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor de N: ");
		n = sc.nextInt();

		for (int i = n; i > 0; i--) {
			fatorialN *= i;
		}
		System.out.printf("FATORIAL = %d", fatorialN);
		sc.close();

	}

}
