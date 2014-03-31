
public class Test {

	public static void main(String[] args) {
		
		/* SIMIL: a es la variable de referencia que acepta valores numéricos. Puedo castear*/ 
		//int a= 2;
		Animal anp = new Perro("BOBY");
		// ahora ant es una variable tipo perro => instancio sus propiedades/
		anp.tipoAnimal();
		
		anp.comunicarse();
		System.out.println();
		
		Perro p = new Perro("FIDO");
		p.tipoAnimal();
		p.comunicarse();
		
		/*Mágia*/
		/* Creo objeto tipo animal y le paso la referencia de p "perro"*/
		Animal plmf = p;
		plmf.tipoAnimal();
		System.out.println();
		
		p=(Perro)anp;
		p.tipoAnimal();
		p.comunicarse();
		
		Animal ang = new Gato("MICHI");
ang.tipoAnimal();
		ang.comunicarse();
		System.out.println();
		
		IAnimal ig= new Gato("LOLA");
		ig.comunicarse();
		System.out.println("Constante de IAnimal: "+IAnimal.valor);
		
		Gato g = new Gato("PANCHO");
		g.tipoAnimal();
		g.comunicarse();
		System.out.println("?????");
		
		System.out.println("LA MAGIAAAAAAAAAAA!!!!");
		g=(Gato)ang;
		g.tipoAnimal();
		g.comunicarse();
		
		
	}

}
