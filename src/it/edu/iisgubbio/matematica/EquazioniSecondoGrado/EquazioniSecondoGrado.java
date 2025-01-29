package it.edu.iisgubbio.matematica.EquazioniSecondoGrado;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class EquazioniSecondoGrado extends Application {
	Label lA=new Label("a=");
	Label lB=new Label("b=");
	Label lC=new Label("c=");
	Label lX1=new Label("X1=");
	Label lX2=new Label("X2=");
	TextField tfA=new TextField();
	TextField tfB=new TextField();
	TextField tfC=new TextField();
	Label lRX1=new Label();
	Label lRX2=new Label();
	Button bRisolvi= new Button("risolvi");
	
	public void start(Stage finestra) throws Exception{
		GridPane principale=new GridPane();
		principale.add(lA, 0, 0);
		principale.add(tfA, 1, 0);
		principale.add(lB, 0, 1);
		principale.add(tfB, 1, 1);
		principale.add(lC, 0, 2);
		principale.add(tfC, 1, 2);
		principale.add(lX1, 0, 3);
		principale.add(lX2, 2, 3);
		principale.add(lRX1, 1, 3);
		principale.add(lRX2, 3, 3);
		principale.add(bRisolvi, 2,0,1,3);
		principale.setHgap(10);
		principale.setVgap(10);
		principale.setHgap(10);
		Insets spazio = new Insets(15);
		principale.setPadding(spazio);
		bRisolvi.setMaxHeight(Integer.MAX_VALUE);
		
		Scene scena=new Scene(principale);
		scena.getStylesheets().add("it/edu/iisgubbio/matematica/EquazioniSecondoGrado/EquazioniSecondoGrad.css");
		principale.setId("principale");
		lX1.getStyleClass().add("risultato");
		lX2.getStyleClass().add("risultato");
		lRX1.getStyleClass().add("risultato");
		lRX2.getStyleClass().add("risultato");
		finestra.setTitle("Secondo Grado");
		finestra.setScene(scena);
		finestra.show();
	
		bRisolvi.setOnAction( e -> eseguiControlla() );
	}
	
	private void eseguiControlla() {
		double a, b, c, d,x1, x2;
		a=Double.parseDouble(tfA.getText());
		b=Double.parseDouble(tfB.getText());
		c=Double.parseDouble(tfC.getText());
		d=b*b-4*a*c;
		if(d>=0) {
			x1=((-b)+Math.sqrt(d))/(2*a);
			x2=((-b)-Math.sqrt(d))/(2*a);
			lRX1.setText(""+x1);
			lRX2.setText(""+x2);
			
		}else {
			lRX1.setText("impossibile");
			lRX2.setText("impossibile");
		}
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
