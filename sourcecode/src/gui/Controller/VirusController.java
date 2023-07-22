package gui.Controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;
import javafx.scene.control.MenuItem;
import javafx.fxml.Initializable;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.MenuButton;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import virus.Virus;
import virus.nonenveloped.NonenvelopedVirus;

public class VirusController implements Initializable {

    @FXML
    private ImageView mainImage;

    @FXML
    private RadioButton envelopeButton;

    @FXML
    private MenuButton specialAttributes;
    @FXML
    private ImageView imageView;
    
    @FXML
    private TextArea textData;
    
    private Virus virus;
    private Stage stage;
    private double x = 0;
    private double y = 0;
    private int index;
    
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
    void showStructure(ActionEvent event) {
        String txt = virus.getTypeOfNucleoapsid().getTypeOfStructureCapsid();
        textData.setText(txt);
        String imgpath = virus.getStructureImage();
        Image image = new Image(imgpath);
        ImageView imageView = new ImageView(image);

        double desiredWidth = 750.0;
        double aspectRatio = image.getWidth() / image.getHeight();
        double desiredHeight = desiredWidth / aspectRatio;

        imageView.setFitWidth(desiredWidth);
        imageView.setFitHeight(desiredHeight);
        Stage stage = new Stage();

        Scene currentScene = ((Node) event.getSource()).getScene();

        Parent root = currentScene.getRoot();

        ((Pane) root).getChildren().add(imageView);
    }

    @FXML
    void showAcidNucleic(ActionEvent event) throws FileNotFoundException {
    	String txt = virus.getTypeOfAcidNucleic().getTypeOfAcidNucleic();
    	textData.setText(txt);
        String imgpath = virus.getacidNucleicImage();
        Image image = new Image(imgpath);
        ImageView imageView = new ImageView(image);

        double desiredWidth = 750.0;
        double aspectRatio = image.getWidth() / image.getHeight();
        double desiredHeight = desiredWidth / aspectRatio;

        imageView.setFitWidth(desiredWidth);
        imageView.setFitHeight(desiredHeight);
        Stage stage = new Stage();

        Scene currentScene = ((Node) event.getSource()).getScene();

        Parent root = currentScene.getRoot();

        ((Pane) root).getChildren().add(imageView);
    }
    
    @FXML
    void showCapsid(ActionEvent event) {
    	String txt = virus.getTypeOfNucleoapsid().getTypeOfStructureCapsid();
    	textData.setText(txt);
        String imgpath = virus.getCaspidImage();
        Image image = new Image(imgpath);
        ImageView imageView = new ImageView(image);

        double desiredWidth = 750.0;
        double aspectRatio = image.getWidth() / image.getHeight();
        double desiredHeight = desiredWidth / aspectRatio;

        imageView.setFitWidth(desiredWidth);
        imageView.setFitHeight(desiredHeight);
        Stage stage = new Stage();

        Scene currentScene = ((Node) event.getSource()).getScene();

        Parent root = currentScene.getRoot();

        ((Pane) root).getChildren().add(imageView);
    }

    @FXML
    void showEnvelope(ActionEvent event) {
        String txt = virus.getTypeOfNucleoapsid().getTypeOfStructureCapsid();
        textData.setText(txt);
        String imgpath = virus.getEnvelopeImage();
        Image image = new Image(imgpath);
        ImageView imageView = new ImageView(image);

        double desiredWidth = 750.0;
        double aspectRatio = image.getWidth() / image.getHeight();
        double desiredHeight = desiredWidth / aspectRatio;

        imageView.setFitWidth(desiredWidth);
        imageView.setFitHeight(desiredHeight);
        Stage stage = new Stage();

        Scene currentScene = ((Node) event.getSource()).getScene();

        Parent root = currentScene.getRoot();

        ((Pane) root).getChildren().add(imageView);
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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        String txt = virus.getTypeOfNucleoapsid().getTypeOfStructureCapsid();
        textData.setText(txt);
        String imgpath = virus.getStructureImage();
        Image image = new Image(imgpath);
        //ImageView imageView = new ImageView(image);
        imageView.setImage(image);

        double desiredWidth = 750.0;
        double aspectRatio = image.getWidth() / image.getHeight();
        double desiredHeight = desiredWidth / aspectRatio;

        imageView.setFitWidth(desiredWidth);
        imageView.setFitHeight(desiredHeight);
        
        for (int i = 0; i < virus.getSpecialInfo().size(); i++) {
        	MenuItem menuItem = new MenuItem("Action "+(i+1));
        	specialAttributes.getItems().add(menuItem);
        	index = i;
        	menuItem.setOnAction(new EventHandler<ActionEvent>() {
                public void handle(ActionEvent t) {
                	textData.setText(virus.getSpecialInfo().get(index));
                	try {
                		String imgpath = virus.getSpecialImage().get(index);
	                    Image image = new Image(imgpath);
	                    //ImageView imageView = new ImageView(image);
	                    imageView.setImage(image);
                	} catch (IllegalArgumentException e) {
                		
                	}
	                	
                	
                }
            });
        }
        
    }
}