/*Sin el enlace d�namico tendr�amos que crear un m�todo movete para el mam�fero GAto y ORTO para el mam�fero RERRO */
public class Polimorfis {
/*Ac� ta la m�gia!!! que sorongo sabe este m�todo a quien llamar GATO o PERRO ??*/
	public static void movete(Mamifero m) {
		/*El mamifero (p o g ) que se le pase llamar� al su m�todo */
		m.mover();// este metodo llama a mover de alg�m maniJero
	}
	public static void main(String[] args) {
		
		Gato g = new Gato();
		Perro p = new Perro();
		movete(p);
		movete(g);

	}

}
