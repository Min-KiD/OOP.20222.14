package gui.Controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.scene.control.*;
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
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.media.MediaView;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import virus.Virus;
import virus.enveloped.*;
import virus.setup.Setup;

public class HelpController {

    private Stage stage;

    @FXML
    private TextArea textHelp;

    @FXML
    private void Introduction() {
        textHelp.setStyle("name: Arial");
        textHelp.setText("\uD835\uDDE7\uD835\uDDF5\uD835\uDDF2 \uD835\uDDE9\uD835\uDDF6\uD835\uDDFF\uD835\uDE02\uD835\uDE00 \uD835\uDDD7\uD835\uDDF2\uD835\uDDFA\uD835\uDDFC\uD835\uDDFB\uD835\uDE00\uD835\uDE01\uD835\uDDFF\uD835\uDDEE\uD835\uDE01\uD835\uDDF6\uD835\uDDFC\uD835\uDDFB \uD835\uDDFD\uD835\uDDFF\uD835\uDDFC\uD835\uDDF7\uD835\uDDF2\uD835\uDDF0\uD835\uDE01" +
                " is a small educational initiative designed to help individuals understand the characteristics " +
                "of enveloped and non-enveloped viruses, as well as the components that make up these viruses. " +
                "The primary goal of the project is to provide users with basic knowledge about different types of viruses and equip them " +
                "with essential information to prevent virus infections effectively.\n" +
                "\n" +
                "\uD835\uDDDE\uD835\uDDF2\uD835\uDE06 \uD835\uDDD9\uD835\uDDF2\uD835\uDDEE\uD835\uDE01\uD835\uDE02\uD835\uDDFF\uD835\uDDF2\uD835\uDE00:\n" +
                "\n" +
                "  - Enveloped Viruses: The project focuses on enveloped viruses, providing detailed information about their structure, composition, and unique " +
                "features. Users can learn about the lipid envelope surrounding the viral particle and its significance in the virus's life cycle and infection process.\n" +
                "\n" +
                "  - Non-Enveloped Viruses: The project also covers non-enveloped viruses, shedding light on their distinctive characteristics. " +
                "Users can explore the structural components of non-enveloped viruses, such as capsids, genetic material, and various surface proteins.\n" +
                "\n" +
                "  - Component Breakdown: The project provides an in-depth breakdown of the components that constitute enveloped and non-enveloped viruses. " +
                "Users can learn about viral envelopes, lipid bilayers, membrane proteins, nucleocapsids, viral genomes, " +
                "and other essential elements that contribute to the overall structure and function of these viruses.\n" +
                "\n" +
                "  - Input video: A short video explained about how viruses transmit into human and animal's body.");
    }

    @FXML
    private void Howtouse() {
        textHelp.setStyle("name: Arial");
        textHelp.setText("\uD835\uDDDB\uD835\uDDFC\uD835\uDE04 \uD835\uDE01\uD835\uDDFC \uD835\uDE02\uD835\uDE00\uD835\uDDF2?\n" +
                "----------------------------\n\n" +
                "There are two ways to use the app:\n\n" +
                "  - If you want to search the virus by its name, please type the name in the box appears on the main screen and press Enter.\n\n" +
                "  - If you want to explore virus by category, please click on left-pane menu to select the category, and select virus name.\n\n" +
                "  - Also, in the virus explore windows, you can choose the components you want to see, which are structure, nucleic acid, caspid, and " +
                "(maybe) envelope and also input video of the virus.");
    }

    @FXML
    private void aboutus() {
        textHelp.setStyle("name: Arial");
        textHelp.setText("This is the project of group 14, DSAI class, semester 2022.2 on the course of Object-oriented Programming, supervised by prof. NGUYEN Thi Thu Trang, PhD.\n\n" +
                "The purpose of this project is to help everyone understand different type of viruses, as well as the way they infect in order to have the basic knowledge to prevent them.\n\n" +
                "Our group includes four members:\n" +
                "  - Nguyen Tung Luong\n" +
                "  - Dao Ha Xuan Mai\n" +
                "  - Nguyen Viet Minh\n" +
                "  - Ta Ngoc Minh\n");
    }

    @FXML
    private void goback(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/View/Main.fxml"));
        MainController controller = new MainController();
        loader.setController(controller);
        Parent root = loader.load();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
