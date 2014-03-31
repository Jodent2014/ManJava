/*Sin el enlace dínamico tendríamos que crear un método movete para el mamífero GAto y ORTO para el mamífero RERRO */
public class Polimorfis {
/*Acá ta la mágia!!! que sorongo sabe este método a quien llamar GATO o PERRO ??*/
	public static void movete(Mamifero m) {
		/*El mamifero (p o g ) que se le pase llamará al su método */
		m.mover();// este metodo llama a mover de algúm maniJero
	}
	public static void main(String[] args) {
		
		Gato g = new Gato();
		Perro p = new Perro();
		movete(p);
		movete(g);

	}

}
