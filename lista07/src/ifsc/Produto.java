package ifsc;

public class Produto {

	private String Fabricante;
	private Long códBarras;

	public String getFabricante() {
		return Fabricante;
	}

	public void setFabricante(String Fabricante) {
		this.Fabricante = Fabricante;
	}

	public Long getCódBarras() {
		return códBarras;
	}

	public void setCodBarras(Long códBarras) {
		this.códBarras = códBarras;
	}
}