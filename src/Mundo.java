import java.util.ArrayList;
import java.util.Collection;

import processing.core.PApplet;

public class Mundo {

	private Caballo c;
	private ArrayList<Caballo> caballitos;
	private Obstaculo obs;
	private float _y, _x;

	public Mundo() {
		iniciarObjetos();
		iniciarHilo();
	}

	private void iniciarHilo() {


	}

	private void iniciarObjetos() {
		c = new Caballo(this);
		obs = new Obstaculo(this);
		caballitos = new ArrayList<Caballo>();

		for (int i = 0; i < 5; i++) {

		}
	}

	public void mostrar(PApplet app) {
		for (int j = 0; j < 11; j++) {
			c.pintar(app, 30 * j + 20);

		}
		for (int j = 0; j < 11; j++) {
			for (int i = 0; i < 4; i++) {
				obs.pintar(app, i * 30, 30 * j + 20);
			}
		}

	}

	public void key() {
		Thread capsulaCaballito = new Thread(c);
		capsulaCaballito.start();
	}

	public Obstaculo getObs() {
		return obs;
	}

	public Caballo getC() {
		return c;
	}

	public ArrayList<Caballo> getCaballitos() {
		return caballitos;
	}

}
