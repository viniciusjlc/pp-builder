package exemplo;

import exemplo.classes.*;

public class Main {

	public static void main(String[] args) {
		Veiculo v = new Veiculo();
		Director director = new Director();

		//Carro
		v = director.montar(new CarroBuilder()); 
		//Moto
		v = director.montar(new MotoBuilder()); 
		//Bicicleta
		v = director.montar(new BicicletaBuilder()); 
	}

}
