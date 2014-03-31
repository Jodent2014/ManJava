
public class Cuerda extends Instrumento {
	
public Cuerda(){
	
}
@Override
public void afinar() {
	System.out.println("Cuerda.afinar() -> Instrumento");
}
@Override
public void tocar() {
	System.out.println("Cuerda.tocar() -> Instrumento");
}
@Override
public void tocar(String not) {
	System.out.println("Cuerda.tocar(algo) -> Instrumento: " + not);
}
}
