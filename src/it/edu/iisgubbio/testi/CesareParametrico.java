package it.edu.iisgubbio.testi;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CesareParametrico extends Application{
	
	TextField tfParola1=new TextField();
	TextField tfParola2=new TextField();
	TextField tfNumero=new TextField();
	Button bCifra=new Button("cifra ⬇");
	Button bDecifra=new Button("decifra ⬆ ");
	
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		principale.add(bCifra,0, 1);
		principale.add(bDecifra,2, 1);
		principale.add(tfParola1,0, 0,2,1);
		principale.add(tfParola2,0, 2,2,1);
		principale.add(tfNumero, 1,1);
		principale.setHgap(10);
		principale.setVgap(10);
		principale.setHgap(10);
		bCifra.setMaxWidth(Integer.MAX_VALUE);
		bDecifra.setMaxWidth(Integer.MAX_VALUE);
		Insets spazio = new Insets(15);
		principale.setPadding(spazio);

		Scene scena = new Scene(principale);
		finestra.setTitle("iniziali");
		finestra.setScene(scena);
		finestra.show();
		bCifra.setOnAction( e -> eseguiCifra() );
		bDecifra.setOnAction( e -> eseguiDecifra() );
	}
	private void eseguiCifra() {
		char parola1[]=tfParola1.getText().toCharArray();
		for(int i=0; i<parola1.length; i++) {
			switch(parola1[i]) {
			case 'z':
				parola1[i]='c';
				break;
			case 'y':
				parola1[i]='b';
				break;
			case 'x':
				parola1[i]='a';
				break;
			default:
				parola1[i]=(char)(parola1[i]+3);
			}
		}
		String parole=new String(parola1);
		tfParola2.setText(parole);
	}
	
	private void eseguiDecifra() {
		char parola2[]=tfParola2.getText().toCharArray();
		for(int i=0; i<parola2.length; i++) {
			switch(parola2[i]) {
			case 'c':
				parola2[i]='z';
				break;
			case 'b':
				parola2[i]='y';
				break;
			case 'a':
				parola2[i]='x';
				break;
			default:
				
			
			 parola2[i]=(char)(parola2[i]-3);
			}
		}
		String parole=new String(parola2);
		tfParola1.setText(parole);
		}

	public static void main(String[] args) {
		launch(args);
	}
}


	