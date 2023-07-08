package virus.setup;

import java.util.ArrayList;
import java.util.List;

import virus.Virus;
import virus.construct.AcidNucleic;
import virus.construct.Capsid;
import virus.enveloped.CoronaVirus;
import virus.enveloped.Enveloped;
import virus.enveloped.Herpesvirusdae;
import virus.enveloped.RetroVirus;
import virus.nonenveloped.Adenoviridae;
import virus.nonenveloped.AstroVirus;
import virus.nonenveloped.Reoviridae;

public class Setup {
	
	public static CoronaVirus corona;
	public static Herpesvirusdae herpes;
	public static RetroVirus retro;
	public static Adenoviridae adeno;
	public static AstroVirus astro;
	public static Reoviridae reov;
	
	private static List<Virus> VirusList = new ArrayList<Virus>();
	
	public static void setup(){
		CoronaVirus corona1 = new CoronaVirus(new AcidNucleic("RNA"),
        		new Capsid("Inside the envelope, there is the nucleocapsid, "
        				+ "which is formed from multiple copies of the nucleocapsid (N) protein, "
        				+ "which are bound to the positive-sense single-stranded RNA genome in a continuous"
        				+ " beads-on-a-string type conformation. N protein is a phosphoprotein of 43 to 50 kDa in size, "
        				+ "and is divided into three conserved domains. The majority of the protein is made up of domains 1 "
        				+ "and 2, which are typically rich in arginines and lysines. Domain 3 has a short carboxy terminal "
        				+ "end and has a net negative charge due to excess of acidic over basic amino acid residues"),
        		new Enveloped("The viral envelope is made up of a lipid bilayer in which the membrane (M), "
        				+ "envelope (E) and spike (S) structural proteins are anchored. The molar ratio of E:S:M "
        				+ "in the lipid bilayer is approximately 1:20:300. The E and M protein are the structural proteins"
        				+ " that combined with the lipid bilayer to shape the viral envelope and maintain its size. "
        				+ "S proteins are needed for interaction with the host cells. But human coronavirus NL63 "
        				+ "is peculiar in that its M protein has the binding site for the host cell, and not its S protein."
        				+ " The diameter of the envelope is 85 nm. The envelope of the virus in electron micrographs appears"
        				+ " as a distinct pair of electron-dense shells (shells that are relatively opaque to"
        				+ " the electron beam used to scan the virus particle)"),
        		"The E proteins are minor structural proteins and highly variable in different species. "
        		+ "There are only about 20 copies of the E protein molecule in a coronavirus particle. "
        		+ "They are 8.4 to 12 kDa in size and are composed of 76 to 109 amino acids. "
        		+ "They are integral proteins (i.e. embedded in the lipid layer) and have two domains "
        		+ "namely a transmembrane domain and an extramembrane C-terminal domain. "
        		+ "They are almost fully α-helical, with a single α-helical transmembrane domain,"
        		+ " and form pentameric (five-molecular) ion channels in the lipid bilayer. "
        		+ "They are responsible for virion assembly, intracellular trafficking and morphogenesis (budding)",
        		"The M protein is the main structural protein of the envelope that provides the overall shape and"
        		+ " is a type III membrane protein. It consists of 218 to 263 Amino acid residues and"
        		+ " forms a layer 7.8 nm thick. It has three domains, a short N-terminal ectodomain,"
        		+ " a triple-spanning transmembrane domain, and a C-terminal endodomain. "
        		+ "The C-terminal domain forms a matrix-like lattice that adds to the extra-thickness of the envelope."
        		+ " Different species can have either N- or O-linked glycans in their protein amino-terminal domain."
        		+ " The M protein is crucial during the assembly, budding, envelope formation,"
        		+ " and pathogenesis stages of the virus lifecycle",
        		"The spikes are the most distinguishing feature of coronaviruses and"
        		+ " are responsible for the corona- or halo-like surface. "
        		+ "On average a coronavirus particle has 74 surface spikes. "
        		+ "Each spike is about 20 nm long and is composed of a trimer of the S protein. "
        		+ "The S protein is in turn composed of an S1 and S2 subunit. "
        		+ "The homotrimeric S protein is a class I fusion protein which mediates the receptor binding"
        		+ " and membrane fusion between the virus and host cell. The S1 subunit forms the head of the spike"
        		+ " and has the receptor-binding domain (RBD). The S2 subunit forms the stem which anchors the spike"
        		+ " in the viral envelope and on protease activation enables fusion. "
        		+ "The two subunits remain noncovalently linked as they are exposed on the viral surface until"
        		+ " they attach to the host cell membrane.[45] In a functionally active state,"
        		+ " three S1 are attached to two S2 subunits. The subunit complex is split into individual subunits"
        		+ " when the virus binds and fuses with the host cell under the action of proteases"
        		+ " such as cathepsin family and transmembrane protease serine 2 (TMPRSS2) of the host cell",
        		"A subset of coronaviruses (specifically the members of betacoronavirus subgroup A)"
        		+ " also has a shorter spike-like surface protein called hemagglutinin esterase (HE)."
        		+ " The HE proteins occur as homodimers composed of about 400 amino acid residues"
        		+ " and are 40 to 50 kDa in size. They appear as tiny surface projections of 5 to 7 nm long"
        		+ " embedded in between the spikes. They help in the attachment to and detachment from the host cell");
		
		RetroVirus retro1 = new RetroVirus(new AcidNucleic("RNA, DNA"),
				new Capsid("Protein caspid are Group-specific antigen (gag) proteins. "
						+ "gag are about 2000–4000 copies per virion. Gag possesses two nucleic acid binding domains,"
						+ " including matrix (MA) and nucleocapsid (NC). Specifically recognizing, binding,"
						+ " and packaging the retroviral genomic RNA into assembling virions is one of"
						+ " the important functions of Gag protein. Gag interactions with cellular RNAs"
						+ " also regulate aspects of assembly. The expression of gag alone gives"
						+ " rise to assembly of immature virus-like particles that bud from the plasma membrane."
						+ " In all retroviruses the Gag protein is the precursor to the internal structural protein"),
				new Enveloped("Composed of lipids (obtained from the host plasma membrane during the budding process)"
				+ " as well as glycoprotein encoded by the env gene. The retroviral envelope serves "
				+ "three distinct functions: protection from the extracellular environment via the lipid bilayer,"
				+ " enabling the retrovirus to enter/exit host cells through endosomal membrane trafficking,"
				+ " and the ability to directly enter cells by fusing with their membranes"),
				"Play a role in association and entry of virions into the host cell."
				+ " Possessing a functional copy of an env gene is what makes retroviruses distinct from retroelements."
				+ " The ability of the retrovirus to bind to its target host cell using specific cell-surface receptors"
				+ " is given by the surface component (SU) of the Env protein, while the ability of the retrovirus"
				+ " to enter the cell via membrane fusion is imparted by the membrane-anchored trans-membrane component (TM)"
				+ ". Thus it is the Env protein that enables the retrovirus to be infectious",
				"Reverse transcriptase is the catalyst for reverse transcription between RNA and DNA",
				"Consists of a dimer RNA. It has a cap at the 5' end and a poly(A) tail at the 3' end."
				+ " Genomic RNA (gRNA) is produced as a result of host RNA polymerase II (Pol II) activity"
				+ " and by adding a 5' methyl cap and a 3' poly-A tail is processed as a host mRNA. "
				+ "The RNA genome also has terminal noncoding regions, which are important in replication, "
				+ "and internal regions that encode virion proteins for gene expression. The 5' end "
				+ "includes four regions, which are R, U5, PBS, and L. The R region is a short repeated"
				+ " sequence at each end of the genome used during the reverse transcription to ensure"
				+ " correct end-to-end transfer in the growing chain");
		
		Herpesvirusdae herpes1 = new Herpesvirusdae(new AcidNucleic("DNA"),
				new Capsid("A relatively large, monopartite, double-stranded, linear DNA genome encoding 100-200"
						+ " genes encased within an icosahedral protein cage (with T=16 symmetry), "
						+ "an icosahedral protein cage is capsid"),
				new Enveloped("Is a lipid bilayer membrane"),
				"Caspid is itself wrapped in a protein layer called the tegument containing both"
				+ " viral proteins and viral mRNAs and a lipid bilayer membrane. "
				+ "Tegument is around the double-stranded DNA genome into an icosahedral nucleocapsid. "
				+ "Tegument contains filaments, each 7 nm wide. It is an amorphous layer with some structured regions. "
				+ "Tegument contains 26 proteins",
				"a relatively large, monopartite, double-stranded, linear DNA genome encoding 100-200 genes,"
				+ " the double-stranded DNA",
				"Glycoproteins are proteins that have carbohydrates attached to them, and they are found on the surface of herpesviruses."
				+ " These glycoproteins serve multiple functions during the virus's life cycle, including viral attachment to host cells,"
				+ " fusion of the viral envelope with the host cell membrane, and evasion of the host immune response");
		
		AstroVirus astro1 = new AstroVirus(new AcidNucleic("RNA"),
				new Capsid("Cubic capsids. The human astrovirus capsid spikes have a distinct structure."
						+ " The spike domain in particular has a 3-layered beta-sandwiches fold and a core, "
						+ "6-stranded beta-barrel structure. The beta-barrel has a hydrophobic core. "
						+ "The triple-layered beta-sandwich is packed outside the beta-barrel. "
						+ "The spike also forms a dimer. This unique structure was found to be similar to"
						+ " the protein projections found on the capsid of the hepatitis E virus. "
						+ "The projection domain of the human astrovirus contains a receptor binding site for"
						+ " polysaccharides. The amino acid sequence of the astrovirus capsid protein"
						+ " does not have similar homology to other known viral proteins, but the closest"
						+ " would be hepatitis E virus"),
				"non-enveloped RNA viruses. Astrovirus has a non-segmented, single stranded,"
				+ " positive sense RNA genome within a non-enveloped icosahedral capsid");
		
		Reoviridae reov1 = new Reoviridae(new AcidNucleic("RNA (double-stranded RNA)"),
				new Capsid("An icosahedral capsid composed of an outer (T=13) and inner (T=2) protein shell. "
						+ "Ultrastructure studies show that virion capsids are composed of two or three "
						+ "separate layers which depends on species type"),
				"The innermost layer (core) has T=1 icosahedral symmetry and is composed of"
				+ " 60 different types of structural proteins. The core contains the genome segments,"
				+ " each of them encode a variety enzyme structure which is required for transcription."
				+ " The core is covered by capsid layer T=13 icosahedral symmetry. "
				+ "Reoviruses have a unique structure which is contains a glycolisated spike protein on the surface",
				"The outer capsid has icosahedral symmetry and is composed of between 92 and 180 hexagonal"
				+ " and pentagonal subunits (capsomers). The outer capsid is composed of four proteins:"
				+ " sigma-1, sigma-3, lambda-2, and mu-1");
		
		Adenoviridae adeno1 = new Adenoviridae(new AcidNucleic("DNA"),
				new Capsid("an icosahedral capsid"), 
				"Double-stranded DNA .The adenovirus genome is linear, non-segmented double-stranded DNA "
				+ "that is between 26 and 48 Kbp.[2] This allows the virus to theoretically carry 22 to 40 genes."
				+ " Although this is significantly larger than other viruses in its Baltimore group, "
				+ "it is still a very simple virus and is heavily reliant on the host cell for survival and replication."
				+ " An interesting feature of this viral genome is that it has a terminal 55 kDa protein"
				+ " associated with each of the 5' ends of the linear dsDNA. These are used as primers"
				+ " in viral replication and ensure that the ends of the virus' linear genome are adequately replicated",
				"240 hexon proteins make up the bulk of the capsid",
				"12 penton bases cap the icosahedron's corners",
				"The penton bases are associated with protruding fibers that aid in attachment"
				+ " to the host cell via the receptor on its surface");
		
		corona = corona1;
		herpes = herpes1;
		retro = retro1;
		adeno = adeno1;
		astro = astro1;
		reov = reov1;
	}
	
	public static List<Virus> getVirusList() {
		VirusList.add(corona);
        VirusList.add(herpes);
        VirusList.add(retro);
        VirusList.add(adeno);
        VirusList.add(astro);
        VirusList.add(reov);
		return VirusList;
	}

}
