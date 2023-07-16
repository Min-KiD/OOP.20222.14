package virus.enveloped;

import virus.construct.AcidNucleic;
import virus.construct.Capsid;

public class Herpesvirusdae extends EnvelopedVirus {
	private String tegument;
	
	private static String tegumentImage = "/src/gui/media/HerpesVirus/tegument.png";
	private static String acidNucleicImage = "/src/gui/media/HerpesVirus/acidNucleic.png";
	private static String envelopeImage = "/src/gui/media/HerpesVirus/envelope.png";

	public String getTegument() {
		return tegument;
	}
	
	public String getTegumentImage() {
		return tegumentImage;
	}
	
	public String getAcidNucleicImage() {
		return acidNucleicImage;
	}
	
	public String getEnvelopeImage() {
		return envelopeImage;
	}


	public Herpesvirusdae(AcidNucleic typeOfAcidNucleic, Capsid typeOfNucleocapsid, 
			Envelope envelope, String tegument) {
		super(typeOfAcidNucleic, typeOfNucleocapsid, envelope);
		this.tegument = tegument;
	}

}
