package tipos;

import java.util.ArrayList;
import java.util.List;

public class ColeccionRocio {
	
	private String jugador;
	private List <VideoJuegoRocio> juegos;
	
	public ColeccionRocio(String jugador) {
	    if (jugador == null || jugador.isBlank()) {
	        throw new IllegalArgumentException("El nombre del jugador no puede estar vacío");
	    }
	    this.jugador = jugador;
	    this.juegos = new ArrayList<>();
	}
	
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
