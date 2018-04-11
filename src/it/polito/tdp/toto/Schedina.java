package it.polito.tdp.toto;

//elenco di risultati
//devo prendere un pronostico e espanderlo in schedina

import java.util.ArrayList;
import java.util.List;

public class Schedina {

	private int N;

	private List<Risultato> colonna;

	public Schedina(int N) {
		this.N = N;
		this.colonna = new ArrayList<Risultato>();
	}
	
	//clone constructor
		public Schedina (Schedina other) {
			this.N=other.N; //Travisa nel nuovo, N è colonna
			
			//NB non fare this.colonna=other.colonna; perchè tutti gli N oggetti punterebbero allo stesso oggetto
			//Devo copiare l'arrayList
			this.colonna=new ArrayList<>(other.colonna); //costruisco altro oggetto schedina che contiene all'interno 
		}

	public void add(Risultato valore) {
		if (colonna.size() < N) {
			colonna.add(valore);
		} else {
			throw new IllegalStateException("Too many elements in Schedina") ;
		}
	}

	public Risultato get(int partita) {
		return colonna.get(partita);
	}
	
	public void removeLast() {
		colonna.remove(colonna.size()-1); //Cancella l'ultimo elemento che avevi (Devo cancellare sempre e solo l'ultimo)
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Risultato r : colonna) {
			sb.append(r.toString());
			sb.append("-") ;
		}
		sb.deleteCharAt(sb.length()-1) ;
		return sb.toString();
	}
	
	

}
