package zadatci;

import javax.swing.JOptionPane;

public class Zadatak2 {
                                                   //Prikazati koristenje "switch"
	
	public static void main(String[] args) {
		int d=Integer.parseInt(JOptionPane.showInputDialog("Koliko jedan tjedan ima dana?")); //d
		
		switch(d) {
		
					case 1:
					case 2:
					case 3:
					case 4:
					case 5:
					case 6:
					case 8:
					case 9:
					case 10:
						JOptionPane.showConfirmDialog(null,"Netocno, pokusati opet?");
						break;
					case 7:
						JOptionPane.showConfirmDialog(null,"Tocno");
						break;
					default: 
						JOptionPane.showConfirmDialog(null,"Niti blizu, pokusati opet?");
		}
  

	}

}
