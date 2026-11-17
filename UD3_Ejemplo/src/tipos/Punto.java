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
//	public Punto() {
//		this.x = 0.0;
//		this.y = 0.0;
//	}
	public Punto() {
		this(0.0, 0.0);
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
		return "Punto -> x=" + this.getX() + ", y=" + this.getY();
	}

	public Double distanciaA(Punto p) {
		Double catX = this.getX() - p.getX();
		Double catY = this.getY() - p.getY();
		return Math.sqrt(catX * catX + catY * catY); 
	}
}
