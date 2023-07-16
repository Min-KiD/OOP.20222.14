package virus.enveloped;

import virus.Virus;
import virus.construct.AcidNucleic;
import virus.construct.Capsid;

public abstract class EnvelopedVirus extends Virus{

	private Envelope envelopedVirus;
	private static String structure = "/src/gui/media/evelope.png";

    public EnvelopedVirus(AcidNucleic typeOfAcidNucleic, Capsid typeOfNucleocapsid, Envelope envelopedVirus) {
        super(typeOfAcidNucleic, typeOfNucleocapsid);
        this.envelopedVirus = envelopedVirus;
    }

    public Envelope getEnvelopedVirus() {
        return envelopedVirus;
    }
    
    public String getStructure() {
    	return structure;
    }

}
