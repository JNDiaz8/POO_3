package com.iesvirgendelcarmen.teoria;

public class ProbarMetodosObject {

	public static void main(String[] args) {
		Persona persona1 = new Persona("juan", 25);
		Persona persona2 = new Persona("juanita", 25);
		System.out.println(persona1.equals(persona2) + " debe dar false");
		Persona persona3 = persona1;
		System.out.println(persona1.equals(persona3) + " debe dar true");
		persona2.setNombre("JUAN");
		System.out.println(persona1.equals(persona2) + " debe dar true");
		System.out.println(persona3.equals(persona2) + " debe dar true");
		

		try {
			Persona persona5 = (Persona) persona2.clone();
			System.out.println((persona5 == persona2) + " debe de dar false");
			System.out.println(persona5.equals(persona2) + " debe de dar true");
			persona5.setEdad(26);
			System.out.println(persona5.equals(persona2) + " debe de dar false");
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}