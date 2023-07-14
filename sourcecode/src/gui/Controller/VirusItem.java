package gui.Controller;

import virus.Virus;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class VirusItem {
	
	private Virus virus;
	private MyListener myListener;
	
	@FXML
    private ImageView itemImage;

    @FXML
    private Label itemLabel;

    @FXML
    private ImageView itemIcon;
    
    
    @FXML
    private void click(MouseEvent mouseEvent) throws IOException {
        myListener.onClickListener(virus, mouseEvent);
    }
    
	
	public VirusItem() {
		// TODO Auto-generated constructor stub
	}

	public void setData(Virus virus, MyListener myListener) {
        this.virus = virus;
        this.myListener = myListener;
        itemLabel.setText(virus.getClass().getSimpleName());
        //Image image = new Image(getClass().getResourceAsStream(fruit.getImgSrc()));
        //img.setImage(image);
    }

}
