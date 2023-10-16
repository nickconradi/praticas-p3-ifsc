package ifsc;

class Smartphone extends Produto {
	private String dimensoesTela;
	private String outracaracteristica;

	public String getDimensoesTela() {
		return dimensoesTela;
	}

	public void setDimensoesTela(String dimensoesTela) {
		this.dimensoesTela = dimensoesTela;
	}

	public String getOutraCaracteristica() {
		return outracaracteristica;
	}

	public void setOutraCaracteristica(String outraCaracteristica) {
		this.outracaracteristica = outraCaracteristica;
	}
}