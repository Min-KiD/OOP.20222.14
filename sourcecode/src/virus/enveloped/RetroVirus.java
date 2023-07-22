package virus.enveloped;

import java.util.ArrayList;

import virus.construct.AcidNucleic;
import virus.construct.Capsid;

public class RetroVirus extends EnvelopedVirus {
	private String reverse;
	private static String reverseImage = "virus/enveloped/Image/retro/reverse.png";
	
	public String getReverse() {
		return reverse;
	}

	
	public String getReverseImage() {
		return reverseImage;
	}

	public RetroVirus(AcidNucleic typeOfAcidNucleic, Capsid typeOfNucleocapsid,Envelope envelope,
    		String reverse, String structureImage, String acidNucleicImage, String capsidImage, String envelopeImage, String inputVideo) {
		super(typeOfAcidNucleic, typeOfNucleocapsid, envelope, structureImage, acidNucleicImage, capsidImage, envelopeImage, inputVideo);
		this.reverse = reverse;
	}
	
	@Override
	public ArrayList<String> getSpecialInfo() {
		// TODO Auto-generated method stub
		ArrayList<String> info = new ArrayList<String>();
		info.add(reverse);
		return info;
	}

	@Override
	public ArrayList<String> getSpecialImage() {
		// TODO Auto-generated method stub
		ArrayList<String> image = new ArrayList<String>();
		image.add(reverseImage);
		return image;
	}

}
