
public class Exercicio13 {
	public static void main(String[] args) {
		int A[]= new int[] {0, 4, 3, 2, 1, 7, 9, 6, 5, 8 };
		int B[]= new int[10];
		int i=0, j=0;
		for (i=0;i<10;i++) {
			if (A[i]%2==0) B[i]= 1;
			else B[i]=0;
		}
		for (i=0;i<10;i++) System.out.print(B[i]+" 	");
	}
}
