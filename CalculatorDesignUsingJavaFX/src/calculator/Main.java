package calculator;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application
{
	@Override
	public void start(Stage primaryStage)
	{
		try 
		{
			Parent root = FXMLLoader.load(getClass()
                    .getResource("../MyScene.fxml"));
			
			Scene scene = new Scene(root,350,450);
			scene.getStylesheets().add(getClass().getResource("Calculator.css").toExternalForm());
			
			primaryStage.setScene(scene);
			primaryStage.setTitle("Calculator");
			primaryStage.show();
		} 
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) 
	{
		launch(args);
	}
}
