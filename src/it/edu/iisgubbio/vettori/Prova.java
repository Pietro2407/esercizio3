package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Prova extends Application {
	
	TextField tfNumeri=new TextField();
	Label lValori=new Label("posizione");
	TextField tfValori=new TextField();
	Label lPosizione=new Label("posizione");
	Button bRicerca=new Button("conta");
	Label lMassimo=new Label("massimo");
	Label lElenco=new Label("elenco");
	Label lRposizione=new Label("?P?");
	Label lRElenco=new Label("?E?");
	Label lRMassimo=new Label("?M?");
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		principale.add(tfNumeri,1, 0);
		principale.add(lValori,0, 0);
		principale.add(bRicerca, 1, 4);
		principale.add(lMassimo, 0, 1);
		principale.add(lElenco, 0, 3);
		principale.add(lPosizione, 0, 2);
		principale.add(lRposizione, 1, 2);
		principale.add(lRElenco, 1, 3);
		principale.add(lRMassimo, 1, 1);
	
		Scene scena = new Scene(principale);
		finestra.setTitle("CERCA");
		finestra.setScene(scena);
		finestra.show();

		bRicerca.setOnAction( e -> eseguiRicerca() );
	}
	private void eseguiRicerca() {
		String testo, parti[];
		int massimo,c=0;
		testo=tfNumeri.getText();
		parti=testo.split(" ");

		int numeri[]=new int [parti.length];
		for (int i=0; i<parti.length; i++) {
			numeri[i]=Integer.parseInt(parti[i]);
		}
		massimo=numeri[0];
		for (int i=0; i<parti.length; i++) {
			if(numeri[i]>massimo) {
				massimo=numeri[i];
				c++;
			}
		}
		String se="";
		for (int i=0; i<parti.length; i++) {
			se+=","+(numeri[i]);
		}
		lRMassimo.setText(""+massimo);
		lRposizione.setText(""+c);
		lRElenco.setText(se);

	}

	public static void main(String[] args) {
		launch(args);
	}
}
