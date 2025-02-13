package it.edu.iisgubbio.oggetti.animali.test;

import it.edu.iisgubbio.oggetti.animali.cani.Cane;
import it.edu.iisgubbio.oggetti.animali.cani.Cuccia;

public class ProvaAnimali {

	public static void main(String[] args) {
		Cane briciola;
		Cane artù;
		Cuccia 	casa;
		
		briciola=new Cane("briciola", "bastardino",  "Brunetti", 2010, 500);
		artù=new Cane("artù", "koker", "io", 2011,500);
		casa = new Cuccia();
		casa.setPrezzo(87);
		casa.setNumeroPosti(1);
		casa.setInterno(false);
		
		System.out.println(briciola);
		System.out.println(artù);
		
		
	}
	

}
