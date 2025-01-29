package it.edu.iisgubbio.disegni;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Pallini extends Application{
	Button bVai =new Button("vai");
	TextField tfNumero = new TextField();
	Label lNumero = new Label ("dimensione");
	Canvas tela = new Canvas(400, 400);
	GraphicsContext gc = tela.getGraphicsContext2D();

	public void start(Stage primaryStage) {
		GridPane pannello = new GridPane();
		pannello.add(tela, 0,1,4, 1);
		pannello.add(lNumero, 0, 0);
		pannello.add(tfNumero, 1, 0);
		pannello.add(bVai, 2, 0);

		Scene scene = new Scene(pannello);
		primaryStage.setTitle("Pallini");
		primaryStage.setScene(scene);
		primaryStage.show();

		bVai.setOnAction(e -> eseguiVai());
	}
	private void eseguiVai() {
		int numero;
		numero=Integer.parseInt(tfNumero.getText());
		gc.setFill(Color.BLACK);
		int limite=numero;
		for(double y=0;y<numero;y++) {
			for(double x=0; x<limite;x++) {
			gc.fillOval(x*35,y*35,23,23);
			}
			limite--;
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
