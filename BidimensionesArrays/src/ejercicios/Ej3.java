package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ej3 {
	/*
	 * Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados
	 * “Alumno 1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las
	 * notas por teclado y luego el programa mostrará la tabla con las notas. A
	 * continuación, mostrará la nota mínima, máxima y media de cada alumno.
	 */
	public static void main(String[] args) {
		int min=10;
		int max=1;
		int numUser;
		int notas[][];
		int media=0;
		Scanner lee = new Scanner(System.in);
		notas = new int[4][5];

		for (int i = 0; i < notas.length; i++) {
			System.out.println("Por favor introduzca las Notas del alumno " + (i + 1));
// en este for solicito las notas
			for (int j = 0; j <= notas.length; j++) {
				numUser = lee.nextInt();//en caso de no ser validas imprimo un error
				if (numUser < 0 || numUser > 10) {
					System.err.println("Las notas deben estar entre 0 y 10");
					while (numUser<0||numUser>10) {//con este while vuelvo a solicitar las notas 
						numUser=lee.nextInt();
						notas[i][j]=numUser; //has que sean correctas y las guardo en la tabla
					}//fin del while
				} else {
					notas[i][j] = numUser;//en caso de que sean correctas se guardan
				}//fin del if
			} // for interno
		} // for principal

		for (int i = 0; i < notas.length; i++) {//aqui uso la formula que dio la profe para que salgan bien impresa la tbla
			System.out.print("Alumno " + (i + 1) + ": ");
			for (int j = 0; j < notas[i].length; j++) {
				System.out.print((notas[i][j]) + "\t");
			}
			System.out.println();
		}//fin del for
		
		for(int i=0;i<notas.length;i++) {
			for (int j=0; j<notas[i].length ;j++) {
				
			}
			media +=i;
			media = media/notas.length;
		}
		
		System.out.println("La media es " + media);
	}// fin del main
}
