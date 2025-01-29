package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Duplicati  extends Application {
	TextField tfNumeri=new TextField();
	Button bDuplicati=new Button("duplicati");
	Label lRisultato=new Label("??");

	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		principale.add(tfNumeri, 0, 0,5,1);
		principale.add(bDuplicati, 0, 1,5,1);
		principale.add(lRisultato, 0, 2);
		principale.setHgap(10);
		principale.setVgap(10);
		principale.setHgap(10);
		Insets spazio = new Insets(15);
		principale.setPadding(spazio);
		bDuplicati.setMaxWidth(Integer.MAX_VALUE);

		Scene scena = new Scene(principale);
		finestra.setTitle("CERCA");
		finestra.setScene(scena);
		finestra.show();

		bDuplicati.setOnAction( e -> eseguiDuplicati() );
	}
	private void eseguiDuplicati() {
		String testo, parti[];
		testo=tfNumeri.getText();
		parti=testo.split(" ");
		int numeri[]=new int [parti.length];
		for (int i=0; i<parti.length; i++) {
			numeri[i]=Integer.parseInt(parti[i]);
		}
		boolean presente=false;
		for(int i=0; i<numeri.length-1; i++) {
			if(numeri[i+1]==numeri[i]) {
				presente=true;
			}
		}
		if(presente) {
			lRisultato.setText("ci sono numeri duplicati");
		}else {
			lRisultato.setText("non ci sono numeri duplicati");
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
