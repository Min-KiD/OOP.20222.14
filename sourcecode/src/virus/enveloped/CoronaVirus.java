package virus.enveloped;

import virus.construct.AcidNucleic;
import virus.construct.Capsid;

public class CoronaVirus extends EnvelopedVirus {
	private String envelopeProtein;
	private String mProtein;
	
	private static String envelopeProteinImage = "/src/gui/media/CoronaVirus/envelopeProtein.png";
	private static String mProteinImage = "/src/gui/media/CoronaVirus/mProtein.png";

	public String getEnvelopeProtein() {
		return envelopeProtein;
	}

	public String getMprotein() {
		return mProtein;
	}
	
	public String getEnvelopeProteinImage() {
		return envelopeProteinImage;
	}

	public String getMproteinImage() {
		return mProteinImage;
	}


    public CoronaVirus(AcidNucleic typeOfAcidNucleic, Capsid typeOfNucleocapsid, Envelope envelope,
    		String envelopeProtein ,String mProtein, String structureImage, String acidNucleicImage, String caspidImage, String envelopeImage, String inputVideo) {
        super(typeOfAcidNucleic, typeOfNucleocapsid, envelope, structureImage, acidNucleicImage, caspidImage, envelopeImage, inputVideo);
        this.envelopeProtein = envelopeProtein;
        this.mProtein = mProtein;
    }

}
