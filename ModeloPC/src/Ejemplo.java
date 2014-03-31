
/*public interface IAnimal {  
	  int valor=5;
	   public void comunicarse();
	}

	public class MiClase {
		public int tipo;
	}

	public class Main {
		public static void main (String[] args){
			MiClase mc = new MiClase();
			mc.tipo = -5;
		}
	}
	public abstract class Animal implements IAnimal {
		private String nombre;
	  
		public Animal (String nombre){
			this.nombre=nombre;
			System.out.println("Constructor Animal, " +
	    	"nombre del animal : "+this.nombre);
	 	}
	  
		public String getNombre(){
	  		return nombre;
		}
	 
		public abstract void tipoAnimal();
	  
		}
	public class Gato extends Animal{
		public Gato(String nombre) {
			super(nombre); //envia el parametro al constructor 							de la clase padre
			System.out.println("Constructor Gato, nombre : 			"+nombre);
	    }
	 
		public void tipoAnimal() {
			System.out.println("Tipo Animal : Es un Gato");
		}
	 
		public void comunicarse(){
			System.out.println("Metodo comunicarse : El gato 				maulla... Miau Miau");
		}
	}
	public class Perro extends Animal{
		public Perro(String nombre) {
			super(nombre);
			System.out.println("Constructor perro, nombre : ” 			+nombre);
	   }
	 
		public void tipoAnimal() {
			System.out.println("Tipo Animal : Es un Perro");
		}
	  
		public void comunicarse(){
			System.out.println("Metodo comunicarse : El perro 			Ladra... Guau Guau");
	   }  
	}
	IAnimal cat = new Gato("minino");
	cat.comunicarse();

	Animal animales[]= {new Perro("simon"),new Perro("paco"),new Gato("mimi")};
	for(Animal a : animales){
		a.tipoAnimal();
	}
	System.out.println();
*/