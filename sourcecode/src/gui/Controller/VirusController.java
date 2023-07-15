package gui.Controller;

import java.io.IOException;
import java.util.Objects;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import virus.Virus;
import virus.nonenveloped.NonenvelopedVirus;

public class VirusController {

    @FXML
    private ImageView mainImage;

    @FXML
    private RadioButton envelopeButton;

    @FXML
    private MenuButton specialAttributes;
    
    @FXML
    private TextArea textData;
    
    private Virus virus;
    private Stage stage;
    private double x = 0;
    private double y = 0;
    
    public VirusController(Virus v) {
    	this.virus = v;
    }

    @FXML
    void playVideo(ActionEvent event) throws IOException {
    	stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    	Scene e = ((Node) event.getSource()).getScene();
    	Runnable r = () -> Platform.runLater(
	            () -> {
	            	stage.setScene(e);
	            }
	            
	        );
    	FXMLLoader loader = new FXMLLoader(Objects.requireNonNull(getClass().getResource("/gui/View/VideoPlayerView.fxml")));
    	VideoPlayerController controller = new VideoPlayerController(virus, r);
    	loader.setController(controller);
    	Parent root = loader.load();
    	controller.check();
        Scene scene1 = new Scene(root);
        scene1.setRoot(root);
        stage.setScene(scene1);
        stage.show();
    }

    @FXML
    void sendHome(ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/View/Main.fxml"));
		MainController controller = new MainController();
		loader.setController(controller);
		Parent root = loader.load();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void showStructure() {
    	
    }
    
    @FXML
    void showAcidNucleic(ActionEvent event) {
    	String txt = virus.getTypeOfAcidNucleic().getTypeOfAcidNucleic();
    	textData.setText(txt);
    }
    
    @FXML
    void showCapsid(ActionEvent event) {
    	String txt = virus.getTypeOfNucleoapsid().getTypeOfStructureCapsid();
    	textData.setText(txt);
    }

    @FXML
    void showEnvelope(ActionEvent event) {

    }
    
    public void check() {
    	if (virus instanceof NonenvelopedVirus) {
    		envelopeButton.setVisible(false);
    	}
    }
    
    @FXML
    void dragged(MouseEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setX(event.getScreenX() - x);
        stage.setY(event.getScreenY() - y);
    }

    @FXML
    void pressed(MouseEvent event) {
        x = event.getSceneX();
        y = event.getSceneY();
    }
    
}