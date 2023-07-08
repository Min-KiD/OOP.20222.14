package virus.nonenveloped;

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

	
	public Reoviridae(AcidNucleic typeOfAcidNucleic, Capsid typeOfNucleocapsid, String innerC, String outerC) {
		super(typeOfAcidNucleic, typeOfNucleocapsid);
		this.innerC = innerC;
		this.outerC = outerC;
		
	}
	
}
