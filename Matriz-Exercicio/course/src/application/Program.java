package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, m;

		System.out.print("Numero de linhas: ");
		m = sc.nextInt();//linha
		System.out.print("Numero de colunas: ");
		n = sc.nextInt();//coluna
		
		//define o tamanho da matriz
		int[][] matriz = new int[m][n];
		
		//preenche a matriz
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		//número buscado
		int num;
		System.out.print("Buscar numero: ");
		num = sc.nextInt();
		
		
		
		//verifico número buscado
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(matriz[i][j] == num) {
					
					//boolean inBounds = (matriz >=0) && (index < array.length);
					
					System.out.printf("Position: %d,%d:",i,j);
					if((j-1) >=0 && (j-1) < matriz.length) {
					System.out.println("\nLeft: " + matriz[i][j-1]);}
					if((j+1) >=0 && (j+1) < matriz.length) {
					System.out.println("Right: "+ matriz[i][j+1]);}
					if((i-1) >=0 && (i-1) < matriz.length) {
					System.out.println("Up: " + matriz[i-1][j]);}
					if((i+1) >=0 && (i+1) < matriz.length) {
					System.out.println("Down: " + matriz[i+1][j]);}
				}
			}
		}
		sc.close();
		
}
}
