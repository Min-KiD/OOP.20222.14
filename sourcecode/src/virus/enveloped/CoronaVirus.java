package virus.enveloped;

import virus.construct.AcidNucleic;
import virus.construct.Capsid;

public class CoronaVirus extends EnvelopedVirus {
	private String envelopeProtein;
	private String mProtein;
	
	private static String structureImage = "/gui/enveloped/corona.png";
	private static String envelopeProteinImage = "/src/gui/media/CoronaVirus/envelopeProtein.png";
	private static String mProteinImage = "/src/gui/media/CoronaVirus/mProtein.png";
	private static String acidNucleicImage = "/src/gui/media/CoronaVirus/acidNucleic.png";
	private static String envelopeImage = "/src/gui/media/CoronaVirus/envelope.png";
	
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
	
	public String getAcidNucleicImage() {
		return acidNucleicImage;
	}
	
	public String getEnvelopeImage() {
		return envelopeImage;
	}

    public CoronaVirus(AcidNucleic typeOfAcidNucleic, Capsid typeOfNucleocapsid,Envelope envelope,
    		String envelopeProtein,String mProtein) {
        super(typeOfAcidNucleic, typeOfNucleocapsid, envelope);
        this.envelopeProtein = envelopeProtein;
        this.mProtein = mProtein;
    }
    
    public String getStructureImage() {
    	return structureImage;
    }

}
