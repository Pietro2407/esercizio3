package it.edu.iisgubbio.oggetti.fattoria;

public class Prodotto  {
	protected String nome;
	protected double prezzoAlChilo;
	
	
	public Prodotto(String nome, double prezzoAlChilo) {
		super();
		this.nome=nome;
		this.prezzoAlChilo=prezzoAlChilo;
	
	}
	public Prodotto() {
		super();
	}
	public String toString() {
		return "Prodotto[nome= + nome" + ", prezzoAlChilo=" + prezzoAlChilo;
	}
	public double calcolaPrezzo(double peso){
		return peso*prezzoAlChilo;
	}
}
