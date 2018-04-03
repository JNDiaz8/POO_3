package com.iesvirgendelcarmen.ejericicios;

import java.time.LocalDate;

public class ProfesorTitular extends Profesor {
	
	private LocalDate fechaIncorporaci�n;

	public ProfesorTitular(String nombrePersona, String dniPersona, LocalDate fechaNacimiento, String especialidad,
			LocalDate fechaIncorporaci�n) {
		super(nombrePersona, dniPersona, fechaNacimiento, especialidad);
		this.fechaIncorporaci�n = fechaIncorporaci�n;
	}

	@Override
	public String toString() {
		return "ProfesorTitular [fechaIncorporaci�n=" + fechaIncorporaci�n + ", getNombre()="
				+ getNombrePersona() + ", getDni()=" + getDniPersona() + "]";
	}

	
	
	
}
