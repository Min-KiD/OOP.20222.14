package run;

import java.io.File;
import java.util.List;
import java.util.Objects;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import virus.Virus;
import virus.setup.Setup;

public class Running extends Application {
	
	@Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/gui/View/Menu.fxml")));
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
