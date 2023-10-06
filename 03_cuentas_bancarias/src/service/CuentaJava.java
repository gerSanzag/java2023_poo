package service;

public class CuentaJava {
	
	private String codigoCta;
	private double saldo;
	public CuentaJava(String codigoCta, double saldo) {
		super();
		this.codigoCta = codigoCta;
		this.saldo = saldo;
	}
	public CuentaJava(String codigoCta) {
		super();
		this.codigoCta = codigoCta;
		this.saldo = 50;
	}
	public void ingresar(double cantidad) {
		
		saldo+=cantidad;
		
	}
	public void extraer(double cantidad) {
		
		saldo = cantidad;
	}
	public double getSaldo() {
		
		return saldo;
		
	}
	
	
}
