package it.polito.tdp.toto;

import java.util.HashSet;
import java.util.Set;

//Previsione è un insieme di valori (un set di risultato)
//è set, non lista, perchè gli elementi non sono mai ripetuti
//Previsione è una riga della tabella del Totocalcio, ciascuna casellina è un risultato


public class Previsione {
	
	private Set<Risultato> valori ;
	
	public Previsione() {
		valori = new HashSet<>() ;
	}
	
	public Previsione(Risultato r1) {
		this() ;
		valori.add(r1) ;
	}

	public Previsione(Risultato r1, Risultato r2) {
		this() ;
		valori.add(r1) ;
		valori.add(r2) ;
	}

	public Previsione(Risultato r1, Risultato r2, Risultato r3) {
		this() ;
		valori.add(r1) ;
		valori.add(r2) ;
		valori.add(r3) ;
	}

	public void add(Risultato r) {
		valori.add(r) ;
	}
	
	public Set<Risultato> getValori() {
		return valori ;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder() ;
		for(Risultato r: valori) {
			sb.append(r.toString()) ;
		}
		return sb.toString() ;		
	}
}
