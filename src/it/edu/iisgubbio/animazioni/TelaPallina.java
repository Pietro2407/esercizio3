package it.edu.iisgubbio.animazioni;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

public class TelaPallina extends Application{

	Canvas tela = new Canvas(400, 400);
	GraphicsContext gc = tela.getGraphicsContext2D();
	int x=0;


	public void start(Stage primaryStage) {
		GridPane pannello = new GridPane();
		pannello.add(tela, 0,1,4, 1);

		Scene scene = new Scene(pannello);
		primaryStage.setTitle("Pallini");
		primaryStage.setScene(scene);
		primaryStage.show();
		Timeline timeline = new Timeline(new KeyFrame(
				Duration.seconds(0.07),
				x -> aggiornaTimer()));
		timeline.setCycleCount(100);
		timeline.play();

	}
	private void aggiornaTimer(){
		gc.setFill(Color.WHITE);
		gc.fillOval(x-1, 0-1, 25, 25);
		gc.setFill(Color.BLACK);
		gc.fillOval(x+5, 0, 23, 23);
		x=x+5;
		
	}

	public static void main(String args[]){
		launch();
	}
}
