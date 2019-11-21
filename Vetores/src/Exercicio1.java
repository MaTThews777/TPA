import java.util.Scanner;
public class Exercicio1 {
	private static Scanner ler;

	public static void main(String[] args) {
		int[] rA= new int[20];
		int[] B= new int[20];
		int i=0,j=19, t=0;
		ler = new Scanner(System.in);
		for (i=0;i<20;i++) {
			System.out.println("Digite o "+(i+1)+"° valor:");
			rA[i]= ler.nextInt();
		}
		for (i=0;i<20;i++) {
			if (rA[i]%2==0) {
				B[t]= rA[i];
				t++;
				System.out.println(rA[i]+" é par");
				System.out.println("");
			} else {
				B[j]= rA[i];
				j--;
				System.out.println(rA[i]+" é impar");
				System.out.println("");
			}
		}
	}
}


