package tipos;

public class Punto {

	// ATRIBUTO
	private Double x;
	private Double y;
	
	// CONSTRUCTOR POR PÁRAMETRO
	public Punto(Double x, Double y) {
		this.x = x;
		this.y = y;
	}
	
	// CONSTRUCTOR POR DEFECTO
	public Punto() {
		this.x = 0.0;
		this.y = 0.0;
	}
	public Double getX() {
		return x;
	}
	public void setX(Double x) {
		this.x = x;
	}
	public Double getY() {
		return y;
	}
	public void setY(Double y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Punto -> x=" + getX() + ", y=" + getY();
	}

	
}
