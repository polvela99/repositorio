package ej32;

public class ej32 {

	public static void main(String[] args) {
		coche primerCoche = new coche();
		primerCoche.setMarca("audi");
		primerCoche.setColor("rojo");
		primerCoche.setAño(2005);
		primerCoche.getInfo();
		coche segundoCoche = new coche();
		segundoCoche.setMarca("bmw");
		segundoCoche.setColor("azul");
		segundoCoche.setAño(2005);
		segundoCoche.getInfo();
		coche terCoche = new coche();
		terCoche.setMarca("seat");
		terCoche.setColor("white");
		terCoche.setAño(2005);
		terCoche.getInfo();
		
	}
	
}
