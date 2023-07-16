package virus.nonenveloped;

import virus.construct.AcidNucleic;
import virus.construct.Capsid;
import virus.Virus;

public abstract class NonenvelopedVirus extends Virus {

	public NonenvelopedVirus(AcidNucleic typeOfAcidNucleic, Capsid typeOfNucleocapsid,
                             String structureImage, String acidNucleicImage, String caspidImage, String envelopeImage, String inputVideo) {
        super(typeOfAcidNucleic, typeOfNucleocapsid, structureImage, acidNucleicImage, caspidImage, envelopeImage, inputVideo);
    }

}
