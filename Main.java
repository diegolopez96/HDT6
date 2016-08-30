//Universidad del Valle de Guatemala
//Algoritmos y Estructura de Datos
//Diego López
//141222
//29-08-16



import static java.lang.System.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		//Se crean los escaners
		int opciones = 0;
		String nombre = "";
		int exp;
		String [] Programadores;
		String [] Experiencia;
		Scanner Usuario = new Scanner(System.in);
		
		
		
		//Se le pregunta al Usuario que desea utilizar
				while (opciones != 4){
					System.out.println("1. Utilizar HashTable ");
					System.out.println("2. Utilizar LinkedHashTable");
					System.out.println("3. Utilizar TreeTable");
					System.out.println("4. Salir");
					
					try {
						opciones = Usuario.nextInt();
						switch (opciones){
						case 1:
							System.out.println("Ingrese el nombre del programador");
							System.out.println("Ingrese la Experiencia del programador");
							
							break;
						case 2:
							System.out.println("Ingrese el nombre del programador");
							System.out.println("Ingrese la Experiencia del programador");
							break;
						case 3:
							System.out.println("Ingrese el nombre del programador");
							System.out.println("Ingrese la Experiencia del programador");
							break;
						case 4:
							Usuario.close();
							break;
						
						
						}
					}
					catch (Exception e) {
						Usuario.nextLine();
						
					}
				}
	}
}
					
	

	
