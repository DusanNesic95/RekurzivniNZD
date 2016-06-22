package com.dusannesic.nzd;

public class NajveciZajednicniDelilac {

	public static int nadjiNZD(int[] ulaz) {
		int nzd = ulaz[0];
		
		for (int i = 1; i < ulaz.length; i++) {
			nzd = nzd(nzd, ulaz[i]);
		}
		
		return nzd;
	}

	private static int nzd(int a, int b) {
	  if(a == 0 || b == 0) return a+b;
	  return nzd(b,a%b);
	}
	
}
