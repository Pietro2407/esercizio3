package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class EliminaDuplicati extends Application{

	TextField tfNumeri=new TextField();
	Label lNumeri=new Label("numeri");
	Button bEliminaDuplicati=new Button("elimina duplicati");
	Button bContaDuplicati=new Button("conta duplicati");
	Label lRisposta=new Label("risposta");
	Label lRisultato=new Label();

	public void start(Stage finestra) throws Exception {

		GridPane principale = new GridPane();
		principale.add(tfNumeri, 1, 0,5,1);
		principale.add(lNumeri, 0, 0);
		principale.add(bEliminaDuplicati, 1, 1,5,1);
		principale.add(bContaDuplicati, 1, 2,5,1);
		principale.add(lRisposta, 0, 3);
		principale.add(lRisultato, 1, 3);
		principale.setHgap(10);
		principale.setVgap(10);
		Insets spazio = new Insets(10);
		principale.setPadding(spazio);
		bEliminaDuplicati.setMaxWidth(Integer.MAX_VALUE);
		bContaDuplicati.setMaxWidth(Integer.MAX_VALUE);

		Scene scena = new Scene(principale);
		finestra.setTitle("CERCA");
		finestra.setScene(scena);
		finestra.show();


		bEliminaDuplicati.setOnAction( e -> eseguiEliminaDuplica() );
		bContaDuplicati.setOnAction( e -> eseguiContaDuplicati() );
	}
	int[]testoNumeri(String testo){
		String parti[];
		int vettoreNumeri[];
		parti=testo.split(" ");
		vettoreNumeri=new int[parti.length];
		for(int i=0; i<parti.length; i++) {
			vettoreNumeri[i]=Integer.parseInt(parti[i]);
		}
		return vettoreNumeri;

	}
	private void  eseguiEliminaDuplica() {
		String se="";
		int numeri[], c=0,q=0,nuovo[];
		boolean presente;
		numeri=testoNumeri(tfNumeri.getText());
		int senzaDuplicati[]=new int[numeri.length];
		senzaDuplicati[0]=numeri[0];
		for (int i=0; i<numeri.length; i++) {
			c=numeri[i];
			presente=false;
			for(int x=0; x<q;x++) {
				if(c==senzaDuplicati[x]) {
					presente=true;
				}
			}
			if(presente==false) {
				senzaDuplicati[q]=c;
				q+=1;
			}
		}
		nuovo=new int[q];
		for(int i=0;i<q;i++) {
			nuovo[i]=numeri[i];
		}
		for (int i=0; i<q; i++) {
			se+=" "+(senzaDuplicati[i]);
		}
		lRisultato.setText(se);



	}
	private void eseguiContaDuplicati() {
		int numeri[], c=0;
		numeri=testoNumeri(tfNumeri.getText());
		for (int i=0; i<numeri.length; i++) {
			for(int v=i+1;v<numeri.length; v++) {
				if(numeri[v]==numeri[i]) {
					c++;
				}
			}
		}	
		lRisultato.setText(""+c);

	}



	public static void main(String[] args) {
		launch(args);
	}
}
