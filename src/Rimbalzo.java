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
	double direzione=5;
	static final double DIMENSIONE_X=600;
	Circle cerchio = new Circle(15); 

	public void start(Stage primaryStage) {
		Pane areaDiGioco = new Pane();
		areaDiGioco.setPrefSize(DIMENSIONE_X, 200);


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
	
	private void aggiornaTimer(){
		cerchio.setCenterX(cerchio.getCenterX()+direzione);
		
		if (cerchio.getCenterX() >=DIMENSIONE_X-r) {
			direzione=-5;
		}
		if (cerchio.getCenterX()<= 20) {
			direzione+=5;

		}
		
	}

	public static void main(String args[]){
		launch();
	}
}
