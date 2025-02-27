package it.edu.iisgubbio.oggetti.fattoria;

public class Carne extends Prodotto {
	
	private boolean kosher;
	private boolean bianca;
	
	public Carne(String nome, double prezzoAlChilo, boolean kosher, boolean bianca) {
		super(nome, prezzoAlChilo);
		this.kosher = kosher;
		this.bianca = bianca;
	}
		
		public String toString(){
			String  descrizione=nome +" "+ prezzoAlChilo+"€/kg - ";
			if(!kosher) {
				descrizione+=" no kosher";
			}else {           
				descrizione+=" kosher";
			}
			if(!bianca) {
				descrizione+=" [carne rossa]";
			}else {
				descrizione+=" [carne bianca]";
			}
			return descrizione;
		}

		public boolean isKosher() {
			return kosher;
		}

		public boolean isBianca() {
			return bianca;
		}

		
		
	} 
	
	


