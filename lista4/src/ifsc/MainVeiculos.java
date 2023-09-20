package ifsc;

import java.util.ArrayList;

public class MainVeiculos {


public static void main(String[] args) {

ArrayList<Veiculo> veiculos = new ArrayList<>();

Veiculo veiculo1 = new Veiculo();

veiculo1.setNumeroRodas(4);
veiculo1.setFabricante("lamborguini");
veiculo1.setCor("preto");
veiculos.add(veiculo1);
Veiculo veiculo2 = new Veiculo();
veiculo2.setNumeroRodas(8);
veiculo2.setFabricante("mercedes");
veiculo2.setCor("prateada");
veiculos.add(veiculo2);
Veiculo veiculo3 = new Veiculo();
veiculo3.setNumeroRodas(2);
veiculo3.setFabricante("yamaha");
veiculo3.setCor("rosa");
veiculos.add(veiculo3);
for (Veiculo veiculo : veiculos) {
System.out.println("Número de Rodas: " + veiculo.getNumeroRodas());
System.out.println("Fabricante: " + veiculo.getFabricante());
System.out.println("Cor: " + veiculo.getCor());
System.out.println();
}
}
}

