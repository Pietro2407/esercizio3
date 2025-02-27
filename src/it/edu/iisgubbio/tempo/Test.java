package it.edu.iisgubbio.tempo;

public class Test {

	public static void main(String[] args) {
		Orario fineLezione=new Orario(13,35,00);
	
	System.out.println(fineLezione.toString());
	fineLezione.aggiungiMinuto(8);
	System.out.println(fineLezione.toString());
	fineLezione.aggiungiSecondo(30);
	System.out.println(fineLezione.toString());
	fineLezione.aggiungiSecondo(30);
	System.out.println(fineLezione.toString());
	
	Orario inPiù=new Orario (1,50,30);
	fineLezione.aggiungiOrario(inPiù);
	System.out.println(fineLezione.toString());
	}
}
/* creare una istanza di orario che rappresenti l'ora di fine lezioni*/