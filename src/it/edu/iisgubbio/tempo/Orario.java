package it.edu.iisgubbio.tempo;

public class Orario {
	private int ore;
	private int minuto;
	private int secondo;
	
	public Orario( int ore, int minuto,int secondo) {
		super();
		this.ore = ore;
		this.minuto = minuto;
		this.secondo = secondo;
	}
	@Override
	public String toString() {
		return "sono le "+ore+":"+minuto+":"+secondo;
	}
	public void aggiungiOre(int x) {
		ore=ore+x;
		
	}
	       @Overr
	public void aggiungiMinuto(int m) {
		 minuto=minuto+m;
		 if(minuto>=60) {
				int oreDaAggiungere=minuto/60;
				minuto=minuto%60;
				aggiungiOre(oreDaAggiungere);
		 }
		
	}
	public void aggiungiSecondo(int s) {
		secondo=secondo+s;
		if(secondo>=60) {
			int minutiDaAggiungere=secondo/60;
			secondo=secondo%60;
			aggiungiMinuto(minutiDaAggiungere);
		}
	}
	public void aggiungiOrario(Orario x) {
		aggiungiOre(x.ore);
		aggiungiMinuto(x.minuto);
		aggiungiSecondo(x.secondo);
	}
}

/* creare metodo aggiungi ore che aggiunge ore all'orario*/