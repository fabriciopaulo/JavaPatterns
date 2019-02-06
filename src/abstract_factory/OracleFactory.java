package abstract_factory;

public class OracleFactory extends ConectorFactory{

	@Override
	public IConector criarConectorBancoGratuito() {
		return new MysqlConector();		
	}

	@Override
	public IConector criarConectorBancoPago() {
		return new OracleConector();
	}
	
}
