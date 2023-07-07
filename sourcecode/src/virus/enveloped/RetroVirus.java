package virus.enveloped;

import virus.AcidNucleic;
import virus.Capsid;

public class RetroVirus extends EnvelopedVirus {
	private String spike;
	private String reverse;
	private String rna;

	public String getSpike() {
		return spike;
	}

	public String getReverse() {
		return reverse;
	}

	public String getRna() {
		return rna;
	}

	public RetroVirus(AcidNucleic typeOfAcidNucleic, Capsid typeOfNucleocapsid,Enveloped envelopedVirus,
    		String spike,String reverse,String rna) {
		super(typeOfAcidNucleic, typeOfNucleocapsid, envelopedVirus);
		this.spike = spike;
		this.reverse = reverse;
		this.rna = rna;
	}

}
