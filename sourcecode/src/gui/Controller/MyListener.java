package gui.Controller;

import java.io.IOException;

import javafx.scene.input.MouseEvent;
import virus.Virus;

public interface MyListener {
    public void onClickListener(Virus virus, MouseEvent e) throws IOException;

}