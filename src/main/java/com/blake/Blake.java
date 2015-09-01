package com.blake;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Main class for launching the Dragon application.
 *
 * @author Josh
 *         February 24, 2015
 */
public class Blake extends Application
{

	/**
	 * Main method.
	 *
	 * @param args Command line arguments.
	 */
	public static void main(String[] args)
	{
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception
	{
		// Load up the main flow page.
		FXMLLoader fxml = new FXMLLoader(getClass().getClassLoader().getResource("./presentation/blake.fxml"));
		BorderPane borderPane = fxml.load();

		// Add it to the main scene.
		Scene scene = new Scene(borderPane);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Blake");
		primaryStage.show();

		// Set the icon
	}

	@Override
	public void stop() throws Exception
	{
		super.stop();
	}

}
