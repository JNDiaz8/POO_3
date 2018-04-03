package com.iesvirgendelcarmen.ejericicios;

import java.time.LocalDate;

public class ProfesorTitular extends Profesor {
	
	private LocalDate fechaIncorporación;

	public ProfesorTitular(String nombrePersona, String dniPersona, LocalDate fechaNacimiento, String especialidad,
			LocalDate fechaIncorporación) {
		super(nombrePersona, dniPersona, fechaNacimiento, especialidad);
		this.fechaIncorporación = fechaIncorporación;
	}

	@Override
	public String toString() {
		return "ProfesorTitular [fechaIncorporación=" + fechaIncorporación + ", getNombre()="
				+ getNombrePersona() + ", getDni()=" + getDniPersona() + "]";
	}

	
	
	
}
