package app.modele;

public class Terrain {

	private int[] tab_1d = {
			210,210,210,210,210,210,210,210,210,210,210,210,
			210,210,210,210,210,210,211,210,210,210,210,210,
			210,210,186,210,210,210,210,210,187,210,210,210,
			210,210,210,210,187,210,210,210,210,210,210,210,
			210,210,211,210,210,210,210,210,210,187,210,210,
			210,210,210,210,210,210,186,210,210,210,210,210,
			210,210,210,210,210,210,210,210,210,210,210,210,
			210,210,210,210,210,210,210,211,210,210,210,210,
			210,210,210,187,210,210,210,210,210,210,210,210,
			210,210,210,210,186,210,210,210,210,186,210,210,
			210,210,186,210,210,210,210,211,210,210,210,210,
			210,210,210,210,210,210,210,210,210,210,210,210};
	private int[][] tab_2d;


	public Terrain() {
		//p-e chargement des images
		this.tab_2d = tab1dTo2d(tab_1d); //TODO investigate
	}


	public void setTab1d(int [] newtab) {
		this.tab_1d = newtab;
	}

	public int[][] getTab2d() {
		return this.tab_2d;
	}
	
	public void setTab2d(int[][] newtab) {
		this.tab_2d = newtab;
	}

	public String imageDe(int i) {
		switch(i) {
		case 186: return "./app/img/tile_186.png";
		case 187: return "./app/img/tile_187.png";
		case 210: return "./app/img/tile_herbe.jpg";
		case 211: return "./app/img/tile_211.png";
		default: return "./app/img/tile_herbe.jpg"; // pour l'instant, on ajoute une tile verte dans le cas où il n'y a pas d'autres valeurs
		}	
	}


	public int[][] tab1dTo2d(int [] tab1d) {
		int [][] tab2d = new int[12][12];
		for (int x = 0; x< tab2d.length; x++) {
			for (int y = 0; y< tab2d[x].length; y++) {
				tab2d[x][y] = tab1d[x+12*y];
			}
		}
		return tab2d;
	}
}