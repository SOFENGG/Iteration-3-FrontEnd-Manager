import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import ui.ManagerView;

public class Driver extends Application{
	
	protected static final String WINDOW_TITLE = "POS System";
	
	public static void main (String args[]) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		/* Super Controller Start */
		
			primaryStage.setTitle(WINDOW_TITLE);
			
			/* Setting of Height and Width */
				primaryStage.setMinWidth(1280);
				primaryStage.setMinHeight(720);
			
			/* Scene Creation */
				Scene scene = new Scene(new Group(), primaryStage.getWidth(), primaryStage.getHeight());
			scene.getStylesheets().add("./StyleSheet.css");
			primaryStage.setScene(scene);
			primaryStage.show();
		/* Super Controller End */
			
			scene.setRoot(new ManagerView());
	}

}
