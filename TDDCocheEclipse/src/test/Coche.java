package test;

public class Coche {

	public int velocidad;

	public void acelerar_MireyaMartinez(int aceleracion) {
		velocidad+= aceleracion;
	}

	public void decelerar_MireyaMartinez(int deceleracion) {
		velocidad-= deceleracion;
		if (velocidad<0)velocidad=0;
	}

}
