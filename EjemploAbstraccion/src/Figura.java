
public abstract class Figura {
	/*con estos atributos defino la posici�n inicial de la figura.????*/ 
protected double dimx;
protected double dimy;

public Figura(double dimx, double dimy) {
	
	this.dimx = dimx;
	this.dimy = dimy;
	
}

public abstract double area();
/*SE CALCULAR� EL EREA DE LA FIGURA.?????*/
}
