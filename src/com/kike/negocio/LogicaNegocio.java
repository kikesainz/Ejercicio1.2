package com.kike.negocio;

import java.io.IOException;
import com.kike.datos.AccesoDatos;

public class LogicaNegocio {
	public double calcularImc(String nombre) throws IOException {
		double imc;
		AccesoDatos acc = new AccesoDatos();
		double peso=(acc.consultaPersona(nombre).getPeso());
		double altura=(acc.consultaPersona(nombre).getAltura());
		imc=(peso/altura)*100;
		return imc;
		
	}
}
