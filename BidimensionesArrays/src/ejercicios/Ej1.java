package ejercicios;

import java.util.Arrays;

public class Ej1 {
/*Crea una tabla bidimensional de longitud 5x5 y rellenarla de la siguiente forma: 
 * el elemento de la posición [n][m] debe contener el valor 10 * n + m. 
 * Después se debe mostrar su contenido.*/
	public static void main(String[] args) {
		
		int tabla[][];
		tabla=new int[5][5];
		
		for(int i=0; i<tabla.length;i++) {
			for(int j=0; j<tabla.length;j++) {
				tabla[i][j]=10*i+j;
			}
			System.out.println(Arrays.toString(tabla[i]));
		}
	}//fin del main

}


