package zadatci;

import javax.swing.JOptionPane;

public class Zadatak1 {
													//Prikazati koristenje "if"
	
		public static void main(String[] args) {
			int ust=Integer.parseInt(JOptionPane.showInputDialog("Kolicina ustedjevine"));     //ust
			int graf=Integer.parseInt(JOptionPane.showInputDialog("Cijena Graficke kartice")); //graf
			int ram=Integer.parseInt(JOptionPane.showInputDialog("Cijena Ram memorije"));      //ram
			int proc=Integer.parseInt(JOptionPane.showInputDialog("Cijena Procesora"));        //proc
			
			if(ust>= graf + ram + proc) {
				System.out.println("Dovoljno ustedjevine, kupovina moguca");
			}
			
			else {
				System.out.println("Nedovoljno ustedjevine, kupovina nije moguca");
			}
	}
	

}
