package com.iesvirgendelcarmen.ejericicios;


import java.time.LocalDate;
import java.util.List;

public class TestProfesor {
	
	public static void main (String [] args) {
		
		System.out.println("Creando el objeto lista de profesores");
		
		ListaProfesor claustro = new ListaProfesor();
		
		Profesor profesor1 = new ProfesorTitular("Juan", "12345678N", LocalDate.of(1997, 8, 8), "Lengua", LocalDate.of(2018, 11 , 11));
		Profesor profesor2 = new ProfesorTitular("Pedro", "12345687N", LocalDate.of(1986, 5, 25), "Lengua", LocalDate.of(2018, 10, 1));
		Profesor profesor3 = new ProfesorTitular("Marcos", "12345768N", LocalDate.of(1973, 10, 20), "Lengua", LocalDate.of(2017, 1, 10));
		Profesor profesor4 = new ProfesorInterino("Luis", "12346578N", LocalDate.of(1968, 9, 4),  "Lengua",LocalDate.of(2017,1,1));
		System.out.println("Añadiendo profesores al claustro");
		claustro.adicionalProfesor(profesor1);
		claustro.adicionalProfesor(profesor2);
		claustro.adicionalProfesor(profesor3);
		claustro.adicionalProfesor(profesor4);
		
		System.out.println(claustro);
		System.out.println(claustro.getLista());
		
		List<Profesor> lista = claustro.getLista();
		 for (Profesor profesor : lista) {
			 System.out.println(profesor);
			 
		 }
	}
	
	

}
