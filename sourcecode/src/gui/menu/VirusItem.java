package gui.menu;

import javafx.scene.Node;
import javafx.scene.control.Button;
import virus.Virus;

public class VirusItem extends Button {
	
	private Virus virus;
	
	public VirusItem() {
		// TODO Auto-generated constructor stub
	}

	public VirusItem(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public VirusItem(String arg0, Node arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}
	
	public VirusItem(String arg0, Virus v) {
		super(arg0);
		this.virus = v;
	}
	
	public Virus getVirus() {
		return virus;
	}

}
