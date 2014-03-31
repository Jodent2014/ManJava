public class Gato extends Animal{

	
public Gato(String nombre) {
		super(nombre);
		System.out.println("Constructo/nombre de Gato:"+nombre );
	}
@Override
public void tipoAnimal() {
	// TODO Auto-generated method stub
	System.out.println("Tipo animal es GATO");
}

public void comunicarse() {
	System.out.println("Metodo comunicarse GAto miau miau ");
	
}

}
