package gui.Controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Collections;
import java.util.Objects;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.stream.IntStream;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.collections.FXCollections;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
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
    private boolean searchGridStatus = true;
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
    private Pane searchGridView;
    @FXML
    private ImageView imageView;
    private MyListener myListener;
    @FXML
    private ListView<String> suggestionList;
    @FXML
    private TextField searchField;
    private ObservableList<String> suggestions;
    private Virus chosenItem;
	
    public void initialize(URL arg0, ResourceBundle arg1) {
        myListener = new MyListener() {
            @Override
            public void onClickListener(Virus virus, MouseEvent event) throws IOException {
                chosenItem = virus;
                showVirusScene(event);
            }
        };

        // Handle user input to show suggestion
        suggestions = FXCollections.observableArrayList(Setup.getVirusListString());
        suggestionList.setItems(suggestions);

        FilteredList<String> filteredData = new FilteredList<>(suggestions, s -> true);
        searchField.textProperty().addListener(obs->{
            String filter = searchField.getText();
            if(filter == null || filter.length() == 0) {
                filteredData.setPredicate(s -> true);
            }
            else {
                filteredData.setPredicate(s -> s.toLowerCase().contains(filter.toLowerCase()));
            }
        });
        suggestionList.setItems(filteredData);

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
        searchGridView.setVisible(searchGridStatus);
        envelopeVirusView.setVisible(envelopeVirusStatus);
        nonEnvelopeVirusView.setVisible(nonEnvelopeVirusStatus);
    }

    @FXML
    private void handleCellClick(MouseEvent event) throws IOException {
        String selectedValue = suggestionList.getSelectionModel().getSelectedItem();
        if (selectedValue != null) {
            for (Virus virus : Setup.getVirusList()) {
                if (virus.getClass().getName().toString() == selectedValue) {
                    chosenItem = virus;
                }
            }
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(Objects.requireNonNull(getClass().getResource("/gui/View/VirusView.fxml")));
            VirusController controller = new VirusController(chosenItem);
            loader.setController(controller);
            Parent root = loader.load();
            controller.check();
            Scene scene1 = new Scene(root);
            scene1.setRoot(root);
            stage.setScene(scene1);
            stage.show();
        }
        else {}
    }

    @FXML
    void nonEnvelopeVirus(ActionEvent e) {
        if (!nonEnvelopeVirusStatus) {
            nonEnvelopeVirusView.setVisible(true);
            nonEnvelopeVirusStatus = true;
            envelopeVirusView.setVisible(false);
            envelopeVirusStatus = false;
            searchGridStatus = false;
            searchGridView.setVisible(false);
        } else {
            nonEnvelopeVirusView.setVisible(false);
            nonEnvelopeVirusStatus = false;
            searchGridStatus = true;
            searchGridView.setVisible(true);
        }
    }

    @FXML
    void envelopeVirus(ActionEvent e) {
        if (!envelopeVirusStatus) {
            envelopeVirusView.setVisible(true);
            envelopeVirusStatus = true;
            nonEnvelopeVirusView.setVisible(false);
            nonEnvelopeVirusStatus = false;
            searchGridStatus = false;
            searchGridView.setVisible(false);
        } else {
            envelopeVirusView.setVisible(false);
            envelopeVirusStatus = false;
            searchGridStatus = true;
            searchGridView.setVisible(true);
        }


    }

    @FXML
    void help(ActionEvent e) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/View/HelpView.fxml"));
            HelpController controller = new HelpController();
            loader.setController(controller);
            Parent root = loader.load();
            stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
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
        System.out.println(chosenItem);
    	loader.setController(controller);
    	Parent root = loader.load();
    	controller.check(); //try to remove this 
        Scene scene1 = new Scene(root);
        scene1.setRoot(root);
        stage.setScene(scene1);
        stage.show();
    }

}
