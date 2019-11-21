
public class Exercicio14 {
	public static void main(String[] args) {
		int A[]= new int[] {0, 12, 23, 13, 87, 34, 3, 6, 7, 0};
		int B[]= new int[] {18, 54, 23, 76, 12, 23, 25, 67, 12, 6};
		int C[]= new int[10];
		int i=0, j=0;
		for (i=0;i<10;i++) {
			if (A[i]>B[i]) C[i]=1;
			if (A[i]==B[i]) C[i]=0;
			if (A[i]<B[i]) C[i]=-1;
		}
		for (i=0;i<10;i++) System.out.print(C[i]+" 	");
	}
}
