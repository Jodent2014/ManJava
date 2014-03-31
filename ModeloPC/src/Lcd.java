
public class Lcd extends Monitor{
protected String tipo;

public Lcd(String codigoIdentificador, float tamanioPulgads, int vAlim, String tipo) {
	super(codigoIdentificador, tamanioPulgads, vAlim);
	this.tipo = tipo;
}
public void mostrar(){
	
}
public String toString(){
	return "a";
}
public void calibrar(){
	
}
public void revisarLampara(){
	
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}

}
