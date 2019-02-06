package singleton;

/**
 * O padr�o singleton exige que apenas uma inst�ncia da classe possa ser criada.
 * @author Fabricio Paulo
 * @version 1.0
 */
public class Singleton {
	private static int instances = 0;
	private static Singleton instance;
	
	/**
	 * Construtor privado que impede a instancia��o externa da classe.
	 */
	private Singleton() {
		instances++;
	}
	
	/**
	 * Ponto de acesso externo que instancia a classe.
	 * @return Singleton
	 */
	public static Singleton getInstance() {
		if(null == instance) {
			instance = new Singleton();
		}
		return instance;
	}
	
	/**
	 * M�todo utilizado no teste unit�rio.
	 * @return
	 */
	public static int getInstancesCount() {
		return instances;
	}
}
