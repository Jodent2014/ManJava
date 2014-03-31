
public class Percusion extends Instrumento{

	public Percusion() {}
	
	@Override
	public void afinar() {
		System.out.println("Percusión.afinar -> Instrumento");
	}
	@Override
	public void	tocar() {
		System.out.println("Percusion.tocar() -> Instrumento");
	}
	@Override
	public void tocar(String not) {
		System.out.println("Percusion.tocar() -> Instrumento"+ not);
	}
	
}
