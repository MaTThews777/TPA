import java.util.Random;
import java.util.Scanner;
public class Exercicio8 {
	public static void main(String[] args) {
		int[]A= new int[10];
		int[]B= new int[10];
		Random rand = new Random();Scanner in= new Scanner(System.in);
		int i=0, j=0, m , n;
		for (i=0;i<10;i++) {
			System.out.println("Digite o "+(i+1)+"° valor:");
			A[i]=in.nextInt();
		}
		for (i=0;i<10;i++) {
			for (j=9;j>=i;j--) {
				n=0;
				m=n;
				while (n<=A[j]) {
					m+=n;
					n++;
				}
				B[i]=m;
			}
		}
		for (i=0;i<10;i++) System.out.print(A[i]+"	");
		System.out.println("");
		for (i=0;i<10;i++) System.out.print(B[i]+"	");
	}
}
