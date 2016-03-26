package photoalbum.controller;

import java.util.ArrayList;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Login extends AlbumController {
	
	@FXML
	Button LoginLoginButton;
	
	@FXML 
	Button LoginCloseButton;
	
	@FXML 
	TextField LoginField;
	
	ArrayList<String> users;
	
	@FXML
	public void CloseClicked() {
		System.out.println("Closing...");
		Platform.exit();
	}
	
	@FXML
	public void LoginClicked() {
		this.app.switchScene((Stage)LoginField.getScene().getWindow(), "albums");
//		String login = LoginField.getText().trim();
//		System.out.println(login);
	}
}
