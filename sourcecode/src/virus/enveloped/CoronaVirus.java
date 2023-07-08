package virus.enveloped;

import virus.construct.AcidNucleic;
import virus.construct.Capsid;

public class CoronaVirus extends EnvelopedVirus {
	private String envelopeProtein;
	private String mProtein;
	private String spike;
	private String hEsterase;

	public String getEnvelopeProtein() {
		return envelopeProtein;
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
    		String envelopeProtein,String mProtein,String spike, String hEsterase) {
        super(typeOfAcidNucleic, typeOfNucleocapsid, envelopeOfVirus);
        this.envelopeProtein = envelopeProtein;
        this.mProtein = mProtein;
        this.spike = spike;
        this.hEsterase = hEsterase;
    }

}
