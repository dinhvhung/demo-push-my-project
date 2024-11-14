package application;
// Tao 1 màn hình, 1 nút, hành động khi ấn nút
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;


public class Main extends Application implements EventHandler<ActionEvent>{
	Button button1;
	public static void main(String[] args) 
	{
		launch(args);
	}
	
	public void start(Stage primaryStage) 
	{
		primaryStage.setTitle("Durak");
		button1 = new Button();
		button1.setText("Play");
		button1.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle (ActionEvent event)
			{
				System.out.println("Hung");
			}
		});
		StackPane layout = new StackPane();
		layout.getChildren().add(button1);
		Scene scene = new Scene (layout, 300, 250);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
	}
}
