package it.edu.iisgubbio.oggetti.fattoria;

public class Muffato extends Formaggio{
	
	public String nomeMuffa;
	public boolean interno;
	
	public Muffato(String nome, double prezzoAlChilo,String nomeMuffa) {
		super(nome, prezzoAlChilo,0, false               );
		this.nomeMuffa = nomeMuffa;
		this.interno = true;
	}
	
	

}
