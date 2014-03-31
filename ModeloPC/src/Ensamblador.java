
public class Ensamblador {
	static public void mensaje(Computadora d){
		d.(Monitor)mostrar();
	}
	
	public static void main(String[] args) {
	
	Computadora c = new Computadora();
	c.monitor = new Crt("MonCrt001",1200f, 120, 900f, 600f);
	c.monitor = new Lcd("MonLcd002",1200f,120,"PLANO");
	mensaje(c);
	//c.monitor.mostrar();
	//c.monitor.mostrar();
		
	}
	
}
