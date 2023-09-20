package lista6;

public class MainAnimal {

	public static void main(String[] args) {
		Gato gato = new Gato();

	gato.setComprimento(50f);
	gato.setCor("marrom");
	gato.setEcossistema("Doméstico");
	gato.setNome("miauhmiauh");
	gato.setNumeroDePatas(4);
	gato.setRaca("Siamês");
	
	Cachorro cachorro = new Cachorro();
	cachorro.setComprimento(40f);
	cachorro.setCor("Preto");
	cachorro.setEcossistema("Doméstico");
	cachorro.setNome("zara");
	cachorro.setNumeroDePatas(4);
	cachorro.setRaca("pinscher");
	cachorro.late();
	cachorro.caminha();
	

	System.out.println("Gato");
	System.out.println("Nome: " + gato.getNome());
	System.out.println("Comprimento: " + gato.getComprimento());
	System.out.println("Cor: " + gato.getCor());
	System.out.println("Ecossistema: " + gato.getEcossistema());
	System.out.println("Numero de patas: " + gato.getNumeroDePatas());
	System.out.println("Raça: " + gato.getRaca());
	gato.mia();
	gato.caminha();
} 
}

