package dependence_injection;

public class Motor implements IMotor{

	private boolean ligado;
	
	@Override
	public void ligar() {
		ligado = true;
	}
	
	/**
	 * Método utilizado no teste unitário.
	 * @return boolean
	 */
	public boolean isLigado() {
		return ligado;
	}
}
