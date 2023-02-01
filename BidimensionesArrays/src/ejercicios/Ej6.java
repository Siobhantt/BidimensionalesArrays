package ejercicios;

import java.util.Arrays;

public class Ej6 {
/*Realiza un programa que rellene un array de 6 filas por 10 columnas con números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). 
 * A continuación, el programa deberá dar la posición tanto del máximo como del mínimo.*/
	public static void main(String[] args) {
		
		int tabla[][];
		tabla = new int [6][10];
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<tabla.length;i++) {
			for(int j=0;j<tabla[i].length;j++) {
				tabla[i][j]=(int)(Math.random()*1000); 
			}
		System.out.println(Arrays.toString(tabla[i]));
		}
		
		for(int i=0;i<tabla.length;i++) {
			for(int j=0;j<tabla[i].length;j++) {
				if (tabla[i][j]>max) {
					max= tabla[i][j];
				}
				if (tabla[i][j]<min) {
					min= tabla[i][j];
				}
			}
		}//Fin del for
		System.out.println("El valor maximo de la tabla es: " + max);
		System.out.println("El valor minimo de la tabla es: " + min);
	}//fin del main

}
