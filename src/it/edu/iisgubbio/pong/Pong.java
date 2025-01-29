package it.edu.iisgubbio.pong;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Bounds;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Pong extends Application{
	static final double DIMENSIONE_X=400;
	static final double DIMENSIONE_Y=400;
	Rectangle racchettaSinistra= new Rectangle(20,100);
	Rectangle racchettaDestra= new Rectangle(20,100);
	double ySinistra=40;
	double yDestra=40;
	double r=20;
	Text puntiSinistra=new Text();
	int puntiS=0;
	Text puntiDestra=new Text();
	int puntiD=0;
	
	Circle cerchio = new Circle(15); 


	public void start(Stage primaryStage) {
		Pane areaDiGioco = new Pane();
		
		areaDiGioco.setPrefSize( DIMENSIONE_X, DIMENSIONE_Y);
		areaDiGioco.getChildren().add(racchettaSinistra);
		areaDiGioco.getChildren().add(racchettaDestra);
		cerchio.setCenterX(20);
		cerchio.setCenterY(15);
		cerchio.setFill( Color.GREEN );
		areaDiGioco.getChildren().add(cerchio);
		areaDiGioco.getChildren().add(puntiSinistra);
		puntiSinistra.setX(100);
		puntiSinistra.setY(50);
		areaDiGioco.getChildren().add(puntiDestra);
		puntiDestra.setX(300);
		puntiDestra.setY(50);


		racchettaSinistra.setY(ySinistra);
		racchettaDestra.setX(380);

		Scene scena = new Scene(areaDiGioco);
		scena.getStylesheets().add("it/edu/iisgubbio/pong/Pong.css");
		puntiSinistra.getStyleClass().add("punteggio");
		puntiDestra.getStyleClass().add("punteggio");
		areaDiGioco.getStyleClass().add("areaDiGioco");
		primaryStage.setScene(scena);
		primaryStage.setTitle("RIMBALZO");
		primaryStage.show();
		Timeline timeline = new Timeline(new KeyFrame(
				Duration.seconds(0.01),
				x -> aggiornaTimer()));
		timeline.setCycleCount(-1);
		timeline.play();

		scena.setOnKeyPressed(e -> tastoPremuto(e));

	}
	private void tastoPremuto(KeyEvent tasto) {
		System.out.println(tasto.getText());
		if(tasto.getText().equals("s")) {
			ySinistra=ySinistra+30;
			
		}if(tasto.getText().equals("w")) {
			ySinistra=ySinistra-30;
		}
		racchettaSinistra.setY(ySinistra);


		if(tasto.getCode()==KeyCode.DOWN) {
			yDestra=yDestra+30;

		}
		if(tasto.getCode()==KeyCode.UP) {
			yDestra=yDestra-30;

		}
		racchettaDestra.setY(yDestra);
		if(ySinistra>=300) {
			ySinistra=300;
			racchettaSinistra.setY(300);
		}
		if(ySinistra<=0) {
			ySinistra=0;
			racchettaSinistra.setY(0);
		}
		if(yDestra>=300) {
			yDestra=300;
			racchettaDestra.setY(300);
		}
		if(yDestra<=0) {
			yDestra=0;
			racchettaDestra.setY(0);
		}

	}
	double direzione=3;
	double verticale=5;
	private void aggiornaTimer(){
		cerchio.setCenterY(cerchio.getCenterY()+verticale);
		double z=Math.random();
		if (cerchio.getCenterY() >=DIMENSIONE_Y-r) {
			verticale=-5;
			if(z>0.5) {
				verticale=-1;
			}
		}
		if (cerchio.getCenterY()<= r) {
			verticale=5;
			
			if(z>0.5) {
				verticale=1;
			}

		}
		cerchio.setCenterX(cerchio.getCenterX()+direzione);
		if (cerchio.getCenterX() >=DIMENSIONE_X-r) {
			direzione=-3;
			puntiS++;
			puntiSinistra.setText(""+puntiS);
			if(z>0.5) {
				verticale=+1;
				
			}else
			{
				verticale=-1;
			}	

		}
		if (cerchio.getCenterX()<= r) {
			direzione=3;
			puntiD++;
			puntiDestra.setText(""+puntiD);
			if(z>0.5) {
				verticale=+1;
			}

		}
		Bounds b1 = cerchio.getBoundsInParent();
		Bounds b2 = racchettaSinistra.getBoundsInParent();
		Bounds b3 = racchettaDestra.getBoundsInParent();
		if(b1.intersects(b2)) {
			
			if(z>0.5) {
				verticale=5;
			}else {
				verticale=-5;
			}
			
			direzione=3;
		}if(b1.intersects(b3)) {
			
			if(z>0.5) {
				verticale=5;
			}else {
				verticale=-5;
			}
			direzione=-3;
		}
		if(cerchio.getCenterX()>=DIMENSIONE_Y-10) {
			puntiS++;
			puntiSinistra.setText(""+puntiS);
			cerchio.setCenterX(200);
			cerchio.setCenterY(200);
		}
		if(cerchio.getCenterX()<=10) {
			puntiD++;
			puntiDestra.setText(""+puntiD);
			cerchio.setCenterX(200);
			cerchio.setCenterY(200);
		}


	}

	public static void main(String args[]){
		launch();
	}
}
