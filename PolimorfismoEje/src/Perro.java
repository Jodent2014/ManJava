
public class Perro extends Animal{

	public Perro(String nombre){
	super(nombre);
	System.out.println("constru/nombre: "+ nombre);
	}	
	@Override
public void tipoAnimal(){
		System.out.println("Tipo animal Perro");
	
}
	// esta se instancia desde la interface e implementa exclus�vamente para Perro
public void comunicarse(){
	System.out.println("M�todo comunicarse: perro ladra GUAU GUAU");
}
}
