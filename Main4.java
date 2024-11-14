package application;
// viet chuong trinh hien 1 dialog yeu cau nhap ten va mat khau
import java.util.Optional;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.util.Pair;
import javafx.geometry.Insets;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.Node;

public class Main4 extends Application {
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) {
		Dialog<Pair<String, String>> dialog = new Dialog<>();
		dialog.setTitle("Login Dialog");
		dialog.setHeaderText("Sign up");
		ButtonType loginButtonType = new ButtonType("Login", ButtonBar.ButtonData.OK_DONE);
		dialog.getDialogPane().getButtonTypes().addAll(loginButtonType, ButtonType.CANCEL);
		
		GridPane grid = new GridPane();
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets (20, 150, 10, 10));
		
		TextField userName = new TextField ();
		userName.setPromptText("Username");
		PasswordField password = new PasswordField();
		password.setPromptText("Password");
		
		grid.add(new Label("Username"), 0, 0);
		grid.add(userName, 1, 0);
		grid.add(new Label("Password"), 0, 1);
		grid.add(password, 1, 1);
		
		Node loginButton = dialog.getDialogPane().lookupButton(loginButtonType);
		loginButton.setDisable (true);
		
		userName.textProperty().addListener((observable, oldValue, newValue) -> {
			loginButton.setDisable (newValue.trim().isEmpty());
		});
		dialog.getDialogPane().setContent(grid);
		
		dialog.setResultConverter(dialogButton -> {
			if (dialogButton == loginButtonType)
			{
				return new Pair<>(userName.getText(), password.getText());
			}
			return null;
		});
		Optional<Pair<String, String>> result = dialog.showAndWait();
		result.ifPresent(userNamepassword -> {
			System.out.println ("Username = " + userNamepassword.getKey() + ", Password = " + userNamepassword.getValue());
		});
	}
	
	

}