package it.polito.tdp.toto;

public enum Risultato {

	UNO, DUE, ICS;

	public String toString() {
		switch(this) {
		case UNO:
			return "1";
		case DUE:
			return "2";
		case ICS:
			return "X";
		default:
			return null;
		}
	}

}

/*
 * avremo una variabile che potr� contenere solamente un valore appartenente al set specificato
 * nella definizione dell�enum Giorno e contemporaneamente avremo a disposizione anche i nomi simbolici
 * (le costanti di prima) da usare nella scrittura del programma:
 * avendo definito:
 * public enum Giorno {
     
    LUNEDI,
    MARTEDI,
    MERCOLEDI,
    GIOVEDI,
    VENERDI,
    SABATO,
    DOMENICA // opzionalmente pu� terminare con ";"
}
 * 
 * 
 * 
 * 
 * 
 * possiamo usare:
 * 
 * Giorno.giornoDellaSettimana;
 * giornoDellaSettimana = Giorno.VENERDI;
 * 
 * 
 * 
 * 
 * Usando il costrutto Switch:
 * 
 * public class EnumTest {
	public enum Giorno { LUNEDI, MARTEDI, MERCOLEDI, GIOVEDI, VENERDI, SABATO, DOMENICA };
	
	public static void main(String[] args) {
		// scegliamo un valore
		Giorno giornoDellaSettimana = Giorno.GIOVEDI;
    
		// definiamo una logica 
		switch(giornoDellaSettimana){
			case LUNEDI:
				System.out.println("Oggi � Luned�");
				break;
			case MARTEDI:
				System.out.println("Oggi � Marted�");
				break;
			case MERCOLEDI:
				System.out.println("Oggi � Mercoled�");
				break;
			case GIOVEDI:
				System.out.println("Oggi � Gioved�");
				break;
			case VENERDI:
				System.out.println("Oggi � Venerd�");
				break;
			case SABATO:
				System.out.println("Oggi � Sabato");
				break;
			case DOMENICA:
				System.out.println("Oggi � Domenica");
				break;
		}
	}
}
Il risultato sar�:

Oggi � Gioved�
*/
