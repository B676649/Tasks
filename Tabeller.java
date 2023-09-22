package dat100_oblig_2.src.no.hvl.dat100.lab5.tabeller;

import java.lang.*;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		System.out.print("[ ");
		for (int i = 0; i < tabell.length; i++) {
		System.out.print(tabell[i] + ", ");
		}
		System.out.println("]");

	}

	// b)
	public static String tilStreng(int[] tabell) {
		String streng  = "[";
		for (int j = 0; j < tabell.length; j++) {
			if (j == tabell.length - 1) {
				streng += tabell[j];
			} else {
				streng += tabell[j] + ",";
			}
		}
		streng += "]";
		return streng;

	}

	// c)
	public static int summer(int[] tabell) {

		int r = 0;
		int sum = 0;
		for (int k = 0; k < tabell.length; k++) {
			sum = sum + tabell[k];	
		}
		System.out.println();
		System.out.print(sum);
		return sum; 
	
		}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("Metoden finnesTall ikke implementert");
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("Metoden posisjonTall ikke implementert");

	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden reverser ikke implementert");

	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");
	}
}
