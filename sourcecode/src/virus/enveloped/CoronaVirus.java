package virus.enveloped;

import java.util.ArrayList;

import virus.construct.AcidNucleic;
import virus.construct.Capsid;

public class CoronaVirus extends EnvelopedVirus {
	private String envelopeProtein;
	private String mProtein;
	
	private static String envelopeProteinImage = "/virus/enveloped/Image/corona/envelopeProtein.png";
	private static String mProteinImage = "/virus/enveloped/Image/corona/mProtein.png";

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


    public CoronaVirus(AcidNucleic typeOfAcidNucleic, Capsid typeOfNucleocapsid, Envelope envelope,
    		String envelopeProtein ,String mProtein, String structureImage, String acidNucleicImage, String caspidImage, String envelopeImage, String inputVideo) {
        super(typeOfAcidNucleic, typeOfNucleocapsid, envelope, structureImage, acidNucleicImage, caspidImage, envelopeImage, inputVideo);
        this.envelopeProtein = envelopeProtein;
        this.mProtein = mProtein;
    }

	@Override
	public ArrayList<String> getSpecialInfo() {
		// TODO Auto-generated method stub
		ArrayList<String> info = new ArrayList<String>();
		info.add(envelopeProtein);
		info.add(mProtein);
		return info;
	}

	@Override
	public ArrayList<String> getSpecialImage() {
		// TODO Auto-generated method stub
		ArrayList<String> image = new ArrayList<String>();
		image.add(envelopeProteinImage);
		image.add(mProteinImage);
		return image;
	}
    
    
}
