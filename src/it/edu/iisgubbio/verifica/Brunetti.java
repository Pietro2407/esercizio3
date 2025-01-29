package it.edu.iisgubbio.verifica;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Brunetti extends Application{
	TextField tfPosizione=new TextField();
	TextField tfNumeri=new TextField();
	Label lRisultato=new Label("risultato");
	Button bMaggiore=new Button("più grande");
	Button bTrova=new Button("visualizza");
	Button bElimina=new Button("elimina");
	

	public void start(Stage finestra) throws Exception {

		GridPane principale = new GridPane();
		principale.add(tfNumeri, 0,0);
		principale.add(tfPosizione, 0,1);
		principale.add(lRisultato, 0,5);
		principale.add(bMaggiore, 0,3);
		principale.add(bTrova, 0,2);
		principale.add(bElimina, 0,4);
		principale.setHgap(10);
		principale.setVgap(10);
		principale.setHgap(10);
		Insets spazio = new Insets(15);
		principale.setPadding(spazio);
		bMaggiore.setMaxWidth(Integer.MAX_VALUE);
		bElimina.setMaxWidth(Integer.MAX_VALUE);
		bTrova.setMaxWidth(Integer.MAX_VALUE);

		Scene scena = new Scene(principale);
		finestra.setTitle("verifica");
		finestra.setScene(scena);
		finestra.show();

		bMaggiore.setOnAction( e -> eseguiMaggiore() );
		bElimina.setOnAction( e -> eseguiElimina() );
		bTrova.setOnAction( e -> eseguiTrova() );
	}
	private void eseguiMaggiore() {
		int massimo;
		int minore;
		String testo, parti[];
		testo=tfNumeri.getText();
		parti=testo.split(" ");
		int numeri[]=new int [parti.length];
		for (int i=0; i<parti.length; i++) {
			numeri[i]=Integer.parseInt(parti[i]);
		
		}
		massimo=numeri[0];
		for(int i=1; i<numeri.length; i++) {	
			if(numeri[i]>massimo) {
				massimo=numeri[i];
			}
		}
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
	private void eseguiElimina() {
		String se="";
		int numeri[], c=0,q=0,nuovo[],posizione;
		boolean presente;
		numeri=testoNumeri(tfNumeri.getText());
		int numeri[]=new int[numeri.length];
		numeri[0]=numeri[0];
		for (int i=0; i<numeri.length; i++) {
			c=numeri[i];
			presente=false;
			for(int x=0; x<q;x++) {
				if(c==posizione[x]) {
					presente=true;
				}
			}
			if(presente==false) {
				numeri[q]=c;
				q+=1;
			}
		}
		nuovo=new int[q];
		for(int i=0;i<q;i++) {
			nuovo[i]=numeri[i];
		}
		for (int i=0; i<q; i++) {
			se+=" "+(posizione[i]);
		}
		lRisultato.setText(se);



	}

	private void eseguiTrova() {
		String testo,parti[];
		int maggiore;
		int minore;
		testo=tfNumeri.getText();
		parti=testo.split(" ");
		int numeri[]=new int [parti.length];
		for (int i=0; i<parti.length; i++) {
			numeri[i]=Integer.parseInt(parti[i]);
		}


		;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
