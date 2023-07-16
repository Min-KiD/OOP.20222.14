package virus.enveloped;

import virus.construct.AcidNucleic;
import virus.construct.Capsid;

public class Herpesvirusdae extends EnvelopedVirus {
	private String tegument;
	private static String tegumentImage = "virus/enveloped/Image/tegument.png";

	public String getTegument() {
		return tegument;
	}
	
	public String getTegumentImage() {
		return tegumentImage;
	}

	public Herpesvirusdae(AcidNucleic typeOfAcidNucleic, Capsid typeOfNucleocapsid, 
			Envelope envelope, String tegument, String structureImage, String acidNucleicImage, String capsidImage, String envelopeImage, String inputVideo) {
		super(typeOfAcidNucleic, typeOfNucleocapsid, envelope, structureImage, acidNucleicImage, capsidImage, envelopeImage, inputVideo);
		this.tegument = tegument;
	}

}
