package it.edu.iisgubbio.testi;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Impiccato extends Application{
	TextField tfLettera=new TextField();
	TextField tfNumeri=new TextField();
	Label lRisultato=new Label();
	Button bVia=new Button("Via");
	Label lLettera=new Label("lettera");
	Button bProva=new Button("prova");
	Label lVinto=new Label("avrai vinto o perso?");
	char parola[];
	char finale[];


	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		principale.add(lRisultato,1, 1);
		principale.add(tfNumeri,0,0);
		principale.add(bVia, 1, 0);
		principale.add(bProva, 2, 1);
		principale.add(lLettera, 0,1);
		principale.add(tfLettera,1,1);
		principale.add(lVinto, 1,2);
		principale.setHgap(10);
		principale.setVgap(10);
		principale.setHgap(10);
		Insets spazio = new Insets(15);
		principale.setPadding(spazio);
		bVia.setMaxWidth(Integer.MAX_VALUE);
		bProva.setMaxWidth(Integer.MAX_VALUE);

		Scene scena = new Scene(principale);
		finestra.setTitle("Fibonacci");
		finestra.setScene(scena);
		finestra.show();

		bVia.setOnAction( e -> eseguiVia() );
		bProva.setOnAction( e -> eseguiProva() );
	}
	private void eseguiVia() {
		parola=tfNumeri.getText().toCharArray();
		finale=tfNumeri.getText().toCharArray();
		for(int i=1; i<parola.length-1; i++) { 
			parola[i]='-';
		}

		String testo= new String(parola);
		tfNumeri.setText( " " + testo);

	}

	private void eseguiProva() {
		char lettera=tfLettera.getText().charAt(0);


		for(int i=0; i<parola.length; i++) {
			if(lettera==finale[i]) {
				parola[i]=lettera;	
			}  
		}
		boolean presente=false;
		for(int i=0; i<parola.length-1; i++) {
			if(parola[i]=='-') {
				presente=true;
				lVinto.setText("non presente");
			}else {
				lVinto.setText("presente");

			}
			
		}

		String testo= new String(parola);
		tfNumeri.setText( " " + testo);

	}

	public static void main(String[] args) {
		launch(args);
	}
}
