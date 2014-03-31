
public class Computadora {
private String modelo;
private String tipo;
private Modem mod;

public Computadora() {
	super();
}

public Computadora(String modelo, String tipo) {
	super();
	this.modelo = modelo;
	this.tipo = tipo;
}

public Computadora(String modelo, String tipo, Modem mod) {
	super();
	this.modelo = modelo;
	this.tipo = tipo;
	this.mod = mod;
}

public void agregarModem(Modem mo){
	this.mod=mo;
}

public Modem getMod() {
	return mod;
}

public void setMod(Modem mod) {
	this.mod = mod;
}

public String getModelo() {
	return modelo;
}

public void setModelo(String modelo) {
	this.modelo = modelo;
}

public String getTipo() {
	return tipo;
}

public void setTipo(String tipo) {
	this.tipo = tipo;
}


}
