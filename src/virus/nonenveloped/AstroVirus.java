package virus.nonenveloped;

import virus.AcidNucleic;
import virus.Capsid;

public class AstroVirus extends NonevelopedVirus {
	private String rna;

	public String getRna() {
		return rna;
	}

	public AstroVirus(AcidNucleic typeOfAcidNucleic, Capsid typeOfNucleocapsid, String rna) {
		super(typeOfAcidNucleic, typeOfNucleocapsid);
		this.rna = rna;
	}

}
