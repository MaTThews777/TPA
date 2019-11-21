import java.util.Scanner;
public class Exercicio15 {
	public static void main(String[] args) {
		int A[]= new int[10];
		int B[]= new int[10];
		int C[]= new int[10];
		int i=0, j=0, indice;
		Scanner in= new Scanner (System.in);
		for (i=0;i<10;i++) {
			System.out.println("Digite o "+(i+1)+"° valor:");
			A[i]= in.nextInt();
		}
		
		for (i=0;i<10;i++) {
			indice=0;
			for(j=0;j<10;j++) {
				if (A[i]>A[j]) indice++;
			}
			B[indice]= A[i];
		}
		for (i=0;i<10;i++) {
			indice=0;
			for(j=0;j<10;j++) {
				if (A[i]<A[j]) indice++;
			}
			C[indice]= A[i];
		}
		for (i=0;i<10;i++) System.out.print(C[i]+" 	");
	}
}
