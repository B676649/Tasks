package OppgåverU35;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class OppgåveB5 {

	public static void main(String[] args) {

	//	 A = 90, B = 80, C = 60, D = 50, E = 40, F = 0;
		
		
			for (int i = 0; i < 10; i++) {
		int points = parseInt(showInputDialog(" Poeng: "));
		
		
			if (points > 100 || points < 0) {
				showMessageDialog(null, "ugyldig poengsum");
				i--;
 				}
			 
		 	else if(points>=90)  {
				showMessageDialog(null,"Karakter A");
			}
			else if(points>=80) {
				showMessageDialog(null,"Karakter B");
			}
			else if(points>=60) {
				showMessageDialog(null,"Karakter C");
			}
			else if(points>=50) {
				showMessageDialog(null,"Karakter D");
			}
			else if(points>=40) {
				showMessageDialog(null,"Karakter E");
			}
			else if(points>=0) {
				showMessageDialog(null,"Karakter F");
			}
	 	}
    }
 }
