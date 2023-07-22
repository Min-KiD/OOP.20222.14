package virus;

import virus.construct.AcidNucleic;
import virus.construct.Capsid;
import java.util.ArrayList;

public abstract class Virus {
    private AcidNucleic typeOfAcidNucleic;
    private Capsid typeOfNucleoCapsid;
    private String structureImage;
    private String acidNucleicImage;
    private String caspidImage;
    private String envelopeImage;
    private String inputVideo;
    public Virus(AcidNucleic typeOfAcidNucleic, Capsid typeOfNucleoCapsid, String structureImage,
                 String acidNucleicImage, String caspidImage, String envelopeImage, String inputVideo) {
        this.typeOfAcidNucleic = typeOfAcidNucleic;
        this.typeOfNucleoCapsid = typeOfNucleoCapsid;
        this.structureImage = structureImage;
        this.acidNucleicImage = acidNucleicImage;
        this.caspidImage = caspidImage;
        this.envelopeImage = envelopeImage;
        this.inputVideo = inputVideo;
    }

    public AcidNucleic getTypeOfAcidNucleic() {
        return typeOfAcidNucleic;
    }

    public Capsid getTypeOfNucleoapsid() {
        return typeOfNucleoCapsid;
    }
    
    public String getacidNucleicImage()  { return acidNucleicImage; };

    public String getStructureImage()  { return structureImage; };

    public String getCaspidImage() {
        return caspidImage;
    }

    public String getEnvelopeImage() {
        return envelopeImage;
    }

    public String getInputVideo() { return inputVideo; }

    public boolean contains(String filter) {
        if (this.getClass().getName().toString().contains(filter)) {
            return true;
        }
        else { return false; }
    }
    
    public abstract ArrayList<String> getSpecialInfo();
    
    public abstract ArrayList<String> getSpecialImage();
    
}
