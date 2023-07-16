package virus.nonenveloped;

import virus.construct.AcidNucleic;
import virus.construct.Capsid;

public class AstroVirus extends NonenvelopedVirus {
	private String rna;


	public String getRna() {
		return rna;
	}

	public AstroVirus(AcidNucleic typeOfAcidNucleic, Capsid typeOfNucleocapsid, String rna,
					  String structureImage, String acidNucleicImage, String capsidImage, String envelopeImage, String inputVideo) {
		super(typeOfAcidNucleic, typeOfNucleocapsid, structureImage, acidNucleicImage, capsidImage, envelopeImage, inputVideo);
		this.rna = rna;
	}

}
