package zadatci;

import javax.swing.JOptionPane;

public class Zadatak3 {
                                           //Prikazati koristenje "if + switch"
	public static void main(String[] args) {
		int br=Integer.parseInt(JOptionPane.showInputDialog("Broj sati provedenih za racunalom"));
		
		if (br<100) {
			System.out.println("hahah, noob");
		}
		else if (br>100 && br<300) {
			System.out.println("Malo manji noob...");
		}
		else if (br>300 && br<600) {
			System.out.println("dobar, dobar");
		}
		else if (br>600 && br<1000) {
			System.out.println("gg friend");
		}
		else if (br>1000 && br<2000) {
			System.out.println("True king");
		}
		else if (br>2000) {
			System.out.println("*mind blown*");
		}	
		switch (br) {
		
		case 100:
			System.out.println("svakako noob");
			break;
		case 300:
			System.out.println("skoro dobar");
			break;
		case 600:
			System.out.println("skoro gg");
			break;
		case 1000:
			System.out.println("almost king");
			break;
		case 2000:
			System.out.println("I'm almost mind blown");
			break;
		}

	}

}
