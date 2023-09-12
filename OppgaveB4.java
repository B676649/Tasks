package OppgåverU35;

import static javax.swing.JOptionPane.*;

public class OppgåveB4 {
	
		public static void main(String[] args) {
			
	

	double SATS0 = 0.0, SATS1 = 0.93/100, SATS2 = 2.41/100, SATS3 = 11.52/100, SATS4 = 14.52/100;
	
	int Trinn1 = 164101, Trinn2 = 230951, Trinn3 = 580651, Trinn4 = 934051;
	
		double Lønn = Double.parseDouble(showInputDialog("Lønn: "));
			double Skatt = 0;
		
			if (Lønn >= 0 && Lønn <= Trinn1)
					Skatt = Lønn * SATS0;
			else if (Lønn >= Trinn1 && Lønn <= Trinn2) {
					Skatt = Lønn * SATS1; }
			else if (Lønn >= Trinn2 && Lønn <= Trinn3) {
					Skatt = Lønn * SATS2; }
			else if(Lønn >= Trinn3 && Lønn <=Trinn4) {
					Skatt = Lønn * SATS3; }
			else if (Lønn <= Trinn4) {
					Skatt = Lønn * SATS4; }
			showMessageDialog(null, " Skatten din er: " + Skatt);
			

	}
}	
