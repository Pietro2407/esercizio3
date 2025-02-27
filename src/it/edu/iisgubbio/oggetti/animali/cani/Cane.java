package it.edu.iisgubbio.oggetti.animali.cani;

public class Cane {
	public String nome;
	public String razza;
	public String nomeProprietario;
	public int anno;
	public int grammiCibo;
	
	public  Cane() {
		/*nome="";
		razza="";
		nomeProprietario="";
		anno=0;
		grammiCibo=0;*/
	}
	
	public Cane(String nome, String razza, String nomeProprietario, int anno, int grammiCibo) {
		super();
		this.nome = nome;
		this.razza = razza;
		this.nomeProprietario = nomeProprietario;
		this.anno = anno;
		this.grammiCibo = grammiCibo;
	}
	public String toString() {
		return "nome cane: "+nome+" anno di nascita: "+anno+" nome proprietario "+nomeProprietario;
	}
	public boolean verificaProprietario(String nome) {
		if(nomeProprietario.equals(nome)) {
			return true;
		}else {
			return false;
		}
	}
	public int età(int anno) {
		return anno-this.anno;
	}
}
