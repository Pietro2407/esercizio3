package it.edu.iisgubbio.oggetti.fattoria;

public class Formaggio extends Prodotto{
	int tempoStagionatura;
	protected boolean dop;

	public Formaggio(String nome, double prezzoAlChilo, int tempoStagionatura, boolean dop) {
		super(nome, prezzoAlChilo);
		this.tempoStagionatura = tempoStagionatura;
		this.dop = dop;
	}

	public Formaggio(String nome, double prezzoAlChilo, int tempoStagionatura) {
		super(nome, prezzoAlChilo);
		this.tempoStagionatura = tempoStagionatura;
		this.dop=false;
	}
	public String toString() {
		if(dop==true) {
			if(tempoStagionatura>0) {
				return "Formaggio:"+ nome+ " costo al chilo "+ prezzoAlChilo+"€"+" stagionato " + tempoStagionatura + " mesi " +"  è dop ";
			}else {
				return "Formaggio:"+ nome+ " costo al chilo "+ prezzoAlChilo+"€" +" è dop";
			}
		}else {
			if(tempoStagionatura>0) {
				return "Formaggio:"+ nome+ " costo al chilo "+ prezzoAlChilo+"€" + " stagiontato " + tempoStagionatura + " mesi " +" non è dop ";
			}else {
				return "Formaggio:"+ nome+ " costo al chilo "+ prezzoAlChilo+"€" +" non è dop ";
			}
		}
	}

	public void setTempoStagionatura(int tempoStagionatura) {
		this.tempoStagionatura = tempoStagionatura;
	}

	public void setDop(boolean dop) {
		this.dop = dop;
	}
	
}



