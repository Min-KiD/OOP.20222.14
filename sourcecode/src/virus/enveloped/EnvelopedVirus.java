package virus.enveloped;

import virus.Virus;
import virus.construct.AcidNucleic;
import virus.construct.Capsid;

public abstract class EnvelopedVirus extends Virus{

	private Envelope envelopedVirus;

	private static String structure = "virus/enveloped/Image/envelope.png";

    public EnvelopedVirus(AcidNucleic typeOfAcidNucleic, Capsid typeOfNucleocapsid, Envelope envelopedVirus,
                          String structureImage, String acidNucleicImage, String caspidImage, String envelopeImage, String inputVideo) {
        super(typeOfAcidNucleic, typeOfNucleocapsid, structureImage, acidNucleicImage, caspidImage, envelopeImage, inputVideo);
        this.envelopedVirus = envelopedVirus;
    }

    public static String getAcidNucleicImage() {
        return "";
    }

    public Envelope getEnvelopedVirus() {
        return envelopedVirus;
    }
    
    public String getStructure() {
    	return structure;
    }
}
