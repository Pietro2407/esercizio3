package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MinimoMassimo extends Application{
	TextField tfNumeri=new TextField();
	Button bMinimo=new Button("minimo");
	Button bMassimo=new Button("massimo");
	Label lMinimo=new Label("??");
	Label lMassimo=new Label("??");
	
	
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		principale.add(tfNumeri, 0, 0,5,1);
		principale.add(bMinimo, 0, 1);
		principale.add(bMassimo, 1, 1);
		principale.add(lMinimo, 0,2);
		principale.add(lMassimo, 1,2);
		principale.setHgap(10);
		principale.setVgap(10);
		principale.setHgap(10);
		Insets spazio = new Insets(15);
		principale.setPadding(spazio);
		
		
		Scene scena = new Scene(principale);
		finestra.setTitle("CERCA");
		finestra.setScene(scena);
		finestra.show();

		bMinimo.setOnAction( e -> eseguiMinimo() );
		bMassimo.setOnAction( e -> eseguiMassimo() );
	}
	private void eseguiMinimo(){
		int minimo;
		String testo, parti[];
		testo=tfNumeri.getText();
		parti=testo.split(" ");
		int numeri[]=new int [parti.length];
		for (int i=0; i<parti.length; i++) {
			numeri[i]=Integer.parseInt(parti[i]);
		}
		minimo=numeri[0];
		for(int i=1; i<numeri.length; i++) {	
			if(numeri[i]<minimo) {
				minimo=numeri[i];
			}
			
		}
		lMinimo.setText("" + minimo);
	}
	private void eseguiMassimo(){
		int massimo;
		String testo, parti[];
		testo=tfNumeri.getText();
		parti=testo.split(" ");
		int numeri[]=new int [parti.length];
		for (int i=0; i<parti.length; i++) {
			numeri[i]=Integer.parseInt(parti[i]);
		}
		massimo=numeri[0];
		for(int i=1; i<numeri.length; i++) {	
			if(numeri[i]>massimo) {
				massimo=numeri[i];
			}
			
		}
		lMassimo.setText("" + massimo);
	}


}
