package entidades;

public class Circulo implements IFigura{
	
	private double raio;

	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double radius) {
		this.raio = radius;
	}

	@Override
	public double area() {
		return Math.PI * raio * raio;
	}

}
