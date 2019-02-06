package dependence_injection;

public class Carro {
	
	private IMotor motor;
	
	/**
	 * Injeção de dependência por interface no construtor.
	 * @param motor
	 */
	public Carro(IMotor motor) {
		this.motor = motor;
	}
	
	public boolean ligarCarro() {
		motor.ligar();
		return motor.isLigado();
	}
}
