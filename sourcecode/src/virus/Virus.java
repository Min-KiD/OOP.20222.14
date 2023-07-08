package virus;

import virus.construct.AcidNucleic;
import virus.construct.Capsid;

public abstract class Virus {
    private AcidNucleic typeOfAcidNucleic;
    private Capsid typeOfNucleoCapsid;
    
    public Virus(AcidNucleic typeOfAcidNucleic, Capsid typeOfNucleoCapsid) {
        this.typeOfAcidNucleic = typeOfAcidNucleic;
        this.typeOfNucleoCapsid = typeOfNucleoCapsid;
    }

    public AcidNucleic getTypeOfAcidNucleic() {
        return typeOfAcidNucleic;
    }

    public Capsid getTypeOfNucleoapsid() {
        return typeOfNucleoCapsid;
    }
    
    
}
