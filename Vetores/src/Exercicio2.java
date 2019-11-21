import java.util.Scanner;
public class Exercicio2 {
	private static Scanner ler;

	public static void main(String[] args) {
		int[] A= new int[] {22, 16, 34, 28, 1};
		int i=0, j=0;
		ler = new Scanner(System.in);
		for (i=0;i<5;i++) {
			for (j=0;j<10;j++) {
				System.out.println(A[i]+" * "+(j+1)+" = "+(A[i]*(j+1)));
			}
			System.out.println("");
		}
	}
}
