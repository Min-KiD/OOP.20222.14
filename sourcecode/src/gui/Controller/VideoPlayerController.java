package gui.Controller;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.concurrent.Worker;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.media.MediaView;

import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import virus.Virus;

public class VideoPlayerController implements Initializable {
	
	@FXML
    private MediaView mediaVideo;
	
	private Virus virus;
	private Runnable r;
	private double x = 0;
    private double y = 0;
    private Stage stage;
    private WebView webView;
    private WebEngine webEngine;

	public VideoPlayerController(Virus virus, Runnable r) {
		// TODO Auto-generated constructor stub
		this.virus = virus;
		this.r = r;
	}
	
    @FXML
    void playMedia(ActionEvent event) {
        webView = new WebView();
        webEngine = webView.getEngine();
        try {
            webEngine.load(null);
        }
        catch (RuntimeException ex) {
            System.out.println("");
        }
        webEngine.load(virus.getInputVideo());
        webView.setPrefSize(800, 450);
        Stage stage = new Stage();

        Scene currentScene = ((Node) event.getSource()).getScene();

        Parent root = currentScene.getRoot();

        ((Pane) root).getChildren().add(webView);
    }

    @FXML
    void prevScene(ActionEvent event) {
        try {
            webEngine.load(null);
        }
        catch (RuntimeException ex) {
            System.out.println("");
        }
        finally {
            r.run();
        }
    }

    @FXML
    void resetMedia(ActionEvent event) {

    }

    @FXML
    void skipMedia(ActionEvent event) {
        webEngine.executeScript("playVideo();");
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
