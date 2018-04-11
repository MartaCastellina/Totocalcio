package it.polito.tdp.toto;

//è elenco di previsioni

import java.util.ArrayList;
import java.util.List;

//è elenco di previsioni
//prendo il pronostico e lo espando in tante schedine, ogni schedina sarà

public class Pronostico {

	private int N;
	private List<Previsione> colonna;

	public Pronostico(int N) {
		this.N = N;
		colonna = new ArrayList<>();
	}
	
	public void add(Previsione p) {
		if(colonna.size()<N) {
			colonna.add(p) ;
		} else {
			throw new IllegalStateException("Too many elements in Proonostico") ;
		}
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder() ;
		for(Previsione p: colonna) {
			sb.append(p.toString()) ;
			sb.append("-") ;
		}
		sb.deleteCharAt(sb.length()-1) ;
		return sb.toString() ;
	}

	public Previsione get(int i) {
		
		return this.colonna.get(i);
		//Mi dice qual è la previsione di quella partita
	}

	
	public int getN() {
		return this.N;
	}
}
