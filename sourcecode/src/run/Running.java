package run;

import java.io.File;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import virus.Virus;
import virus.setup.Setup;
import gui.Controller.*;

public class Running extends Application {
	
	@Override
    public void start(Stage primaryStage) {
        try {
        	FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/View/Main.fxml"));
    		MainController controller = new MainController();
    		loader.setController(controller);
    		Parent root = loader.load();
            primaryStage.getIcons().add(new Image(new File("src/gui/media/IconVirus.png").toURI().toString()));
            primaryStage.setTitle("Virus");
            primaryStage.initStyle(StageStyle.DECORATED);
            Scene scene = new Scene(root);
            primaryStage.initStyle(StageStyle.TRANSPARENT);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
	public static void main(String[] args) {
		Setup setupIni = new Setup(); 	
		setupIni.setup();
		for (Virus item : Setup.getVirusList()){
        	System.out.println(item.getClass().getSimpleName()+" is a " + item.getTypeOfAcidNucleic().getTypeOfAcidNucleic() + " virus");
		}
		launch(args);
		
	}

}
