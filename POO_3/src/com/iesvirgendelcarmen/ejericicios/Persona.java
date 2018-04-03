package com.iesvirgendelcarmen.ejericicios;

import java.time.LocalDate;

public class Persona {
	
	private String nombrePersona;
	private String dniPersona;
	private LocalDate fechaNacimiento;
	
	public Persona(String nombrePersona, String dniPersona, LocalDate fechaNacimiento) {
		this.nombrePersona = nombrePersona;
		this.dniPersona = dniPersona;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombrePersona() {
		return nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	public String getDniPersona() {
		return dniPersona;
	}

	public void setDniPersona(String dniPersona) {
		this.dniPersona = dniPersona;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Persona [nombrePersona=" + nombrePersona + ", dniPersona=" + dniPersona + ", fechaNacimiento="
				+ fechaNacimiento + "]";
	}
	
	
	
}