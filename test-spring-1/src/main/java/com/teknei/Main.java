package com.teknei;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.teknei.business.MoneyExchange;
import com.teknei.business.impl.DollarExchange;
import com.teknei.business.impl.EuroExchange;

public class Main {

	public static void main(String args[]) {
		System.out.println("Hello world!");
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("Calculadora de divisas");
		// TODO obtener tipo de conversion y cuanto quieres convertir
		// 1 = dolar a pesos 2 = euros a pesos
		// 100 como entrada
		int type = 1; // obtenerlo desde entrada estandar, desde archivo properties, etc..
		double cantidad = 100; // mismo caso que linea de arriba, obtener desde afuera
		MoneyExchange conversor;
		switch (type) {
		case 1:
			conversor = (MoneyExchange) appCtx.getBean("dollarExchange");
			break;
		case 2:
			conversor = (MoneyExchange) appCtx.getBean("euroExchange");
			break;
		default:
			conversor = (MoneyExchange) appCtx.getBean("dollarExchange");
			break;
		}
		System.out.println("Convirtiendo entrada: " + cantidad);
		System.out.println("Cantidad obtenida a compra: " + conversor.calculateCompraVenta(cantidad)
				+ " - Cantidad obtenida a venta: " + conversor.calculateVentaCompra(cantidad));
	}

}
