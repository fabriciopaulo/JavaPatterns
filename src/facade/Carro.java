package facade;

public class Carro {
	private Cambio cambio;
	private Freio freio;
	private InjecaoEletronica ie;
	private Motor motor;
	private boolean ligado;

	public Carro(Cambio cambio, Freio freio, InjecaoEletronica ie, Motor motor) {
		this.cambio = cambio;
		this.freio = freio;
		this.ie = ie;
		this.motor = motor;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public Cambio getCambio() {
		return cambio;
	}

	public Freio getFreio() {
		return freio;
	}

	public InjecaoEletronica getIe() {
		return ie;
	}

	public Motor getMotor() {
		return motor;
	}

}
