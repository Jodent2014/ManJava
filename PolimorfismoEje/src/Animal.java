/** Clase abstracta implementa Interface pero no está obligada a  ** 
 ** implemntar su metodo por ser esta tambien una clase abstracta **/
 
public abstract class Animal implements IAnimal {
	
	private String nombre;
	

public Animal(String nombre) {
		this.nombre = nombre;							
		System.out.println("Constructor y nombre Animal:" + this.nombre);
	}

public String getNombre() {
	return nombre;
}
public abstract void comunicarse();
/*Implementación depende de que clase extiende de Animal <-- ????*/
public abstract void tipoAnimal();

}
