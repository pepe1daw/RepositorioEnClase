package PasaPalabra;

/*
 CRISTIAN CALDERÓN PINEDA
 
 JUEGO DEL PASAPALABRAS (ACTUALIZANDOSE DURANTE EL CURSO
 CON EL NUEVO CONTENIDO QUE IREMOS DANDO)
*/

import java.util.Scanner;

public class PasaPalabras {

	private static final String PREGUNTA_1 = "1. ¿QUÉ ES EL STRING?: ";
	private static final String RESPUESTA_1 = "a";
	
	private static final String PREGUNTA_2 = "2. ¿QUÉ SE UTILIZA PARA COMPARAR EL VALOR DE UN STRING CON EL DE OTRO?: ";
	private static final String RESPUESTA_2 = "b";
	
	private static final String PREGUNTA_3 = "3. ¿?: ";
	private static final String RESPUESTA_3 = "";
	
	private static final String PREGUNTA_4 = "4. ¿?: ";
	private static final String RESPUESTA_4 = "";
	
	private static final String PREGUNTA_5 = "5. ¿?: ";
	private static final String RESPUESTA_5 = "";
	
	private static final long segundos = 1000000000;
	private static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {

		String Respuesta;
		int ACIERTOS = 0;
		int FALLOS = 0;
		int BLANCOS = 0;

		//INICIO DE LA PREGUNTA 1
			System.out.println("BIENVENIDO A PASAPALABRAS");
			System.out.println("_________________________");
			System.out.println("");
			
			System.out.println(PREGUNTA_1);
			System.out.println("a. Es una clase de variable que sirve como secuencia de caracteres.");
			System.out.println("b. Es una cuerda literalmente.");
			System.out.println("c. No existe.");
			System.out.println("d. La Respuesta c, es correcta.");
			System.out.println("e. Ninguna es correcta.");
			System.out.println("Marca tu respuesta en minúscula: ");
			Respuesta = teclado.next();
	
			if (Respuesta.equals(RESPUESTA_1)) {
				System.out.println("CORRECTO");
				ACIERTOS++;
			} else if (Respuesta.equals("")) {
				BLANCOS++;
				System.out.println("Pasa palabra");
			} else {
				System.out.println("INCORRECTO, la RESPUESTA era: "+RESPUESTA_1);
				FALLOS++;
			}
		//FINALIZACIÓN DE LA PREGUNTA 1

			
		//INICIO DE LA PREGUNTA 2
			System.out.println("_________________________");
			System.out.println("");
			System.out.println(PREGUNTA_2);
			System.out.println("a. Se usa << String1 == String2 >>.");
			System.out.println("b. Se usa << String1.equals(String2) >>.");
			System.out.println("c. Se usa << String1 = String2 >>.");
			System.out.println("d. Se usa << String1 != String2 >>.");
			System.out.println("e. No se puede hacer con String.");
			System.out.println("Marca tu respuesta en minúscula: ");
			Respuesta = teclado.next();
	
			if (Respuesta.equals(RESPUESTA_2)) {
				System.out.println("CORRECTO");
				ACIERTOS++;
			} else if (Respuesta.equals("")) {
				BLANCOS++;
				System.out.println("Pasa palabra");
			} else {
				System.out.println("INCORRECTO, la RESPUESTA era: "+RESPUESTA_2);
				FALLOS++;
			}
		//FINALIZACIÓN DE LA PREGUNTA 2

			
		//INICIO DE LA PREGUNTA 3
			System.out.println("_________________________");
			System.out.println("");
			System.out.println(PREGUNTA_3);
			System.out.println("a. ");
			System.out.println("b. ");
			System.out.println("c. ");
			System.out.println("d. ");
			System.out.println("e. ");
			System.out.println("Marca tu respuesta en minúscula: ");
			Respuesta = teclado.next();
	
			if (Respuesta.equals(RESPUESTA_3)) {
				System.out.println("CORRECTO");
				ACIERTOS++;
			} else if (Respuesta.equals("")) {
				BLANCOS++;
				System.out.println("Pasa palabra");
			} else {
				System.out.println("INCORRECTO, la RESPUESTA era: "+RESPUESTA_3);
				FALLOS++;
			}
		//FINALIZACIÓN DE LA PREGUNTA 3
		
			
		//INICIO DE LA PREGUNTA 4
			System.out.println("_________________________");
			System.out.println("");
			System.out.println(PREGUNTA_4);
			System.out.println("a. ");
			System.out.println("b. ");
			System.out.println("c. ");
			System.out.println("d. ");
			System.out.println("e. ");
			System.out.println("Marca tu respuesta en minúscula: ");
			Respuesta = teclado.next();
	
			if (Respuesta.equals(RESPUESTA_4)) {
				System.out.println("CORRECTO");
				ACIERTOS++;
			} else if (Respuesta.equals("")) {
				BLANCOS++;
				System.out.println("Pasa palabra");
			} else {
				System.out.println("INCORRECTO, la RESPUESTA era: "+RESPUESTA_4);
				FALLOS++;
			}
		//FINALIZACIÓN DE LA PREGUNTA 4
			
		
		//INICIO DE LA PREGUNTA 5
			System.out.println("_________________________");
			System.out.println("");
			System.out.println(PREGUNTA_5);
			System.out.println("a. ");
			System.out.println("b. ");
			System.out.println("c. ");
			System.out.println("d. ");
			System.out.println("e. ");
			System.out.println("Marca tu respuesta en minúscula: ");
			Respuesta = teclado.next();
	
			if (Respuesta.equals(RESPUESTA_5)) {
				System.out.println("CORRECTO");
				ACIERTOS++;
			} else if (Respuesta.equals("")) {
				BLANCOS++;
				System.out.println("Pasa palabra");
			} else {
				System.out.println("INCORRECTO, la RESPUESTA era: "+RESPUESTA_5);
				FALLOS++;
			}
		//FINALIZACIÓN DE LA PREGUNTA 5
		
		System.out.println("Has acabado todas las preguntas, FELICIDADES. Tienes un TOTAL de " + ACIERTOS
				+ " ACIERTOS, " + FALLOS + " FALLOS, y "+BLANCOS+" BLANCOS.");
	}

}
