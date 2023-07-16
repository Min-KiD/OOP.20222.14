package gui.Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import virus.Virus;

public class VideoPlayerController implements Initializable {
	
	@FXML
    private MediaView mediaVideo;
	
	private Virus virus;
	private Runnable r;
	private double x = 0;
    private double y = 0;

	public VideoPlayerController(Virus virus, Runnable r) {
		// TODO Auto-generated constructor stub
		this.virus = virus;
		this.r = r;
	}
	
    @FXML
    void playMedia(ActionEvent event) {

    }

    @FXML
    void prevScene(ActionEvent event) {
    	r.run();
    }

    @FXML
    void resetMedia(ActionEvent event) {

    }

    @FXML
    void skipMedia(ActionEvent event) {

    }
	
	public void check() {
		
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

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	

}
