package ifsc;

import java.util.ArrayList;

class Desktop extends Produto {
	private boolean gamer;
	private ArrayList<String> peças;

	public boolean isGamer() {
		return gamer;
	}

	public void setGamer(boolean gamer) {
		this.gamer = gamer;
	}

	public ArrayList<String> getPecas() {
		return peças;
	}

	public void setPecas(ArrayList<String> pecas) {
		this.peças = pecas;
	}
}