package com.teknei.business.impl;

import com.teknei.business.MoneyExchange;

public class DollarExchange implements MoneyExchange{

	public Double calculateCompraVenta(Double input) {
		//De dolares a pesos
		return input * 20;
	}

	public Double calculateVentaCompra(Double input) {
		// De pesos a dolares 
		return input / 22;
	}

}
