package abstract_factory;

public class MysqlConector implements IConector{

	private boolean conectado;
	
	@Override
	public void conectar() {
		conectado = true;
	}

	@Override
	public boolean isConectado() {
		return conectado;
	}

	
}
