
public class Viento extends Instrumento {

	public Viento() {	}
	
	@Override
	public void afinar() {
		System.out.println("Viento.afinar() -> Instrumento");
	}
	@Override
	public void tocar() {
		System.out.println("Viento.afinar() -> Instrumento");
	}
	public void tocar(String not) {
		System.out.println("Viento.tocar() -> Instrumnto" + not);
	}
}
