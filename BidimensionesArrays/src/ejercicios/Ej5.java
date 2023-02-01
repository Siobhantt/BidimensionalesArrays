package ejercicios;

import java.util.Arrays;

public class Ej5 {
/*Escribe un programa que genere 20 números enteros aleatorios entre 100 y 999.
 *  Estos números se deben introducir en un array de 4 filas por 5 columnas. 
 *  El programa mostrará las sumas parciales de filas y columnas igual que si de una hoja de cálculo se tratara. 
 *  La suma total debe aparecer en la esquina inferior derecha.
*/
	public static void main(String[] args) {
		int tabla[][];
		tabla = new int[4][5];
		int total=0;
		int sumaFila=0;
		int sumaColumna=0;
		
		
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = (int) (Math.random() * (999 - 100 + 1) + 100); // formula mathrandom()*(max-min+1)+min
			}
		} // for principal
	
		
		for(int i=0;i<tabla.length;i++) {
			sumaFila=0;//se reinicia suma fila a 0
			for(int j=0;j<tabla[i].length;j++) {
				sumaFila+=tabla[i][j]; //en suma fila guardamos lo que este en el recorrido
				System.out.print(tabla[i][j]+ " "); //imprimo la tabla
			}
			total+=sumaFila;
			System.out.println(sumaFila); //imrpimo el resultado de sumaFila
		}//fin del for
		
		
		for(int i=0;i<tabla[0].length;i++) {
			sumaColumna =0;
			for(int j=0;j<tabla.length;j++) {
				sumaColumna+=tabla[j][i];
			}
			System.out.print(sumaColumna + " ");
		}//fin del for
		
		System.out.println(total);
	}//fin del Main
}
