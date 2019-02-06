package facade;

public class InjecaoEletronica {
	public boolean autoTestOk;

	public boolean isAutoTestOk() {
		return autoTestOk;
	}

	public void iniciar() {
		this.autoTestOk = true;
	}
	
}
