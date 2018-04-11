Scrivere un'applicazione per "espandere" una schedina Totocalcio.

Data una schedina in formato "compatto", stampare l'elenco completo delle colonne corrispondenti.

Ad esempio, data la schedina seguente:

```
1
1X
X2
```

//Qui sono solo 3 le partite per semplicità, il giocatore ha giocato:
per la prima partita 1
per la seconda partita 1X
per la terza X2.

La prima partita è sicuramente 1, la seconda o è 1 o è pari, la terza o è pari o è 2.
Si stamperanno quindi le seguenti colonne (Racchiudono tutte le possibili combinazioni vincenti)
(Questa era la colonna con scelta multipla, a questa corrisponderanno queste 4 giocate)
Se fai questa giocata tu paghi per 4 colonne, perchè idealmente sono 4 le possibili combinazioni in cui puoi vincere(disegno sotto)
//



si stamperanno le seguenti colonne:

```

1 1 1 1
1 X X 1 
X X 2 2
```
 
 //
 IL NOSTRO PROGRAMMA 
 dovrà partire dalla giocata e stampare tutte le colonne possibili a essa corrispondenti.
 //
 
 
 
 
 Commento:
 Ogni volta che scendo di livello aggiungo una partita. A liv. 0 prendo la prima partita, chiedo al pronostico quali siano
 i pronostici per tale partita.
 La ricorsione a livello 0 viene avviata con la schedina vuota.