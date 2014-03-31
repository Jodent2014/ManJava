
public class Coneccion {
	
	public static void main (String args[]){
Computadora pc = new Computadora("NOTEBOOK","ULTA");
Modem m = new Modem("Huawey");
pc.agregarModem(m);
System.out.println("PC y MODEM:" +pc.getModelo()+" "+pc.getTipo()+" "+pc.getMod().getMarca());
	}
}
