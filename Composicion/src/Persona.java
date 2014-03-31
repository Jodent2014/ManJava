
public class Persona {
private String nombre;
private String apellido;
private Domicilio casa;


public Persona() {
	super();
	casa = new Domicilio();
	System.out.println("YA HAY UNA REFERENCIA A DOMICILIO");
}

public Persona(String nombre, String apellido) {
	super();
	this.nombre = nombre;
	this.apellido = apellido;
	casa = new Domicilio();
	System.out.println("YA HAY UNA REFERENCIA A DOMICILIO");
}

public Persona(String nombre, String apellido,Domicilio dom) {
	super();
	this.nombre = nombre;
	this.apellido = apellido;
	this.casa=dom;
	
}

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public Domicilio getCasa() {
	return casa;
}
public void setCasa(Domicilio casa) {
	this.casa = casa;
}



}
