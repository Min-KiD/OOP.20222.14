package gui.menu;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuButton;
import javafx.scene.control.RadioButton;
import javafx.scene.image.ImageView;
import virus.Virus;
import virus.nonenveloped.NonenvelopedVirus;

public class VirusController {

    @FXML
    private ImageView mainImage;

    @FXML
    private RadioButton envelopeButton;

    @FXML
    private MenuButton specialAttributes;
    
    private Virus virus;
    
    public VirusController(Virus virus) {
    	this.virus = virus;
    	if (virus instanceof NonenvelopedVirus) {
    		envelopeButton.setVisible(false);
    	}
    }

    @FXML
    void playVideo(ActionEvent event) {

    }

    @FXML
    void sendHome(ActionEvent event) {

    }

    @FXML
    void showAcidNucleic(ActionEvent event) {
    }
    
}