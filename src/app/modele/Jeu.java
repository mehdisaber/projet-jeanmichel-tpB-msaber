package app.modele;

import java.util.ArrayList;

public class Jeu {

	private ArrayList<Ennemi> ennemis;
	private ArrayList<PNJ> pnjs;
	private JeanMichel jeanMichel;
	private ArrayList<Item> listeItems;

	public Jeu() {
		this.ennemis = new ArrayList<Ennemi>();
		this.pnjs = new ArrayList<PNJ>();
		this.listeItems = new ArrayList<>();
		this.jeanMichel = new JeanMichel(null, 0, 0);
		this.listeItems.add(new Coeur(20,40));
		init();
	}

	public void init() {
		//ajouter les ennemis
		//zone1
		addEnnemi(new Ennemi("testEnnemi1",50, 0, 80));
		addEnnemi(new Ennemi("testEnnemi2",50, 80, 0));

		//zone2

		//ajouter les pnjs
		//zone1
		addPNJ(new PNJArme("testPNJArme", 20, 40));
		addPNJ(new PNJItem("testPNJItem", 125, 40));
		addPNJ(new PNJVie("testPNJVie", 10, 200));
		//zone2
		addPNJ(new PNJArme("testPNJArme", 10, 200));
		addPNJ(new PNJItem("testPNJItem", 125, 40));
		addPNJ(new PNJVie("testPNJVie", 20, 40));
	}

	public void update() {
		this.ennemis.get(0).seDeplacer();

	}

	public void addEnnemi(Ennemi e) {
		this.ennemis.add(e);
	}

	public ArrayList<Ennemi> getEnnemis() {
		return this.ennemis;
	}

	public void addPNJ(PNJ p) {
		this.pnjs.add(p);
	}

	public ArrayList<PNJ> getPNJ() {
		return this.pnjs;
	}

	public JeanMichel getJeanMichel() {
		return jeanMichel;
	}
	
	public ArrayList<Item> getListeItems() {
		return listeItems;
	}


}
