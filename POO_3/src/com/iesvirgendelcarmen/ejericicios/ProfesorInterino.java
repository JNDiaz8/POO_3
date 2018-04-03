package com.iesvirgendelcarmen.ejericicios;

import java.time.LocalDate;

public class ProfesorInterino extends Profesor {
	
	private LocalDate finContrato;

	public ProfesorInterino(String nombrePersona, String dniPersona, LocalDate fechaNacimiento, String especialidad,
			LocalDate finContrato) {
		super(nombrePersona, dniPersona, fechaNacimiento, especialidad);
		this.finContrato = finContrato;
	}

	@Override
	public String toString() {
		return "ProfesorInterino [finContrato=" + finContrato + ", getNombre()=" + getNombrePersona() + "]";
	}
	
	

}
