
public abstract class Monitor {
	
protected String codigoIdentificador;
protected float tamanioPulgads;
protected int vAlim;
public static int volMensual=600;// consumo semanal

public Monitor(String codigoIdentificador, float tamanioPulgads, int vAlim) {
	this.codigoIdentificador = codigoIdentificador;
	this.tamanioPulgads = tamanioPulgads;
	this.vAlim = vAlim;
}

public abstract void mostrar();
public abstract String toString();
public abstract void calibrar();

public void prenderApagar(){
System.out.println("===SE PRENDIO EL MONITOR: ===");
System.out.println("ID: "+this.codigoIdentificador +"SIZE: "+this.tamanioPulgads +"Volts: "+ vAlim);
System.out.println("====");
}
public int ahorroEnergia(){
	return volMensual - vAlim;
}

public String getCodigoIdentificador() {
	return codigoIdentificador;
}
public void setCodigoIdentificador(String codigoIdentificador) {
	this.codigoIdentificador = codigoIdentificador;
}
public float getTamanioPulgads() {
	return tamanioPulgads;
}
public void setTamanioPulgads(float tamanioPulgads) {
	this.tamanioPulgads = tamanioPulgads;
}
public int getvAlim() {
	return vAlim;
}
public void setvAlim(int vAlim) {
	this.vAlim = vAlim;
}

}
