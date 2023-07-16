package virus.nonenveloped;

import virus.construct.AcidNucleic;
import virus.construct.Capsid;

public class Adenoviridae extends NonenvelopedVirus {
	private String dna;
	private String hexon;
	private String penta;
	private String fiber;
	public String getDna() {
		return dna;
	}

	public String getHexon() {
		return hexon;
	}

	public String getPenta() {
		return penta;
	}

	public String getFiber() {
		return fiber;
	}

	public Adenoviridae(AcidNucleic typeOfAcidNucleic, Capsid typeOfNucleocapsid, String dna, String hexon,
			String penta, String fiber, String structureImage, String acidNucleicImage, String capsidImage, String envelopeImage, String inputVideo) {
		super(typeOfAcidNucleic, typeOfNucleocapsid, structureImage, acidNucleicImage, capsidImage, envelopeImage, inputVideo);
		this.dna = dna;
		this.hexon = hexon;
		this.penta = penta;
		this.fiber = fiber;
	}

}
