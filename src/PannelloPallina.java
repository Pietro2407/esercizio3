import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class PannelloPallina extends Application{
	int x=20;
	double r=20;
	Circle cerchio = new Circle(15); 

	public void start(Stage primaryStage) {
		Pane areaDiGioco = new Pane();
        areaDiGioco.setPrefSize(400, 400);
        
        
        cerchio.setCenterX(15);
        cerchio.setCenterY(15);
        cerchio.setFill( Color.GREEN );
        areaDiGioco.getChildren().add(cerchio);
        
	
	
	  Scene scena = new Scene(areaDiGioco);
      primaryStage.setScene(scena);
      primaryStage.setTitle("L1");
      primaryStage.show();
      Timeline timeline = new Timeline(new KeyFrame(
				Duration.seconds(0.05),
				x -> aggiornaTimer()));
		timeline.setCycleCount(1000);
		timeline.play();

  }
	private void aggiornaTimer(){
		x=x+5;
		cerchio.setCenterX(x);
		r=r-0.3;
		cerchio.setRadius(r);
	}
	
	public static void main(String args[]){
		launch();
	}
}
