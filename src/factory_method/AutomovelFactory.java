package factory_method;

public class AutomovelFactory {
	
	public Automovel criarVeiculo(int rodas) {
		if(rodas > 2) {
			return new Carro();
		}else {
			return new Moto();
		}
	}
	
}
