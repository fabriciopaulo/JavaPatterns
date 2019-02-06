package abstract_factory;

public abstract class ConectorFactory {
	public abstract IConector criarConectorBancoGratuito();
	public abstract IConector criarConectorBancoPago();
}
