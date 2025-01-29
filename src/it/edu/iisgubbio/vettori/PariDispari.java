package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class PariDispari extends Application{
	TextField tfNumeri=new TextField();
	Button bPariDispari=new Button("pari e dispari");
	Label lRisultatoPari=new Label("??");
	Label lRisultatoDispari=new Label("??");

	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		principale.add(tfNumeri, 0, 0,5,1);
		principale.add(bPariDispari, 0, 1,5,1);
		principale.add(lRisultatoDispari, 0, 2);
		principale.add(lRisultatoPari, 0, 3);
		principale.setHgap(10);
		principale.setVgap(10);
		principale.setHgap(10);
		Insets spazio = new Insets(15);
		principale.setPadding(spazio);
		bPariDispari.setMaxWidth(Integer.MAX_VALUE);

		Scene scena = new Scene(principale);
		finestra.setTitle("CERCA");
		finestra.setScene(scena);
		finestra.show();
		bPariDispari.setOnAction( e -> eseguiPariDispari() );
	}
	private void eseguiPariDispari(){
		String testo, parti[];
		int contatoreP=0;
		int contatoreD=0;
		testo=tfNumeri.getText();
		parti=testo.split(" ");
		int numeri[]=new int [parti.length];
		for (int i=0; i<parti.length; i++) {
			numeri[i]=Integer.parseInt(parti[i]);
		}
		for(int i=0; i<numeri.length; i++) {
			if(numeri[i]%2==0) {
				contatoreP+=1;	
			}else {
				contatoreD+=1;
			}
		}
		lRisultatoPari.setText("ci sono " + contatoreP + " numeri pari");
		lRisultatoDispari.setText("ci sono " + contatoreD + " numeri pari");
	
	}
		
		
		
		public static void main(String[] args) {
		launch(args);
	}

}
