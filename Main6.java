package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main6 {

	public static void main(String[] args) {
		MyNumber example = new MyNumber();
		example.numberProperty().addListener((observable, oldValue, newValue) -> { // bat su kien thay doi
			System.out.println (observable);
			System.out.println(oldValue);
			System.out.println(newValue);
		});
		example.setNumber(20);
		example.setNumber(22);
	}
}
