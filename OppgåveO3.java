package OppgåverU35;

import java.util.Scanner;

public class OppgåveO3 {

	public static void main(String[] args) {
			
		Scanner number = new Scanner(System.in);
		
			System.out.println("Enter a number: ");
			
		int n = number.nextInt();
		
			if (n < 0) {
			System.out.println("Negative numbers are not valid"); }
				else {
					int faculty= 1;
				for (int i = 1; i <= n; i++) {
						faculty *= i;
						
					}
					System.out.println(n + "! = " + faculty);
						number.close();
				}
			}		
	}
