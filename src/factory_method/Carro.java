package factory_method;

public class Carro extends Automovel{
	public Carro() {
		this.tipo = "Carro";
	}

	@Override
	public String getTipo() {
		return this.tipo;
	}
	
}
