package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class inverti extends Application{
	Label lNumeri=new Label("numeri");
	TextField tfNumeri=new TextField();
	Button bInverti=new Button("inverti");
	Label lVettore2=new Label("vettore2");
	Label lRisultato=new Label("??");
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		principale.add(lNumeri,0, 0);
		principale.add(tfNumeri,1,0);
		principale.add(bInverti, 1, 1);
		principale.add(lVettore2, 0, 2);
		principale.add(lRisultato, 1, 2);
		
		principale.setHgap(10);
		principale.setVgap(10);
		principale.setHgap(10);
		Insets spazio = new Insets(15);
		principale.setPadding(spazio);
		bInverti.setMaxWidth(Integer.MAX_VALUE);
		
		Scene scena = new Scene(principale);
		finestra.setTitle("CERCA");
		finestra.setScene(scena);
		finestra.show();

		bInverti.setOnAction( e -> eseguiInverti() );
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
	private void eseguiInverti() {
		int numeri[],c=0;
		numeri=testoNumeri(tfNumeri.getText());
		int contrario[]=new int [numeri.length];
		for (int i=numeri.length-1; i>-1; i--,c++) {
			
			contrario[c]=numeri[i];	
		}
		String se="";
		for (int i=0; i<contrario.length; i++) {
			if(i==0) {
				se+=contrario[i];
			}else {
				se+="-"+contrario[i];
			}
		}
		lRisultato.setText(se);
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
