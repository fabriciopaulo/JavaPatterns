package facade;

public class Motor {
	private boolean ligado;

	public boolean isLigado() {
		return ligado;
	}

	public void ligar() {
		this.ligado = true;
	}
}
