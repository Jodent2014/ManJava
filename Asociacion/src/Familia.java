
public class Familia {

	public static void main(String[] args) {
		Persona pa = new Persona("JOSE","RUIZ");
		Domicilio casa = new Domicilio();
		casa.setCalle("MEndoza");
		casa.setNumero(324);
		pa.setMicasa(casa);
		
		System.out.println("DATOS DE PERSONA :" + pa.getNombre() +" "+pa.getApellido());
		System.out.println("DOMICILIO :" + pa.getMicasa().getCalle() +" "+ pa.getMicasa().getNumero());
		
		//****SE DEMUESTA LA INDEPENDENCIA DE LAS OBJETOS, SI ELIMINO UN OBJETO EL OTRO SIGUE EXISTIENDO ****//
		/*Elimino la referencia a memoria que tenía de per1 y la cambio a que apunte a null*/
		// <- QUITAR!!    pa=null;                        /* Perdemos todos los datos de per1, luego los elimina de memoria el harbashColector*/
		System.out.println("Persona BYE !!!" + pa.getNombre());
		//**********************************************************************************************//
		System.out.println("DOMICILIO: "+ casa.getCalle());
		
	}

}
