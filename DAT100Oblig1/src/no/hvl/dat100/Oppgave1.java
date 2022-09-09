package no.hvl.dat100;

import java.util.Scanner;

public class Oppgave1 {

	public static void main(String[] args) {
		
		float netto = 0.00f;
		float skatt = 0.00f;
		float trinn0 = 0.00f;
		float trinn1 = 0.0093f;
		float trinn2 = 0.0241f;
		float trinn3 = 0.1152f;
		float trinn4 = 0.1452f;
		
		Scanner input = new Scanner(System.in);

		String funksjonTxt = "Skriv inn din bruttoinntekt:";

		System.out.println(funksjonTxt);
		System.out.print(">");

		float brutto = input.nextFloat();
		
		if (brutto >= 0 && brutto <= 164100) {
			skatt=brutto*trinn0;
			netto=brutto-skatt;
			System.out.println ("Din nettoinntekt er:" + netto + "kr");
			System.out.println ("Du betaler skatt på:" + skatt + "kr");
		}
		else if (brutto >= 164101 && brutto <= 230950) {
			skatt=brutto*trinn1;
			netto=brutto-skatt;
			System.out.println ("Din nettoinntekt er:" + netto + "kr");
			System.out.println ("Du betaler skatt på:" + skatt + "kr");
		}
		else if (brutto >= 230951 && brutto <= 580650) {
			skatt=brutto*trinn2;
			netto=brutto-skatt;
			System.out.println ("Din nettoinntekt er:" + netto + "kr");
			System.out.println ("Du betaler skatt på:" + skatt + "kr");
		}
		else if (brutto >= 580651 && brutto <= 934050) {
			skatt=brutto*trinn3;
			netto=brutto-skatt;
			System.out.println ("Din nettoinntekt er:" + netto + "kr");
			System.out.println ("Du betaler skatt på:" + skatt + "kr");
		}
		else if (brutto >= 934050) {
			skatt=brutto*trinn4;
			netto=brutto-skatt;
			System.out.println ("Din nettoinntekt er:" + netto + "kr");
			System.out.println ("Du betaler skatt på:" + skatt + "kr");
		}
		
		else {
			System.out.println("Ugyldig verdi");
		}
		}

		
	}
	


