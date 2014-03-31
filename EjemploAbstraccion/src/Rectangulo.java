
public class Rectangulo extends Figura{

	protected double lado;
	
	public Rectangulo(double dimx, double dimy, double lado) {
		super(dimx, dimy);
		this.lado = lado;
	}

	
	@Override
	public double area(){
		return lado*lado;
	}
}
