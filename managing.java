package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class managing extends Application {
	@Override
	public void start(Stage primaryStage) {
		Label la = new Label("Hello, this is a JavaFX Label!");
        Button button=new Button("click me");
        button.setOnAction(data->la.setText("welcome to my page"));
        VBox layout = new VBox(30);               
        layout.getChildren().addAll(la, button);
        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setTitle("JavaFX Label Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
	
	public static void main(String[] args) {
		launch(args);
	}
} 