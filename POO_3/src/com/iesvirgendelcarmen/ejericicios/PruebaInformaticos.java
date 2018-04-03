package com.iesvirgendelcarmen.ejericicios;

import java.util.ArrayList;
import java.util.List;

public class PruebaInformaticos {

	public static void main(String[] args) {
		
		List<Informatico> listaInformaticos = new ArrayList<>();
		
		Programador programador1 = new Programador("Dapda", "php");
		programador1.setSueldoPorHoras(15);
		listaInformaticos.add(programador1);
		
		Programador programador2 = new Programador("Dapda", "python");
		programador2.setSueldoPorHoras(20);
		listaInformaticos.add(programador2);
		
		Analista analista1 = new Analista("Dapda", "Base datos");
		analista1.setSueldoPorHoras(30);
		listaInformaticos.add(analista1);
		
		Analista analista2 = new Analista("Dapda", "Base datos");
		analista2.setSueldoPorHoras(30);
		listaInformaticos.add(analista2);
			

		mostrarInformacionInformatico(listaInformaticos);
		

	}
	
	public static void mostrarInformacionInformatico
	(List<Informatico> i){
		for (Informatico informatico : i) {
			System.out.println(informatico);
			System.out.printf("Paga de %d horas: %.2f €%n",
					40, informatico.pagarSueldo(40));
			System.out.println("===========================");
		}
		
	}

}
