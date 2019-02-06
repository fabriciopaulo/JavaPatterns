package facade;

public class Freio {
	private boolean acionado;

	public boolean isAcionado() {
		return acionado;
	}

	public void acionar() {
		this.acionado = true;
	}
	
}
