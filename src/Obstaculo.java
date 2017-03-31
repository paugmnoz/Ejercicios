import processing.core.PApplet;

public class Obstaculo {
	
	private Mundo ref;
	private float x,y,r;
	
	public Obstaculo(Mundo ref) {
		this.ref = ref;
		r = (float) Math.random();
	}
	
	public void pintar(PApplet app, float _x, float _y) {
		this.x = _x;
		this.y = _y;
		app.fill(0);
		app.stroke(255);
		app.ellipse(x + r, y + 20, 20, 20);
	}

}
