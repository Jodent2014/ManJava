
public class Sirculo implements Figurai{
	private double radio;
	
public Sirculo(double radio) {
	this.radio = radio;
	}

	
public double arrea(){
	return Math.PI*radio*radio;
}
}
