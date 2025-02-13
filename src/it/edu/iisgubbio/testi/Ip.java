package it.edu.iisgubbio.testi;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Ip extends Application {
	Label lIndirizzo=new Label("indirizzo");
	TextField tfRisposta=new TextField("??");
	TextField tfNumero=new TextField();
	Button bVerifica=new Button("verifica");
	
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		principale.add(lIndirizzo,0, 0);
		principale.add(tfNumero,1,0);
		principale.add(bVerifica,0, 1);	
		principale.add(tfRisposta,1, 1);
		principale.setHgap(10);
		principale.setVgap(10);
		principale.setHgap(10);
		bVerifica.setMaxWidth(Integer.MAX_VALUE);
		Insets spazio = new Insets(15);
		principale.setPadding(spazio);

		Scene scena = new Scene(principale);
		finestra.setTitle("iniziali");
		finestra.setScene(scena);
		finestra.show();
		bVerifica.setOnAction( e -> eseguiVerifica() );
	}
	private void eseguiVerifica() {
		boolean giusto;
		String testo;
		boolean indirizzoValido= true;
		testo = tfNumero.getText();
		String parti[];
		String indirizzo=tfNumero.getText();
		char caratteri[]=indirizzo.toCharArray();
		for (int i=0; i<caratteri.length; i++) {
			if (caratteri[i]!='.'&& (caratteri[i]<'0'|| caratteri [i]>'9')) {
				indirizzoValido = false;
			}
				
		}
		if (indirizzoValido) {
			parti = testo.split("\\.");
			int ip[]=new int[parti.length];
			for (int i=0; i<parti.length; i++) {
				ip[i] = Integer.parseInt(parti[i]);
			}
			if(parti.length==4) {
				giusto= true;
				for (int i=0; i<parti.length; i++) {
					if (ip[i]>255 || ip[i]<=0) {
						giusto=false;
					}
				}
				if (giusto==false) {
					tfRisposta.setText("non è una rete");
				}else {
					tfRisposta.setText("è una rete");
				}
			}else {
				tfRisposta.setText("non è una rete");
			}
		}else {
			tfRisposta.setText("non è una rete");
		}
	}
	public static void main(String[] args) {
		launch(args);
	}
}
