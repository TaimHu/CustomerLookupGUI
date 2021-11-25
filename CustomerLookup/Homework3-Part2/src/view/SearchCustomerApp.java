package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class SearchCustomerApp extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage stage) throws Exception {
		
		
		//TODO 1: load the FXML layout file "CustomerSearchLayout.fxml" in the Parent object below (see class example)
		Pane root = FXMLLoader.load(getClass().getResource("CustomerSearchLayout.fxml"));
		stage.setScene(new Scene(root, 700, 750));
		
		//TODO 2: set the title of the window to "Customer Search v1.0"
		stage.setTitle("Customer Search v1.0");
		
		//TODO 3: Complete this method such that it will display the window of the program.
		stage.show();
		
	}

}
