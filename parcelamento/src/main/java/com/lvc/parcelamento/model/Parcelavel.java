package com.lvc.parcelamento.model;

import java.util.Calendar;

public interface Parcelavel {
	
	public int getQuantidadeDeParcelas();
	
	public Calendar getVencimento();
	
	public double getValor();

}
