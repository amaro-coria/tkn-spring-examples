package com.teknei.business.impl;

import com.teknei.business.MoneyExchange;

public class EuroExchange implements MoneyExchange{

	public Double calculateCompraVenta(Double input) {
		// TODO Auto-generated method stub
		return input * 25;
	}

	public Double calculateVentaCompra(Double input) {
		// TODO Auto-generated method stub
		return input / 30;
	}

}
