import java.util.Random;
public class gestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		 String nombre[]={"juan","Rafa","Raul","Jesus","Diegotriste","Lucholose","lolo"};
		 String email[]={"jjjjj@gmail.com","qqq@gmail.com","zzzzz@gmail.com","aaaaa@gmail.com","ppppp@gmail.com","hhhhh@gmail.com"};
		 String titulo[]={"fray","perico","el ocho","grey","los miserables","pijama","recetas"};
		 String genero[]={"hombre","mujer"};
		 String Autor[];
		 double precio=0;
		 int cantidad  = 0;
		 int num=0;
		 Random aleatorio=new Random();
		
		 libro[] Libros=null;
		 autor[] escritor=null;
		 
		 //public libro(String titulo,  autor, double precio, int cantidad)//
		 
		/* public autor(String nombre, String email, char genero) {*/
		 
		 
		 
		 
		 
		 num=metodos.pedirentero("cuantos libros quieres crear");
		 Libros = new libro [num];
		 escritor= new autor[num];
		 for (int i = 0; i < Libros.length; i++) {
			
			 escritor[i]=new autor(nombre[aleatorio.nextInt(nombre.length)],email[aleatorio.nextInt(email.length)]
					 ,genero[aleatorio.nextInt(genero.length)]);
			 Libros[i]=new libro(titulo[aleatorio.nextInt(titulo.length)] ,escritor[i] ,aleatorio.nextInt(31)+20,aleatorio.nextInt(31)+20);
			 
			 
		 }
		 System.out.println("-------------------------------------------------------------------------------------------------------");
		 for (int i = 0; i < Libros.length; i++) {
			
			 System.out.println(escritor[i].cadenaAutor());
			 System.out.println(Libros[i].cadenaLibro());
			 System.out.println("-------------------------------------------------------------------------------------------------------");
		 }
			 
		
			 
			 
			 
			 
			 
			 /* for (int j = 0; j < escritor.length-i; j++) {
			 escritor[j]=new autor(nombre[aleatorio.nextInt(nombre.length)],email[aleatorio.nextInt(email.length)]
					 ,genero[aleatorio.nextInt(genero.length)]);
			 System.out.println(Libros[i]);
			 System.out.println(escritor[j]);
			 System.out.println("------------------------------------------");*/
			
			 
			 
			/* for (int x=0; x < matriz.length; x++) {
				  for (int y=0; y < matriz[x].length; y++) {
				    System.out.print (matriz[x][y]);
				    if (y!=matriz[x].length-1) System.out.print("\t");
				  
		}
		 }*/
		 
	
		 
	
		 
		 
		 

		 
		 
		 
	}

}
