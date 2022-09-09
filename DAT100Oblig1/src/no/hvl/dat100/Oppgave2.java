package no.hvl.dat100;

import java.util.Scanner;

public class Oppgave2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Hvilken poengsum fikk elev nr " + i + "?");
			int poengsum = sc.nextInt();
			while(poengsum > 100 || poengsum < 0)
			{
				
				System.out.println("Invalid input, Hvilken poengsum fikk eleven?");
				poengsum = sc.nextInt();
				
			}
			
			if (poengsum < 40) {
				System.out.println("F");
			} else if (poengsum > 39 && poengsum < 50) {
				System.out.println("E");
			} else if (poengsum > 49 && poengsum < 60) {
				System.out.println("D");
			} else if (poengsum > 59 && poengsum < 80) {
				System.out.println("C");
			} else if (poengsum > 79 && poengsum < 90) {
				System.out.println("B");
			} else if (poengsum > 89 && poengsum <= 100) {
				System.out.println("A");
		}
		}
	}
	}
