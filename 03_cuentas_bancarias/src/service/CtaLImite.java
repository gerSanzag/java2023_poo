package service;

public class CtaLImite extends CuentaJava {
	double saldo, limite;
	
	public CtaLImite(String codigoCta, double saldo) {
		super(codigoCta, saldo);
		
	}
	public void limitaCta() {
		
		limite=getSaldo()/2;
	}
	
	@Override
	public void extraer(double cantidad) {
		
		if (cantidad<=limite) {
			
			super.ingresar(cantidad);
			
		}else {
			
			super.ingresar(limite);
		}
	}
	
	
}
