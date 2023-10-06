package model;

import java.time.LocalDate;

import service.CtaLImite;

public class CtaMovimientos extends CtaLImite {
	
	double cantidad;
	LocalDate miFecha;
	String tipoMov;
	
	public CtaMovimientos(String codigoCta, double saldo) {
		super(codigoCta, saldo);
		// TODO Auto-generated constructor stub
	}
	
}
