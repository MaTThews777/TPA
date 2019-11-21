import java.util.Scanner;
public class Exercicio12 {
	public static void main(String[] args) {
		int C=0, i, j=0;
			int A[]= new int[] {0, 1, 7, 3, 4, 4, 3, 2, 1, 0};
			int B[]= new int[10];
			int x, y;
			Scanner in= new Scanner(System.in);
			for (i=0;i<10;i++) {
				System.out.println("Digite o "+(i+1)+"° valor:");
				A[i]=in.nextInt();
			}
			x= 0;
			y= 9;
			for (i=0; i<10; i++) {
				if (A[x]==A[y]) {
					B[i]=A[x];
					j++;
					System.out.print(B[i]+" 	");
				}
				x++;
				y--;
			}
			if (j==0) System.out.println("esse vetor não é palíndromo");
	}
}
