package it.edu.iisgubbio.pong;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Rimbalzo extends Application{
	
	double r=20;
	static final double DIMENSIONE_X=400;
	static final double DIMENSIONE_Y=400;
	Circle cerchio = new Circle(15); 

	public void start(Stage primaryStage) {
		Pane areaDiGioco = new Pane();
		areaDiGioco.setPrefSize(DIMENSIONE_X, 400);


		cerchio.setCenterX(20);
		cerchio.setCenterY(15);
		cerchio.setFill( Color.GREEN );
		areaDiGioco.getChildren().add(cerchio);



		Scene scena = new Scene(areaDiGioco);
		primaryStage.setScene(scena);
		primaryStage.setTitle("RIMBALZO");
		primaryStage.show();
		Timeline timeline = new Timeline(new KeyFrame(
				Duration.seconds(0.01),
				x -> aggiornaTimer()));
		timeline.setCycleCount(-1);
		timeline.play();

	}
	double direzione=3;
	double verticale=5;
	private void aggiornaTimer(){
		cerchio.setCenterY(cerchio.getCenterY()+verticale);
		double z=Math.random();
		if (cerchio.getCenterY() >=DIMENSIONE_Y-r) {
			verticale=-5;
			if(z>0.5) {
				verticale=-6;
			}
		}
		if (cerchio.getCenterY()<= r) {
			verticale+=5;
			if(z>0.5) {
				verticale=+6;
			}

		}
		cerchio.setCenterX(cerchio.getCenterX()+direzione);
		if (cerchio.getCenterX() >=DIMENSIONE_X-r) {
			direzione=-3;
			if(z>0.5) {
				verticale=+4;
			}

		}
		if (cerchio.getCenterX()<= r) {
			direzione+=3;
			if(z>0.5) {
				verticale=+4;
			}

		}


	}


	public static void main(String args[]){
		launch();
	}
}
