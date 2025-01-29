package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Scambio extends Application{
	TextField tfValori=new TextField();
	Button bScambia=new Button("scambia");
	Label lElenco=new Label("elenco");
	Label lRisultato=new Label("risultato");
	Label lFinito=new Label("??");
	
	
		public void start(Stage finestra) throws Exception {
			GridPane principale = new GridPane();
			principale.add(tfValori,1, 0);
			principale.add(bScambia, 2, 1);
			principale.add(lElenco, 0, 0);
			principale.add(lRisultato, 0, 1);
			principale.add(lFinito, 1, 1);
			
			Scene scena = new Scene(principale);
			finestra.setTitle("CERCA");
			finestra.setScene(scena);
			finestra.show();

			bScambia.setOnAction( e -> eseguiScambia() );
		}
		private void eseguiScambia() {
			String testo, parti[];
			int massimo,minimo,cMax=0, cMin=0;
			testo=tfValori.getText();
			parti=testo.split(" ");

			int numeri[]=new int [parti.length];
			for (int i=0; i<parti.length; i++) {
				numeri[i]=Integer.parseInt(parti[i]);
			}
			massimo=numeri[0];
			for (int i=0; i<parti.length; i++) {
				if(numeri[i]>massimo) {
					massimo=numeri[i];
					cMax=i;
				}
			}
			minimo=numeri[0];
			for (int i=0; i<parti.length; i++) {
				if(numeri[i]<minimo) {
					massimo=numeri[i];
					cMax=i;
				}
			}
			numeri[cMin]=massimo;
			numeri[cMax]=minimo;
			String se="";
			for (int i=0; i<parti.length; i++) {
				if(i==0) {
					se+=""+(numeri[i]);
				}else {
					se+=";"+(numeri[i]);
				}
			}
			lFinito.setText(se);
		}
		public static void main(String[] args) {
			launch(args);
		}
}
