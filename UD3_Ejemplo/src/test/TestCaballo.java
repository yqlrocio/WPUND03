package test;

import java.time.LocalDate;

import tipos.Caballo;
import tipos.Tipo;

public class TestCaballo {

	public static void main(String[] args) {

		LocalDate fecha = LocalDate.of(1970, 7, 11);
		
		Caballo c1 = new Caballo ("Pepe", fecha, 23.5, Tipo.DOMESTICO); 
		System.out.println(c1.getNombre());
		System.out.println(c1.getEdad());
		System.out.println(c1);
		System.out.println(c1.mostrarTodo());
		System.out.println(c1.mostrarTodoFechaOrdenada());

	}

}
