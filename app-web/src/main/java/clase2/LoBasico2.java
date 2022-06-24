package clase2;

public class LoBasico2 {

	public static void main(String[] args) {
		// comentario de una sola linea
		
		/*
		 * Operadores
		*/
		
		//aritmenticos
		/*
		 + - * /		  
		 */
		
		//dividir dos numero
		// a / b, b debe ser distinto de 0
		
		//enteros son sin decimales: byte,short,long
		//decimales tiene ,: float, double
		
		double a;//defino 
		a = 10;//asigno
		
		double b = 0;
		
		//syso+ctrl+space
		System.out.println( a / b );
		
		//rango de representacion de las variables numericas:
		byte _byte = 127;
		
		//relacion de variables numericas
		// byte < short < int < long < float < double
		
		//ejercicio para casa: buscar los rangos de representacion
		//de los valores numericos
		short _short = _byte;
		
		System.out.println(_short);
		
		//si quiero guardar dinero
		//de tipo float uso un f o F al final del valor.
		
		//de los numero con decimales es el double
		
		
		// byte < short < int < long < float < double
		float altura = 174.3f;
		
		//casteo hacia abajo: es poner entre () el tipo de datos que quiero
		//hay perdida de datos
		int alturaInt = (int)altura;
		
		System.out.println(altura);
		System.out.println(alturaInt);
	}

}