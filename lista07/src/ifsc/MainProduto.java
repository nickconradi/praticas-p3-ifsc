package ifsc;

import java.util.ArrayList;

public class MainProduto {
	public static void main(String[] args) {
		ArrayList<Desktop> desktops = new ArrayList<>();
		ArrayList<Smartphone> smartphones = new ArrayList<>();

		Desktop desktop1 = new Desktop();
		desktop1.setFabricante("Samsung");
		desktop1.setCodBarras(1122334455L);
		desktop1.setPecas(new ArrayList<String>());
		desktop1.setGamer(true);

		Desktop desktop2 = new Desktop();
		desktop2.setFabricante("Apple");
		desktop2.setCodBarras(1234567890L);
		desktop2.setPecas(new ArrayList<String>());
		desktop2.setGamer(true);

		Desktop desktop3 = new Desktop();
		desktop3.setFabricante("LG");
		desktop3.setCodBarras(648297548L);
		desktop2.setPecas(new ArrayList<String>());
		desktop3.setGamer(false);

		desktops.add(desktop1);
		desktops.add(desktop2);
		desktops.add(desktop3);
		
		System.out.println();
		Smartphone smartphone1 = new Smartphone();
		smartphone1.setFabricante("Apple");
		smartphone1.setDimensoesTela("6.0 polegadas");
		smartphone1.setCodBarras(6655340945L);
		smartphone1.setOutraCaracteristica("Câmera de boa qualidade!");

		Smartphone smartphone2 = new Smartphone();
		smartphone2.setFabricante("Motorola");
		smartphone2.setDimensoesTela("5.8 polegadas");
		smartphone2.setCodBarras(002347555L);
		smartphone2.setOutraCaracteristica("Reconhecimento facial!");

		Smartphone smartphone3 = new Smartphone();
		smartphone3.setFabricante("Samsung");
		smartphone3.setDimensoesTela("6.5 polegadas");
		smartphone3.setCodBarras(4448778778L);
		smartphone3.setOutraCaracteristica("leitura biométrica!");

		smartphones.add(smartphone1);
		smartphones.add(smartphone2);
		smartphones.add(smartphone3);
		
		System.out.println();
		System.out.println("Desktops:");
		System.out.println();
		for (Desktop desktop : desktops) {
			System.out.println("Fabricante: " + desktop.getFabricante());
			System.out.println("Cód de Barras: " + desktop.getCódBarras());
			System.out.println("Gamer: " + desktop.isGamer());
			System.out.println("Peças: " + desktop.getPecas());
			System.out.println("Gamer: " + desktop.isGamer());
			System.out.println();
		
		}

		System.out.println("Smartphones:");
		System.out.println();
		for (Smartphone smartphone : smartphones) {
			System.out.println("Fabricante: " + smartphone.getFabricante());
			System.out.println("Dimensões Tela: " + smartphone.getDimensoesTela());
			System.out.println("Cód de Barras: " + smartphone.getCódBarras());
			System.out.println("Outra característica: " + smartphone.getOutraCaracteristica());
			System.out.println();
		}
	}
}