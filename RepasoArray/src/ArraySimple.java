import java.util.Arrays;
import java.util.Scanner;
public class ArraySimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int Array []= new int[4];
		int num=0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < Array.length; i++) {
			System.out.println("intro num");
			num=sc.nextInt();
			Array[i]=num;
			
			
			
			
		}
		for (int i = 0; i < Array.length; i++) {
		System.out.print(Array[i]);
		System.out.print("##");

	}
		System.out.println();
		for (int i = 0; i < Array.length; i++) {
			System.out.print(Array[i]);
			System.out.print("##");
		}
		System.out.println();
		boolean cierto;
		int v1[]={1,2,3,4,5,6,7,8,9};
		int v2[]={1,2,3,4,5,6,7,8,9};
		
		cierto=Arrays.equals(v1, v2);
		System.out.println(cierto);
		System.out.println();
		cierto=(v1== v2);
		System.out.println(cierto);
		
		
		
	}
}
