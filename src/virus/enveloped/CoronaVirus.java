package virus.enveloped;

import virus.AcidNucleic;
import virus.Capsid;

public class CoronaVirus extends EnvelopedVirus {
	private String evenlopeProtein;
	private String mProtein;
	private String spike;
	private String hEsterase;

	public String getEvenlopeProtein() {
		return evenlopeProtein;
	}

	public String getMprotein() {
		return mProtein;
	}

	public String getSpike() {
		return spike;
	}

	public String gethEsterase() {
		return hEsterase;
	}

    public CoronaVirus(AcidNucleic typeOfAcidNucleic, Capsid typeOfNucleocapsid,Enveloped envelopeOfVirus,
    		String evenlopeProtein,String mProtein,String spike, String hEsterase) {
        super(typeOfAcidNucleic, typeOfNucleocapsid, envelopeOfVirus);
        this.evenlopeProtein = evenlopeProtein;
        this.mProtein = mProtein;
        this.spike = spike;
        this.hEsterase = hEsterase;
    }

}
