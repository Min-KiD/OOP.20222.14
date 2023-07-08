package virus.enveloped;

import virus.Virus;
import virus.construct.AcidNucleic;
import virus.construct.Capsid;

public abstract class EnvelopedVirus extends Virus{

	private Enveloped envelopedVirus;

    public EnvelopedVirus(AcidNucleic typeOfAcidNucleic, Capsid typeOfNucleocapsid, Enveloped envelopedVirus) {
        super(typeOfAcidNucleic, typeOfNucleocapsid);
        this.envelopedVirus = envelopedVirus;
    }

    public Enveloped getEnvelopedVirus() {
        return envelopedVirus;
    }

//    public void setEnvelopedVirus(Enveloped envelopedVirus) {
//        this.envelopedVirus = envelopedVirus;
//    }

}
