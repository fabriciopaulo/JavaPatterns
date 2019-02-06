package factory_method;

public class Moto extends Automovel{

	public Moto() {
		this.tipo = "Motocicleta";
	}

	@Override
	public String getTipo() {
		return this.tipo;
	}
	
}
