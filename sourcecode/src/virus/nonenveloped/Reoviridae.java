package virus.nonenveloped;

import virus.AcidNucleic;
import virus.Capsid;

public class Reoviridae extends NonevelopedVirus {
	private String innerC;
	private String outerC;
	
	public String getInnerC() {
		return innerC;
	}

	public String getOuterC() {
		return outerC;
	}

	
	public Reoviridae(AcidNucleic typeOfAcidNucleic, Capsid typeOfNucleocapsid, String innerC, String outerC) {
		super(typeOfAcidNucleic, typeOfNucleocapsid);
		this.innerC = innerC;
		this.outerC = outerC;
		
	}
	
}
