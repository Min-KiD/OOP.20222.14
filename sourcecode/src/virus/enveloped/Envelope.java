package virus.enveloped;

public class Envelope {
	private String envelopedVirus;
	private String glycoprotein;
    public Envelope(String envelopedVirus, String glycoprotein) {
        this.envelopedVirus = envelopedVirus;
        this.glycoprotein = glycoprotein;
    }

    public String getEnvelopedVirus() {
        return envelopedVirus;
    }
    
    public String getGlycoprotein() {
    	return glycoprotein;
    }

}
