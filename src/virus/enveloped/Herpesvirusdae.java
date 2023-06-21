package virus.enveloped;

import virus.AcidNucleic;
import virus.Capsid;

public class Herpesvirusdae extends EnvelopedVirus {
	private String tegument;
	private String dna;

	public String getTegument() {
		return tegument;
	}

	public String getDna() {
		return dna;
	}

	public Herpesvirusdae(AcidNucleic typeOfAcidNucleic, Capsid typeOfNucleocapsid,Enveloped envelopedVirus,
			String tegument, String dna) {
		super(typeOfAcidNucleic, typeOfNucleocapsid, envelopedVirus);
		this.tegument = tegument;
		this.dna = dna;

	}

}
