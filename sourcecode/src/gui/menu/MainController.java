package gui.menu;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DialogPane;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import java.util.List;
import java.util.ArrayList;
import virus.Virus;
import virus.enveloped.*;
import virus.nonenveloped.*;
import virus.setup.Setup;

public class MainController implements Initializable {
//    private Parent root;
    private double x = 0;
    private double y = 0;
    private Stage stage;
    private Scene scene;
//    private MediaPlayer music;
//    private File file;
    private boolean envelopeVirusStatus = false;
    private boolean nonEnvelopeVirusStatus = false;
    private Timeline tmfadedMusic;
    private Timeline tmStopMusic;
    @FXML
    private MediaView mediaView;
    @FXML
    private Button helpButton;
    @FXML
    private VBox envelopeVirusView;
    @FXML
    private VBox nonEnvelopeVirusView;
    @FXML
    private ImageView coronaVirusView;
    
    private Virus chosenItem;
    
    public void initialize(URL arg0, ResourceBundle arg1) {
    	
    	for (Virus v: Setup.getVirusList()) {
    		if (v instanceof EnvelopedVirus) {
    			VirusItem item = new VirusItem(v.getClass().getSimpleName(), v);
    			item.setOnAction(new EventHandler<ActionEvent>() {
    			    @Override public void handle(ActionEvent e) {
    			        chosenItem = item.getVirus();
    			        showVirusScene();
    			    }
    			});
    			envelopeVirusView.getChildren().add(item);
    		} else if (v instanceof NonenvelopedVirus){
    			nonEnvelopeVirusView.getChildren().add(new VirusItem(v.getClass().getSimpleName(), v));
    		}
    	}
    	
        envelopeVirusView.setVisible(envelopeVirusStatus);
        nonEnvelopeVirusView.setVisible(nonEnvelopeVirusStatus);
    }

    @FXML
    void nonEnvelopeVirus(ActionEvent e) {
        if (!nonEnvelopeVirusStatus) {
            nonEnvelopeVirusView.setVisible(true);
            nonEnvelopeVirusStatus = true;
            envelopeVirusView.setVisible(false);
            envelopeVirusStatus = false;

        } else {
            nonEnvelopeVirusView.setVisible(false);
            nonEnvelopeVirusStatus = false;
        }
    }

    @FXML
    void envelopeVirus(ActionEvent e) {
        if (!envelopeVirusStatus) {
            envelopeVirusView.setVisible(true);
            envelopeVirusStatus = true;
            nonEnvelopeVirusView.setVisible(false);
            nonEnvelopeVirusStatus = false;

        } else {
            envelopeVirusView.setVisible(false);
            envelopeVirusStatus = false;
        }


    }

    @FXML
    void help(ActionEvent e) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/GUI/mainmenu/FXML/help.fxml")));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e1) {
        }
    }

    @FXML
    void exit(ActionEvent e) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("EXIT");
        alert.setHeaderText("DO YOU SURE TO EXIT?");
        alert.setContentText("Choose your option");
        alert.initStyle(StageStyle.UNDECORATED);
        ImageView icon = new ImageView(new File("src/gui/media/IconVirus.png").toURI().toString());
        icon.setFitHeight(50);
        icon.setFitWidth(50);
        alert.getDialogPane().setGraphic(icon);

        ButtonType buttonTypeYes = new ButtonType("YES", ButtonBar.ButtonData.OK_DONE);
        ButtonType buttonTypeNo = new ButtonType("NO", ButtonBar.ButtonData.CANCEL_CLOSE);

        DialogPane dialogPane = alert.getDialogPane();
        dialogPane.getStyleClass().add("myDialog");


        alert.getButtonTypes().setAll(buttonTypeYes, buttonTypeNo);
        Optional<ButtonType> result = alert.showAndWait();

        if (result.get() == buttonTypeYes) {
            System.exit(0);
        }
    }

    @FXML
    void minimize(ActionEvent e) {
        ((Stage) (((Button) e.getSource()).getScene().getWindow())).setIconified(true);
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
    
    public void showVirusScene() {
    	
    }

}
