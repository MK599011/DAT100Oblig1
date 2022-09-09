package no.hvl.dat100;

import java.util.Scanner;

public class Oppgave3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("skriv inn tallet du vil ha faktultet av: ");
		int n = sc.nextInt();
		long fakultet = 1;
		
		for (int i = 1; i<=n; i++) {
			fakultet *= i;
		}
		System.out.println("fakultet av " + n + " = " + fakultet);
	}

}