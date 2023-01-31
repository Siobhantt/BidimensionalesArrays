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
		int sumaTotal=0;
		int sumaFila=0;
		int sumaColumna=0;
		
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = (int) (Math.random() * (999 - 100 + 1) + 100); // formula mathrandom()*(max-min+1)+min
			}
		} // for principal
	
		
		for(int i=0;i<tabla.length;i++) {
			for(int j=0;j<tabla[i].length;j++) {
				sumaTotal+=tabla[i][j];
			}
			System.out.print(Arrays.toString(tabla[i]));
			System.out.print(sumaTotal);
			
		}//fin del for
		
		
		for(int i=0;i<tabla.length;i++) {
			for(int j=0;j<tabla[0].length;j++) {
				sumaTotal+=tabla[j][i];
			}
			
		}//fi
	}//fin del Main

}
