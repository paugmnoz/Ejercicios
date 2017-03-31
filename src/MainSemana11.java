import processing.core.PApplet;

public class MainSemana11 extends PApplet {
	
	public static void main(String[] args) {
		PApplet.main("MainSemana11");
	}
	
	private Mundo m;
	
	@Override
	public void settings() {
		size(600,600);
	}
	
	@Override
	public void setup() {
		m = new Mundo();
	}
	
	@Override
	public void draw() {
		m.mostrar(this);
	}
	
	@Override
	public void keyReleased() {
		m.key();
	}

}
