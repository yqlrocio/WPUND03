package tipos;

import java.util.Objects;

public class VideoJuegoRocio {
	
	private final Integer ID;
	private String nombre; 
	private Double precio;
	private final String FECHA_DE_SALIDA;
	private Integer horasJugadas;
	private Boolean completado;
	private Genero genero;
	
	public VideoJuegoRocio(Integer id, String nombre, Double precio, String fechaDeSalida, Integer horasJugadas,
			Boolean completado, Genero genero) {
		this.ID = id;
		this.nombre = nombre;
		this.precio = precio;
		this.FECHA_DE_SALIDA = fechaDeSalida;
		this.horasJugadas = horasJugadas;
		this.completado = completado;
		this.genero = genero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getHorasJugadas() {
		return horasJugadas;
	}

	public void setHorasJugadas(Integer horasJugadas) {
		this.horasJugadas = horasJugadas;
	}

	public Boolean getCompletado() {
		return completado;
	}

	public void setCompletado(Boolean completado) {
		this.completado = completado;
	}

	public Integer getID() {
		return ID;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getFECHA_DE_SALIDA() {
		return FECHA_DE_SALIDA;
	}

	public Genero getGenero() {
		return genero;
	}

	@Override
	public String toString() {
		return "ID=" + ID + ", Nombre = " + nombre + ", Precio = " + precio + ", Fecha de Salida = "
				+ FECHA_DE_SALIDA + ", Horas Jugadas = " + horasJugadas + ", ¿Completado? = " + completado + ", Genero = " + genero;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VideoJuegoRocio other = (VideoJuegoRocio) obj;
		return Objects.equals(ID, other.ID);
	}
	
}
