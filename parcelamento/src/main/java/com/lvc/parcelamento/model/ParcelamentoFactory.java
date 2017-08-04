package com.lvc.parcelamento.model;

import java.util.List;

public interface ParcelamentoFactory {
	
	public List<Parcela> createParcelamento(Parcelavel p);

}
