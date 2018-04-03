package com.iesvirgendelcarmen.ejericicios;

import java.util.ArrayList;
import java.util.List;

public class ListaProfesor {
	
	private List<Profesor> Lista = new ArrayList<>();
	
	public boolean adicionalProfesor(Profesor profesor) {
		return Lista.add(profesor);
		
	}
	public List<Profesor> getLista(){
		return Lista;
	}
	

}
