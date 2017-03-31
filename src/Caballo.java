import processing.core.PApplet;

public class Caballo implements Runnable {

	private Mundo ref;
	private float x, y;
	private float vel;
	private boolean go;

	public Caballo(Mundo ref) {
		this.ref = ref;
		this.go = true;
		
	}



	public void pintar(PApplet app, float _y) {
		this.y = _y;
		app.fill(255);
		app.ellipse(x, y + 20, 30, 17);

	}
	
	@Override
	public void run() {
		while (go) {
			mover();
			try {
				Thread.sleep(33);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void mover() {
		if (x < 580) {
			x += 10;
		} else if (x >= 580) {
			x = x;
		}
	}

}
