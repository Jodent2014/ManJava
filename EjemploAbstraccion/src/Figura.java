
public abstract class Figura {
	/*con estos atributos defino la posición inicial de la figura.????*/ 
protected double dimx;
protected double dimy;

public Figura(double dimx, double dimy) {
	
	this.dimx = dimx;
	this.dimy = dimy;
	
}

public abstract double area();
/*SE CALCULARÁ EL EREA DE LA FIGURA.?????*/
}
