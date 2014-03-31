
public class Crt extends Monitor {

protected float horizontal;
protected float vertical;


public Crt(String codigoIdentificador ,float tamanioPulgads ,int vAlim ,float horizontal ,float vertical) {
	super(codigoIdentificador, tamanioPulgads, vAlim);
	this.horizontal = horizontal;
	this.vertical = vertical;
}

public void mostrar(){
	System.out.println("Monitor Crt" );
}
public String toString(){
	return " es un monitor Crt con medidas : x= " + this.horizontal+"y"+this.vertical;
}
public void calibrar(){
	System.err.println("Se calibró el Monitor Crt");
}
public void enfocar(){
System.out.println("se enfocaron: X "+this.getHorizontal()+" Y "+this.getVertical());	
}

public float getHorizontal() {
	return horizontal;
}

public void setHorizontal(float horizontal) {
	this.horizontal = horizontal;
}

public float getVertical() {
	return vertical;
}

public void setVertical(float vertical) {
	this.vertical = vertical;
}

}
