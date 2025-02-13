package it.edu.iisgubbio.oggetti.figure;

public class TriangoloRettangolo {
	private double base;
	private double altezza;
	
	
	public TriangoloRettangolo(double base, double altezza){
		this.base=base;
		this.altezza=altezza;
	}
	public double Ipotenusa() {
		double i=Math.sqrt(base*base)+(altezza*altezza);
		return i;
	}
	public double perimetro() {
		double p=base+altezza+Ipotenusa();
		return p;
	}
	public double area() {
		double a=(base*altezza)/2;
		return a;
	}
	public String toString() {
		return "TriangoloRettangolo "+ base +" x "+altezza;
	}
}
