package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Cerca extends Application{
	TextField tfNumeri=new TextField();
	Button bCerca=new Button("cerca");
	Label lRisultato=new Label("??");
	Label lNumero=new Label("numero");
	TextField tfCerca=new TextField();
	
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		principale.add(tfNumeri, 0, 0,5,1);
		principale.add(lNumero, 0, 1);
		principale.add(tfCerca, 1, 1);
		principale.add(bCerca, 2,1);
		principale.add(lRisultato, 0, 2);
		principale.setHgap(10);
		principale.setVgap(10);
		principale.setHgap(10);
		Insets spazio = new Insets(15);
		principale.setPadding(spazio);
		bCerca.setMaxWidth(Integer.MAX_VALUE);
		
		Scene scena = new Scene(principale);
		finestra.setTitle("CERCA");
		finestra.setScene(scena);
		finestra.show();

		bCerca.setOnAction( e -> eseguiCerca() );
	}
	private void eseguiCerca(){
		String testo, parti[];
		int numero;
		numero=Integer.parseInt(tfCerca.getText());
		testo=tfNumeri.getText();
		parti=testo.split(" ");
		int numeri[]=new int [parti.length];
		for (int i=0; i<parti.length; i++) {
			numeri[i]=Integer.parseInt(parti[i]);
		}
		int contatore=0;
		for(int i=0; i<numeri.length; i++) {
			if(numeri[i]==numero) {
				contatore++;
			}
		}
		if(contatore>=1) {
			lRisultato.setText("il numero scelto è presente");
		}else {
			lRisultato.setText("il numero scelto non è presente");
		}
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
