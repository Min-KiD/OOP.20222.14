package virus.enveloped;

import virus.construct.AcidNucleic;
import virus.construct.Capsid;

public class RetroVirus extends EnvelopedVirus {
	private String reverse;

	private static String reverseImage = "/src/gui/media/RetroVirus/reverse.png";
	private static String acidNucleicImage = "/src/gui/media/RetroVirus/acidNucleic.png";
	private static String envelopeImage = "/src/gui/media/RetroVirus/envelope.png";
	
	public String getReverse() {
		return reverse;
	}
	
	public String getAcidNucleicImage() {
		return acidNucleicImage;
	}
	
	public String getEnvelopeImage() {
		return envelopeImage;
	}

	
	public String getReverseImage() {
		return reverseImage;
	}

	public RetroVirus(AcidNucleic typeOfAcidNucleic, Capsid typeOfNucleocapsid,Envelope envelope,
    		String reverse) {
		super(typeOfAcidNucleic, typeOfNucleocapsid, envelope);
		this.reverse = reverse;
	}

}
