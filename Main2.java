package application;
// tạo màn hình 1 và màn hình 2, 2 nút để luân chuyển giữa 2 màn hình
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;

public class Main2 extends Application{
	Stage window;
	Scene scene1, scene2;
	public static void main(String[] args) 
	{
		launch(args);
	}
	public void start (Stage primaryStage)
	{
		window = primaryStage;
		//Scene 1
		Label label = new Label ("Welcome to Durak");
		Button button1 = new Button ("Play");
		button1.setOnAction(event ->{
			window.setScene(scene2);
		});
		VBox layout1 = new VBox();
		layout1.getChildren().addAll(label, button1);
		scene1 = new Scene (layout1, 300, 250);
		
		//Scene2
		Button button2 = new Button ("Go Back");
		button2.setOnAction(event -> {
			window.setScene(scene1);
		});
		StackPane layout2 = new StackPane();
		layout2.getChildren().add(button2);
		scene2 = new Scene (layout2, 300, 250);
		window.setScene(scene1);
		window.show();
		
	}
}
