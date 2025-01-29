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

public class Disco extends Application {
	Button bAggiungi =new Button("aggiungi");
	Canvas tela = new Canvas(400, 200);
	GraphicsContext gc = tela.getGraphicsContext2D();
	int x=0;
	int y=0;

	public void start(Stage primaryStage) {
		GridPane pannello = new GridPane();
		pannello.add(tela, 0,1,3, 1);
		pannello.add(bAggiungi, 2, 0);

		Scene scene = new Scene(pannello);
		primaryStage.setTitle("Pallini");
		primaryStage.setScene(scene);
		primaryStage.show();

		bAggiungi.setOnAction(e -> eseguiAggiungi());
	}
	private void eseguiAggiungi() {
		gc.setFill(Color.RED);
		gc.fillOval(x,0,23,23);
		x=x+30;
		if(x==300) {
			x=0;
			y+=30;

		}

	}




	public static void main(String[] args) {
		launch(args);
	}
}
