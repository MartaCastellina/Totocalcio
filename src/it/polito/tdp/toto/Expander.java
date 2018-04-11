package it.polito.tdp.toto;

import java.util.ArrayList;
import java.util.List;

public class Expander {

	private List<Schedina> soluzione;
	
	
	public List<Schedina> expand(Pronostico p){
		soluzione=new ArrayList<Schedina>(); //Vado a cancellare vari elenchi fatti 
		cerca(new Schedina(p.getN()),p,0);
		return soluzione;
	}
	
	
private void cerca(Schedina parziale, Pronostico p,int livello) {
	
	/*
	 * Stato della ricerca-->Schedina parziale
	 * Pronostico-->così so le opzioni da cercare
	 * Livello
	 */
	
	if (livello==p.getN()) {
		//Caso terminale, ho finito--> Ho una soluzione completa
//		System.out.println(parziale);
		
		//soluzione.add(parziale);
		/*
		 * 
		 * Lista soluzione contiene un riferimento all'oggetto schedina che in quel momento contiene la soluzione
		 * ma quell'oggetto schedina è sempre lo stessso
		 * Noi abbiamo oggetto unico 'parziale', creo unico oggetto Schedina
		 * e di lì tolgo e aggiungo elementi nella ricorsione, qui è l'errore.
		 * Devo fare nuova schedina copiando i valori di questa. Qui ci siamo solo copiati il riferimento
		 */
		soluzione.add(new Schedina(parziale));
		
		return;
		//Se ci potessero essere altre soluzioni basta togliere il return e dopo che ha analizzato
		//soluzione corrente e poi analizza le altre
	}
	
	Previsione mosse=p.get(livello);
	//Se livello =0 mi dà la prima partita, se livello=2 mi dà la terza partita ecc (indici partono da 0 in una lista)
	for (Risultato mossa:mosse.getValori()) {
		parziale.add(mossa); //prova la soluzione
		cerca(parziale,p,livello+1);
		parziale.removeLast(); //backtrack
	}
	
}


//Ogni volta che scendo di livello aggiungo una partita

/*
 *Problema parziale: Schedina 1-X, livello 2
 *Devo guardare pronostico p(2). Supponiamo sia X2
 *Allora genereerò le nuove soluzioni parziali 1-X-X,1-X-2 
 */
	
}
