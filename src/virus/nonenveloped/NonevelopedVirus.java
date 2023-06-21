package virus.nonenveloped;

import virus.AcidNucleic;
import virus.Capsid;
import virus.Virus;

public abstract class NonevelopedVirus extends Virus {

	public NonevelopedVirus(AcidNucleic typeOfAcidNucleic, Capsid typeOfNucleocapsid) {
        super(typeOfAcidNucleic, typeOfNucleocapsid);
    }

}
