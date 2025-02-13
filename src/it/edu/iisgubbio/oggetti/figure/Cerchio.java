package it.edu.iisgubbio.oggetti.figure;

public class Cerchio {
	double raggio;
	
	public Cerchio() {
		raggio=1;
	}
	public void setRaggio(double raggio) {
		this.raggio=raggio;
		
	}
	
	public double diametro() {
		return raggio+2;
	}
	public Cerchio(double raggio) {
		this.raggio = raggio;
	
	}
	public double circonferenza() {
		double c = raggio*2 *Math.PI;
		return c;
	}
	
	public double getRaggio() {
		return raggio;
	}
}
