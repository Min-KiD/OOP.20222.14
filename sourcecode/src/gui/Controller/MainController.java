package gui.Controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DialogPane;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import virus.Virus;
import virus.enveloped.*;
import virus.setup.Setup;

public class MainController implements Initializable {
//    private Parent root;
    private double x = 0;
    private double y = 0;
    private Stage stage;
//    private MediaPlayer music;
//    private File file;
    private boolean envelopeVirusStatus = false;
    private boolean nonEnvelopeVirusStatus = false;
    @FXML
    private MediaView mediaView;
    @FXML
    private Button helpButton;
    @FXML
    private ScrollPane envelopeVirusView;
    @FXML
    private ScrollPane nonEnvelopeVirusView;
    @FXML
    private ImageView coronaVirusView;
    @FXML
    private GridPane grid;
    @FXML
    private GridPane grid1;
    @FXML
    private ImageView imageView;
    private MyListener myListener;
    
    private Virus chosenItem;
    
    public void initialize(URL arg0, ResourceBundle arg1) {
    	
    	//stage = new Stage();
    	myListener = new MyListener() {
            @Override
            public void onClickListener(Virus virus, MouseEvent event) throws IOException {
                chosenItem = virus;
                showVirusScene(event);
            }
        };
        int column = 0;
        int row = 1;
        for (int i = 0; i < Setup.getVirusList().size(); i++) {
            if (Setup.getVirusList().get(i) instanceof EnvelopedVirus) {
	        	FXMLLoader fxmlLoader = new FXMLLoader();
	            fxmlLoader.setLocation(getClass().getResource("/gui/View/VirusItemView.fxml"));
	            Parent anchorPane;
				try {
					anchorPane = fxmlLoader.load();
					VirusItem itemController = fxmlLoader.getController();
		            itemController.setData(Setup.getVirusList().get(i),myListener);

                    ImageView imageView = (ImageView) anchorPane.lookup("#itemImage");
                    String imgpath = Setup.getVirusList().get(i).getStructureImage();
                    Image image = new Image(imgpath);
                    imageView.setImage(image);

		            if (column == 3) {
		                column = 0;
		                row++;
		            }
		            grid.add(anchorPane, column++, row); //(child,column,row)
		            //set grid width
		            grid.setMinWidth(Region.USE_COMPUTED_SIZE);
		            grid.setPrefWidth(Region.USE_COMPUTED_SIZE);
		            grid.setMaxWidth(Region.USE_PREF_SIZE);
		            //set grid height
		            grid.setMinHeight(Region.USE_COMPUTED_SIZE);
		            grid.setPrefHeight(Region.USE_COMPUTED_SIZE);
		            grid.setMaxHeight(Region.USE_PREF_SIZE);
	
		            GridPane.setMargin(anchorPane, new Insets(10));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            } else {
            	FXMLLoader fxmlLoader = new FXMLLoader();
	            fxmlLoader.setLocation(getClass().getResource("/gui/View/VirusItemView.fxml"));
	            Parent anchorPane;
				try {
					anchorPane = fxmlLoader.load();
					VirusItem itemController = fxmlLoader.getController();
		            itemController.setData(Setup.getVirusList().get(i),myListener);

                    ImageView imageView = (ImageView) anchorPane.lookup("#itemImage");
                    String imgpath = Setup.getVirusList().get(i).getStructureImage();
                    Image image = new Image(imgpath);
                    imageView.setImage(image);

		            if (column == 3) {
		                column = 0;
		                row++;
		            }
		            grid1.add(anchorPane, column++, row); //(child,column,row)
		            //set grid width
		            grid1.setMinWidth(Region.USE_COMPUTED_SIZE);
		            grid1.setPrefWidth(Region.USE_COMPUTED_SIZE);
		            grid1.setMaxWidth(Region.USE_PREF_SIZE);
		            //set grid height
		            grid1.setMinHeight(Region.USE_COMPUTED_SIZE);
		            grid1.setPrefHeight(Region.USE_COMPUTED_SIZE);
		            grid1.setMaxHeight(Region.USE_PREF_SIZE);
	
		            GridPane.setMargin(anchorPane, new Insets(10));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            	
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
        ImageView icon = new ImageView(new File("/gui/media/IconVirus.png").toURI().toString());
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
    
    public void showVirusScene(MouseEvent event) throws IOException {
    	Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    	FXMLLoader loader = new FXMLLoader(Objects.requireNonNull(getClass().getResource("/gui/View/VirusView.fxml")));
		VirusController controller = new VirusController(chosenItem);
    	loader.setController(controller);
    	Parent root = loader.load();
    	controller.check(); //try to remove this 
        Scene scene1 = new Scene(root);
        scene1.setRoot(root);
        stage.setScene(scene1);
        stage.show();
    }

}
