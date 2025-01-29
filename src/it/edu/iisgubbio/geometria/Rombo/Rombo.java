package it.edu.iisgubbio.geometria.Rombo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Rombo extends Application{
	Button pArea = new Button("area");
	Button pPerimetro = new Button("perimetro");
	Label eDiagmagg = new Label("diag magg:");
	Label eDiagmin = new Label("diag min");
	Label eRisultatoArea = new Label("??");
	Label eRisultatoPerimetro = new Label ("??");
	TextField cDiagmagg = new TextField();
	TextField cDiagmin = new TextField();
	
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		principale.add(eDiagmagg, 0, 0);
		principale.add(eDiagmin, 0, 1);
		principale.add(pArea, 0, 2);
		principale.add(pPerimetro, 0, 3);
		principale.add(cDiagmagg, 1, 0);
		principale.add(cDiagmin, 1, 1);
		principale.add(eRisultatoArea, 1, 2);
		principale.add(eRisultatoPerimetro, 1, 3);
		
		Scene scena = new Scene(principale);
		finestra.setTitle("rombo");
		finestra.setScene(scena);
		finestra.show();
		
		pArea.setOnAction( e -> eseguiArea() );
		pPerimetro.setOnAction( e -> eseguiPerimetro() );
	}
	
	private void eseguiArea() {
		String dMaggiore,dMinore,testo;
		int vdMaggiore,vdMinore,Area;
	
		dMaggiore=cDiagmagg.getText();
		dMinore=cDiagmin.getText();
		vdMaggiore=Integer.parseInt(dMaggiore);
		vdMinore=Integer.parseInt(dMinore);
		Area=(vdMinore*vdMaggiore)/2;
		testo=""+Area;
		eRisultatoArea.setText(testo);	
	}
	private void eseguiPerimetro() {
		String testodMaggiore,testodMinore,testo;
		int vdMaggiore,vdMinore,Perimetro, Ipotenusa;
		double ipotenusa,perimetro;
		
		testodMaggiore=cDiagmagg.getText();
		testodMinore=cDiagmin.getText();
		vdMaggiore=Integer.parseInt(testodMaggiore);
		vdMinore=Integer.parseInt(testodMinore);
		Ipotenusa=Math.sqrt((vdMaggiore*vdMinore)+(vdMinore+vdMinore));
		Perimetro=(ipotenusa*ipotenusa*ipotenusa*ipotenusa);
		testo=""+Perimetro;
		eRisultatoPerimetro.setText(testoPerimetro);	
	}
		
		public static void main(String[] args) {
			launch(args);
		}
}

