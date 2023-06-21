package virus;

public abstract class Virus {
    private AcidNucleic typeOfAcidNucleic;
    private Capsid typeOfNucleocapsid;
    
    public Virus(AcidNucleic typeOfAcidNucleic, Capsid typeOfNucleocapsid) {
        this.typeOfAcidNucleic = typeOfAcidNucleic;
        this.typeOfNucleocapsid = typeOfNucleocapsid;
    }

    public AcidNucleic getTypeOfAcidNucleic() {
        return typeOfAcidNucleic;
    }

    public Capsid getTypeOfNucleocapsid() {
        return typeOfNucleocapsid;
    }
    
    
}
