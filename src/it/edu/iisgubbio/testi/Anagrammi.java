package it.edu.iisgubbio.testi;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Anagrammi extends Application{

	Label lParola1=new Label("parola1");
	Label lParola2=new Label("parola2");
	Label lRisposta=new Label("??");
	TextField tfParola1=new TextField();
	TextField tfParola2=new TextField();
	Button bVai=new Button("anagramma");

	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		principale.add(bVai,0, 2);
		principale.add(lParola1,0, 0);
		principale.add(lParola2,0,1);
		principale.add(tfParola1,1,0);
		principale.add(tfParola2,1,1);
		principale.add(lRisposta,1,2);
		principale.setHgap(10);
		principale.setVgap(10);
		principale.setHgap(10);
		Insets spazio = new Insets(15);
		principale.setPadding(spazio);

		Scene scena = new Scene(principale);
		finestra.setTitle("anagramma");
		finestra.setScene(scena);
		finestra.show();

		bVai.setOnAction( e -> eseguiVai() );
	}
	private void eseguiVai() {
		char parola1[]=tfParola1.getText().toCharArray();
		char parola2[]=tfParola2.getText().toCharArray();
		int c=0;

		if(parola1.length==parola2.length) {
			for(int i=0; i<parola1.length; i++) {
				boolean presente=false;
				for(int pos=0; pos<parola2.length && presente==false; pos++) {
					if (parola1[i]==parola2[pos]) {
						presente=true;
						parola2[pos]=' ';
						c++;
					}
					if (presente) {

					}
				}
			}
		}
		if(c==parola1.length){
			lRisposta.setText("è un anagramma");

		}else {
			lRisposta.setText("non è anagramma");
		}
	}
	public static void main(String[] args) {
		launch(args);
	}
}
