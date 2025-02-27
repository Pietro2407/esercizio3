package it.edu.iisgubbio.oggetti.animali.cani;

public class Cuccia {
	private boolean interno;
	private double prezzo;
	private int numeroPosti;
	private String colore;
	private boolean proprietario;
	private int anno;
	
	public boolean isInterno() {
		return interno;
	}
	public void setInterno(boolean interno) {
		this.interno = interno;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public int getNumeroPosti() {
		return numeroPosti;
	}
	public void setNumeroPosti(int numeroPosti) {
		this.numeroPosti = numeroPosti;
	}
	public String getColore() {
		return colore;
	}
	public void setColore(String colore) {
		this.colore = colore;
	}
	public String toString() {

		if (colore==null) {
			if (interno=true) {
				return("prezzo"+ prezzo +"numero posti: "+numeroPosti+ "è da interno");
			}else {
				return ("prezzo"+ prezzo +"numero posti: "+numeroPosti+ "è da esterno");
			}
			
		}else {
			if(interno==false) {
				return ("prezzo"+ prezzo +"numero posti: "+numeroPosti+ "è da esterno"+ colore);
			}else {
				return("prezzo"+ prezzo +"numero posti: "+numeroPosti+ "è da interno");
			}
		}
	}
	
}
