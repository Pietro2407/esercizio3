package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Push extends Application{
	int numerocaselle=15;
	TextField caselle[]= new TextField[numerocaselle];
	TextField tfTesto= new TextField();
	Button bPush=new Button("push");
	
	
	
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		for(int i=0; i<caselle.length; i++) {
			caselle[i]=new TextField();
			principale.add(caselle[i], 0, i);
		}
		principale.add(tfTesto, 0,numerocaselle);
		principale.add(bPush, 1,numerocaselle);
		
		Scene scena = new Scene(principale);
		finestra.setTitle("push");
		finestra.setScene(scena);
		finestra.show();
		
		bPush.setOnAction( e -> eseguiPush() );
	}
	
	private void eseguiPush() {
		String testo;
		for(int i=0;i<numerocaselle;i++) {
			testo=caselle[numerocaselle].getText();
			caselle[i].setText(testo);
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
