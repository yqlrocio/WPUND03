package test;

import tipos.ColeccionRocio;
import tipos.Genero;
import tipos.VideoJuegoRocio;

public class TestProyecto {

	public static void main(String[] args) {
		
		ColeccionRocio miColeccion = new ColeccionRocio ("Rocio");

		VideoJuegoRocio v1 = new VideoJuegoRocio(1, "Elden Ring", 59.00, "18/07/2019", 23, false, Genero.RPG);
		VideoJuegoRocio v2 = new VideoJuegoRocio(2, "Minecraft", 35.00, "04/02/2011", 274, true, Genero.SURVIVAL);
		VideoJuegoRocio v3 = new VideoJuegoRocio(3, "Call Of Duty", 72.50, "11/07/2016", 108, false, Genero.FPS);
		
		miColeccion.agregar(v1);
		miColeccion.agregar(v2);
		miColeccion.agregar(v3);
		
		VideoJuegoRocio videoJuegoABuscar = miColeccion.buscarPorId(3);
		
		System.out.println("La media de hora de juegos de Rocio es de: " + miColeccion.calcularMediaHoras());
		miColeccion.eliminarPorId(2);
		System.out.println("La media de hora de juegos de Rocio es de: " + miColeccion.calcularMediaHoras());
		System.out.println("El juego que buscabas es: " + videoJuegoABuscar);
		
	}

}
