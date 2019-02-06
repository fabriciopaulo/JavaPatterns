package dependence_injection;

public class Motor implements IMotor{

	private boolean ligado;
	
	@Override
	public void ligar() {
		ligado = true;
	}
	
	/**
	 * M�todo utilizado no teste unit�rio.
	 * @return boolean
	 */
	public boolean isLigado() {
		return ligado;
	}
}
