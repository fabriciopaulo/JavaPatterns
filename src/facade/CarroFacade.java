package facade;

public class CarroFacade {
	
	public static boolean ligarCarro(Carro carro) {
		carro.getFreio().acionar();
		carro.getIe().iniciar();
		carro.getCambio().setMarcha(0);
		if(carro.getFreio().isAcionado() && carro.getCambio().getMarcha() == 0 && carro.getIe().isAutoTestOk()) {
			carro.getMotor().ligar();	
			return carro.getMotor().isLigado();
		}else {
			return false;
		}
	}
}
