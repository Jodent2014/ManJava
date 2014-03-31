
public class Computadora {
protected String codigoIdentificador;
protected Gabinete gabinete;
protected Monitor monitor;
protected Teclado teclado;
protected Mouse mouse;


public void ensamblar(){
	System.out.println("ALGO");
}
public void mostrar() {
	
}

public String toString() {
return "a";	

}
public String getCodigoIdentificador() {
	return codigoIdentificador;
}
public void setCodigoIdentificador(String codigoIdentificador) {
	this.codigoIdentificador = codigoIdentificador;
}
public Gabinete getGabinete() {
	return gabinete;
}
public void setGabinete(Gabinete gabinete) {
	this.gabinete = gabinete;
}
public Monitor getMonitor() {
	return monitor;
}
public void setMonitor(Monitor monitor) {
	this.monitor = monitor;
}
public Teclado getTeclado() {
	return teclado;
}
public void setTeclado(Teclado teclado) {
	this.teclado = teclado;
}
public Mouse getMouse() {
	return mouse;
}
public void setMouse(Mouse mouse) {
	this.mouse = mouse;
}

}
