package application;


import java.io.IOException;
import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;

public class Main extends Application {
	@FXML
	AnchorPane myPane;
	Stage stage;
	@Override

	public void start(Stage primaryStage) {
		stage = primaryStage;
		FXMLLoader loader = new FXMLLoader(getClass().getResource("JFXsplashscreen.fxml"));

		try {
			myPane = (AnchorPane) loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scene scn = new Scene(myPane);
		scn.getStylesheets().add("https://fonts.googleapis.com/css?family=Black+Han+Sans");
		
		//Importar en local
		/*
		Font.loadFont(
				getClass().getResourceAsStream(
						"assets/Sacramento-Regular.ttf"), 20);
		*/
		
		primaryStage.setScene(scn);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
	
	public void closeStage() {
		stage.close();
	}
}
