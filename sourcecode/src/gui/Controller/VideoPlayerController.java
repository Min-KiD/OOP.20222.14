package gui.Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.media.MediaView;
import virus.Virus;

public class VideoPlayerController implements Initializable {
	
	@FXML
    private MediaView mediaVideo;
	
	private Virus virus;
	private Runnable r;

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

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
