package br.com.exercio.uri;

import java.util.Scanner;

import java.util.Locale;

public class _1010 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int CP1, CP2, QP1, QP2;
		double P1, P2, V;
		
		
		CP1 = sc.nextInt();
		QP1 = sc.nextInt();
		P1 = sc.nextDouble();
		
		CP2 = sc.nextInt();
		QP2 = sc.nextInt();
		P2 = sc.nextDouble();
		
		
		
		
		V = P1 * QP1 + P2 * QP2;
				
		System.out.printf("VALOR A PAGAR: R$ " +  "%.2f%n", V);
		
	

		sc.close();
		
		// ctrl + shift + o = importa classes
		
				
	}
	
}
