package com.iesvirgendelcarmen.ejericicios;

import java.time.LocalDate;

public class Profesor extends Persona {
	
	private String especialidad;

	public Profesor(String nombrePersona, String dniPersona, LocalDate fechaNacimiento, String especialidad) {
		super(nombrePersona, dniPersona, fechaNacimiento);
		this.especialidad = especialidad;
	}
	
	public String getEspecialidad() {
		return especialidad;
	}



	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
}

	@Override
	public String toString() {
		return "Profesor [especialidad=" + especialidad + ", getNombre()=" + getNombrePersona()
				+ ", getDni()=" + getDniPersona() + "]";
	}
	
	

}
