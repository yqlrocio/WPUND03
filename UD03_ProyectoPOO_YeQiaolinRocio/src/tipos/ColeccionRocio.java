package tipos;

import java.util.ArrayList;
import java.util.List;

public class ColeccionRocio {
	
	public String jugador;
	private List <VideoJuegoRocio> juegos;
	
	// CREAR COLLECION
	public ColeccionRocio(String jugador) {
	    if (jugador == null || jugador.isBlank()) {
	        throw new IllegalArgumentException("El nombre del jugador no puede estar vacío");
	    }
	    this.jugador = jugador;
	    this.juegos = new ArrayList<>();
	}
	
	// AGREGAR VIDEOJUEGO
	public boolean agregar(VideoJuegoRocio juego) {
	    if (juego == null) {
	        return false;
	    }
	    for (VideoJuegoRocio j : this.juegos) {
	        if (j.getID().equals(juego.getID())) { 
	            return false;
	        }
	    }
	    return this.juegos.add(juego);
	}
	
	// ELIMINAR VIDEOJUEGO
	public boolean eliminarPorId(Integer id) {
		    if (id == null) {
		        return false;
		    }

		    for (VideoJuegoRocio juego : this.juegos) {
		        if (juego.getID().equals(id)) {
		            this.juegos.remove(juego);
		            return true;
		        }
		    }
		    
		    return false;
		}
	
	// BUSCAR VIDEOJUEGO POR ID
	public VideoJuegoRocio buscarPorId(Integer id) {
	    if (id == null) {
	        return null;
	    }
	    for (VideoJuegoRocio juego : this.juegos) {
	        if (juego.getID().equals(id)) {
	            return juego;
	        }
	    }

	    return null;
	}
	
	// CALCULAR LA MEDIA DE HORAS JUGADAS POR LOS JUGADORES
	public Integer calcularMediaHoras() {
		Integer suma = 0;
		Integer contador = 0;
		
		for (VideoJuegoRocio juego : juegos) {
			Integer horaJuegoActual = juego.getHorasJugadas();
			suma += horaJuegoActual;
			contador++;
		}
		
		return suma/contador;
	}
	
	
	
}
