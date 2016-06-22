package com.dusannesic.main;

import java.util.Scanner;

import com.dusannesic.nzd.NajveciZajednicniDelilac;

public class Main {

	public static void main(String[] args) {
		int[] niz = new int[10];
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Unesite elemente niza:");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = scan.nextInt();
		}
		
		int c = NajveciZajednicniDelilac.nadjiNZD(niz);
		
		System.out.println("rezultat: " + c);
		
		scan.close();
	}
	
}
