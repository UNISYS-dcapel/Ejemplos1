package com.ejemplos;

public class Estatica {

	static int version = 10;
    int n�meroDeCap�tulos;
    static void a�adeUnCap�tulo() {
        //n�meroDeCap�tulos++;        // esto no funciona
        }
    static void modifica_version( int i ) {
        version+=i;                    // esto si funciona
        }
    /**
	 * @param args
	 */
	public static void main(String[] args) {
		Estatica e= new Estatica();
		e.modifica_version(1);
		e.modifica_version(1);
		e.modifica_version(1);
		e.modifica_version(1);
		System.out.println(e.version);
	}

}

