package virus.enveloped;

import virus.construct.AcidNucleic;
import virus.construct.Capsid;

public class Herpesvirusdae extends EnvelopedVirus {
	private String tegument;
	private String dna;
	private String gly;

	public String getTegument() {
		return tegument;
	}

	public String getDna() {
		return dna;
	}
	
	public String getGly() {
		return gly;
	}

	public Herpesvirusdae(AcidNucleic typeOfAcidNucleic, Capsid typeOfNucleocapsid,Enveloped envelopedVirus,
			String tegument, String dna, String gly) {
		super(typeOfAcidNucleic, typeOfNucleocapsid, envelopedVirus);
		this.tegument = tegument;
		this.dna = dna;

	}

}
