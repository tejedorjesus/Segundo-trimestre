package prueba;

import java.util.Scanner;
public class prueba {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	//*8. Tenemos 10 asignaturas y 10 alumnos numerados del 1 al 10 tanto las asignaturas como los
	//alumnos. Introducimos las 10 notas de los 10 alumnos (generación aleatoria de 1 a 10) y
	//pidiendo por teclado bien número de asignatura ó bien número de alumno, calcular media del
	//alumno tecleado ó media de la asignatura tecleada.//
		
		
		
		Scanner teclado = new Scanner(System.in);	

		
		int vector1[][]= new int [5][5];
		int sumasignaturas=0;
		int sumalumnos=0;
		int nalumno=0;
		int nasignatura;


		int asignaturas=0;
		int alumnos=0;
		System.out.println("-------------------------suma filas");



		for ( asignaturas = 0; asignaturas <5; asignaturas++) {
			System.out.println("alumno");
			for (alumnos = 0; alumnos <5; alumnos++) {
				vector1[asignaturas][alumnos]=(int)(Math.random()*11);
				System.out.printf("%3d", vector1[asignaturas][alumnos]);
				
			
			}
		}
	System.out.println();
				System.out.println(" vamos a ver que notitas han sacado ");
				System.out.println( " pulse el numero de la asignatura ");
				nasignatura=teclado.nextInt();
				
				
				sumasignaturas=0;
					for (asignaturas = 0; asignaturas<1; asignaturas++) {
						System.out.println();
						for ( alumnos = 0; alumnos <5; alumnos++) {
						sumasignaturas= sumasignaturas+ vector1[nasignatura-1][alumnos];
							
					}
						
				}
	
			System.out.println( " la media de las asignaturas es "+ (float)sumasignaturas/5);	
			
			System.out.println( " pulse el numero de la alumno ");
			nalumno=teclado.nextInt();
			sumalumnos=0;
			for (alumnos = 0; alumnos<1; alumnos++) {
				System.out.println();
				for ( asignaturas = 0; asignaturas <5; asignaturas++) {
				sumalumnos= sumalumnos+ vector1[asignaturas][nalumno-1];
					
			}
				
		}
			System.out.println( " la media del alumno es  "+ (float)sumalumnos/5);	

	}
	
}
		