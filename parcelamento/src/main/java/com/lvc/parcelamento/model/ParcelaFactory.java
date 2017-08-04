package com.lvc.parcelamento.model;

import java.util.Calendar;

public interface ParcelaFactory {
	
	public Parcela createParcela(Calendar vencimento, double valor);

}
