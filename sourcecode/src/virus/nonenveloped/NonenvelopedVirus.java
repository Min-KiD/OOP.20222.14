package virus.nonenveloped;

import virus.construct.AcidNucleic;
import virus.construct.Capsid;
import virus.Virus;

public abstract class NonenvelopedVirus extends Virus {

	public NonenvelopedVirus(AcidNucleic typeOfAcidNucleic, Capsid typeOfNucleocapsid) {
        super(typeOfAcidNucleic, typeOfNucleocapsid);
    }

}
