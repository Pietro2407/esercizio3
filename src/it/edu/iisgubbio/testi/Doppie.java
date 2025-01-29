package it.edu.iisgubbio.testi;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Doppie  extends Application {
	TextField tfParola=new TextField();
	Button bDoppie=new Button("conta");
	Label lRisultato=new Label("??");
	Label lTesto=new Label("testo");
	Label lNumeroDoppie=new Label("numero doppie:");
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		principale.add(tfParola,1, 0,5,1);
		principale.add(bDoppie, 1, 1,5,1);
		principale.add(lRisultato, 1, 2);
		principale.add(lTesto, 0, 0);
		principale.add(lNumeroDoppie, 0, 2);
		principale.setHgap(10);
		principale.setVgap(10);
		principale.setHgap(10);
		Insets spazio = new Insets(15);
		principale.setPadding(spazio);
		bDoppie.setMaxWidth(Integer.MAX_VALUE);

		Scene scena = new Scene(principale);
		finestra.setTitle("CERCA");
		finestra.setScene(scena);
		finestra.show();

		bDoppie.setOnAction( e -> eseguiDoppie() );
	}
	private void eseguiDoppie() {
		char lettere[]=tfParola.getText().toCharArray();
		int c=0;
		for(int i=0; i<lettere.length-1; i++) {
			if(lettere[i+1]==lettere[i]) {
				c+=1;
				lettere[i]='#';
				lettere[i+1]='#';
				
			}
		}
		String testo= new String(lettere);
		lRisultato.setText(""+c + " " + testo);
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
