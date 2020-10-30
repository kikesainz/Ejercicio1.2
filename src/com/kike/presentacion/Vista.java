package com.kike.presentacion;

import java.io.IOException;
import java.util.Scanner;

import com.kike.negocio.LogicaNegocio;




public class Vista {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("introduce el nombre de la persona de la cual quieres conocer su imc" + "\n");
		String nombre = sc.next();
		LogicaNegocio n = new LogicaNegocio();
		try {
			System.out.println(" El valor del imc de la persona es: " + n.calcularImc(nombre) );
		} catch (IOException e) {
			e.printStackTrace();
		}
			sc.close();
	}

}


