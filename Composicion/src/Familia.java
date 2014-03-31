
public class Familia {

	public static void main(String[] args) {
		/*Con esto creo objeto Persona y dentro de este creo su domicilio*/
		Persona pe=new Persona("PACO","LOPEZ");
		/*Con este objeto accedo a domicilio*/
		pe.getCasa().setCalle("MEXICO");
		pe.getCasa().setNumero(349);
		System.out.println("PERSONA: "+pe.getNombre() +" "+pe.getApellido());
		System.out.println("Domicilio: "+pe.getCasa().getCalle()+" "+pe.getCasa().getNumero());
		
		/*Probando las asociaciones fuertes */
		/*Al eliminar el objeto, tambien eliminamos la referencoa a Domicilio*/
		//pe= null;  // SI DESCOMENTO ELIMINO REFERENCIAS
		System.out.println("PErsona: " + pe.getNombre());
		System.out.println("PErsona: " + pe.getCasa().getCalle());
	}

}
