package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class EliminaPosizione extends Application{
	TextField tfElenco=new TextField();
	TextField tfPosizione=new TextField();
	Button bScambia=new Button("scambia");
	Label lElimina=new Label("elimina");
	Label lElenco=new Label("elenco");
	Label lRisultato=new Label("risultato");
	Label lFinito=new Label("??");
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		principale.add(tfElenco,1, 0);
		principale.add(tfPosizione,1,1);
		principale.add(bScambia, 1, 3);
		principale.add(lElenco, 0, 0);
		principale.add(lRisultato, 0, 2);
		principale.add(lFinito, 1, 2);
		principale.add(lElimina, 0, 1);
		principale.setHgap(10);
		principale.setVgap(10);
		principale.setHgap(10);
		Insets spazio = new Insets(15);
		principale.setPadding(spazio);
		bScambia.setMaxWidth(Integer.MAX_VALUE);
		
		Scene scena = new Scene(principale);
		finestra.setTitle("CERCA");
		finestra.setScene(scena);
		finestra.show();

		bScambia.setOnAction( e -> eseguiScambia() );
	}
	private void eseguiScambia() {
		
	}
	
	

	
	public static void main(String[] args) {
		launch(args);
	}
}
