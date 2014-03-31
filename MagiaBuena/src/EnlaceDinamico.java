
public class EnlaceDinamico {

	public static void main(String[] args) {// iniciando proceso creo arreglo de notas
		
		/* creo e inicializo un arreglo de String con las notas musicales*/
		String nota[]= {"do","re","mi","fa","sol","la","si","do","re","fa"};
		
		/* Creo un arreglo de Instumentos para la orquesta del tipo instrumentos*/
		Instrumento InstPAorqsta[] = new Instrumento[10];
		
		/* Creo aleatoriamente cualesquiera de 3 tipos de instrumento viento, percusión, cuerda */
		for(int i=0; i<10; i++){
			InstPAorqsta[i]=generarInstrumento(new java.util.Random().nextInt(3));
	 	}/*se terminaron de crear los 10 objetos instrumentos para la orquesta*/
		
		//LUEGO -->
		/*--> Paso todos los elementos del arreglo creado previamente para ser afinados  */
		for(int i = 0;i<10;i++ ){
			afinarInstrumento(InstPAorqsta[i]);
		}/* Se terminó de pasar lo 10 instrumentos para ser afinados */
		
		//LUEGO
		/*Paso solo instrumento para la orquesta, para ser tocago*/
		for(int i =0; i<10; i++){
			tocarInstrumento(InstPAorqsta[i]);
		}
		//LUEGO
		/* paso instrumento y nota */
		for(int i =0; i<10;i++){
			tocarInstrumento(InstPAorqsta[i],nota[i]);
		}
		
}
	
	 public static Instrumento generarInstrumento(int i){
		 
		switch (i) {
		
		default:
	
		case 0:
			return new Viento();
			
		case 1:
			return new Percusion();
			
		case 2:
			return new Cuerda();

		}
		
	 }
	 /*Este método estático puede ser usado por cualquier objeto*/
	public static void afinarInstrumento(Instrumento o) {
		o.afinar();
	}
	public static void tocarInstrumento(Instrumento o) {
		o.tocar();
	}
	public static void tocarInstrumento(Instrumento o, String n) {
		o.tocar(n);
	}
}
