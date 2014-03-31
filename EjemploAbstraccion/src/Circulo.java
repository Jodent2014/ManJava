/*CIRCULO EXTIENDE O ES UNA FIGURA*/
public class Circulo extends Figura {
	/*ATIBUO QUE DEFINE EL RADIO DEL CORCULO*/
private double radio;
/*Acá defino la posición inicial de la figura.circulo y su radio*/
public Circulo(double dimx, double dimy, double radio) {
	super(dimx, dimy);
	this.radio = radio;
}

/*Se calcula el area de la figura.circulo*/
@Override
public double area(){
	return Math.PI*radio*radio;
}

}
