package it.edu.iisgubbio.testi;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Spazi extends Application{

	TextField tfFrase=new TextField();
	Label lFrase=new Label("frase");
	TextField tfRisposta=new TextField();
	TextField tfNumeri=new TextField();
	TextField tfEspanso=new TextField();
	Button bCompatta=new Button("compatta");
	Button bEspandi=new Button("espandi");

	
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		principale.add(tfRisposta,2, 1);
		principale.add(lFrase,0, 0);
		principale.add(tfFrase,2,0);
		principale.add(tfNumeri,0,2);
		principale.add(tfEspanso,2,2);
		principale.add(bCompatta, 0, 1,2,1);
		principale.add(bEspandi, 1, 2);
		principale.setHgap(10);
		principale.setVgap(10);
		principale.setHgap(10);
		Insets spazio = new Insets(15);
		principale.setPadding(spazio);
		bCompatta.setMaxWidth(Integer.MAX_VALUE);
		tfFrase.getStyleClass().add("input");
		tfNumeri.getStyleClass().add("input");
		tfEspanso.getStyleClass().add("input");

		Scene scena = new Scene(principale);
		scena.getStylesheets().add("it/edu/iisgubbio/testi/Spazi.css");
		tfRisposta.getStyleClass().add("lRisposta");
		lFrase.getStyleClass().add("lFrase");
		principale.getStyleClass().add("principale");
		finestra.setTitle("Fibonacci");
		finestra.setScene(scena);
		finestra.show();

		bCompatta.setOnAction( e -> eseguiCompatta() );
		bEspandi.setOnAction( e -> eseguiEspandi() );
	}
	private void eseguiCompatta() {
		int spazioNumeri=0;
		char frase[];
		frase=tfFrase.getText().toCharArray();
		for(int i=0; i<frase.length; i++) {
			if (frase[i]==' ') {
				spazioNumeri++;
			}

		}
		char finale[]=new char[frase.length-spazioNumeri];
		for(int i=0,a=0; i<frase.length; i++) {
			if (frase[i]!=' ') {
				finale[a]=frase[i];
				a++;
			}
		}
		String f=new String(finale);
		tfRisposta.setText(f);
	}
	private void eseguiEspandi() {
		char frase[]=tfFrase.getText().toCharArray();
		int lunghezza=Integer.parseInt(tfNumeri.getText());
		char espanso[]=new char [lunghezza];
		int spaziNuovi=lunghezza-frase.length;
		System.out.println(spaziNuovi);
		int spazioNumeri=0;
		
		for(int i=0; i<frase.length; i++) {
			if (frase[i]==' ') {
				spazioNumeri++;
			}

		}
		int	spazidaAggiungere=spaziNuovi/spazioNumeri;
		for(int i=0; i<frase.length; i++) {
			
			if(frase[i]!=' ') {
				
				
			}
			
		}
		String nuovo=new String(espanso);
		tfEspanso.setText(nuovo);
	}

	public static void main(String[] args) {
		launch(args);
	}
}
