package virus.nonenveloped;

import java.util.ArrayList;

import virus.construct.AcidNucleic;
import virus.construct.Capsid;

public class Reoviridae extends NonenvelopedVirus {
	private String innerC;
	private String outerC;

	public String getInnerC() {
		return innerC;
	}

	public String getOuterC() {
		return outerC;
	}

	
	public Reoviridae(AcidNucleic typeOfAcidNucleic, Capsid typeOfNucleocapsid, String innerC, String outerC,
					  String structureImage, String acidNucleicImage, String capsidImage, String envelopeImage, String inputVideo) {
		super(typeOfAcidNucleic, typeOfNucleocapsid, structureImage, acidNucleicImage, capsidImage, envelopeImage, inputVideo);
		this.innerC = innerC;
		this.outerC = outerC;
		
	}
	
	public ArrayList<String> getSpecialInfo() {
		// TODO Auto-generated method stub
		ArrayList<String> info = new ArrayList<String>();
		info.add(innerC);
		info.add(outerC);
		return info;
	}

	@Override
	public ArrayList<String> getSpecialImage() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
