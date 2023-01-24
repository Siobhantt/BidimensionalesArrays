package ejercicios;

import java.util.Arrays;

public class Ej2 {
/*Crea un programa que cree una matriz de 10x10 e introduzca los valores de las tablas de multiplicar del 1 al 10 (cada tabla en una fila). 
 * Luego mostrará la matriz por pantalla*/
	public static void main(String[] args) {
		int tabla[][];
		tabla=new int[10][10];
		
		for (int i=0;i<tabla.length;i++) {
			for (int j=0;j<tabla.length;j++) {
				
				tabla[i][j]=(i+1)*(j+1);//como quiero rellenar la tabla desde la primera posicion por eso la i y la j valen 0
				//luego, cuando establezco el cuadrante a llenar le sumo 1 a la i y a la j para que el primer valor no sea 0
				
			}//fin del for dentro
			//con el syso dentro del primero for se imprime (como pretendo)
			System.out.print("Tabla del " + (i+1) + ": ");
			System.out.println(Arrays.toString(tabla[i]));
		}//fin del for
	
	}//fin del main

}
