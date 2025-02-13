package it.edu.iisgubbio.oggetti;

import it.edu.iisgubbio.oggetti.figure.Cerchio;
import it.edu.iisgubbio.oggetti.figure.TriangoloRettangolo;

public class ProvaFigure {

	public static void main(String[] args) {
		Cerchio c;
		c=new Cerchio(7);
		Cerchio p=new Cerchio(22);
		
		
		/*System.out.println(c.circonferenza());
		c.setRaggio(10);
		System.out.println(p.getRaggio());+*/
		
		
		TriangoloRettangolo t;
		t=new TriangoloRettangolo(6,3);
		
		System.out.println(t.toString());
		System.out.println(t.Ipotenusa());
		System.out.println(t.perimetro());
		System.out.println(t.area());
	}

}
