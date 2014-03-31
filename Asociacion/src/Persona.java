/*Ejemplo de asociación unidericional 1 a 1. Navega en un solo sentido P --> D
 * TAMBIÉN: vida de una Objeto no depende de que se elimine o mantenga otro/s objetos/s */

public class Persona {
	private String nombre;
	private String Apellido;
	
	/*Gracias a esta variable puedo navegar y acceder dentro de su estructura  P --> D*/
	private Domicilio micasa;
	
	public Persona() {
		super();
	}
	
	public Persona(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		Apellido = apellido;
	}

	public Persona(String nombre, String apellido, Domicilio micasa) {
		super();
		this.nombre = nombre;
		Apellido = apellido;
		this.micasa = micasa;
	}
	/*Por acá puedo llegar a ver los atributos de la clase Dommicilio */
	public Domicilio getMicasa() {
		return micasa;
	}
	/* Por acá puedo llegar a escribir los atributos de Domicilio*/
	public void setMicasa(Domicilio micasa) {
		this.micasa = micasa;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	

}
