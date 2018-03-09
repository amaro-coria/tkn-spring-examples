package com.teknei.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.teknei.facade.TestFacade;

public class Main {

	public static void main(String args[]) {
		System.out.println("Hello world db-test");
		// Declarar mi appCtxt
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("applicationContext.xml");
		// Obtener acceso a la fachada
		TestFacade fachada = appCtx.getBean(TestFacade.class);
		// Imprimir en consola los datos de los 'valores' de la tabla
		for (String string : fachada.getValues()) {
			System.out.println("Valor obtenido: " + string);
		}
	}

}
