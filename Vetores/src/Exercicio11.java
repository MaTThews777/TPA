import java.util.Scanner;
public class Exercicio11 {
	public static void main(String[] args) {
		int A[]= new int[10];
		Scanner read= new Scanner (System.in);
		int i=0, j, busca, posicao=0 ;
		boolean indice=false;
		for (i=0;i<10;i++) {
			System.out.println("Digite o "+(i+1)+"° valor:");
			A[i]= read.nextInt();
		}
		System.out.println("Digite o item de busca");
		busca= read.nextInt();
		for (i=0;i<10;i++) {
			for (j=0;j<10;j++) {
				if (A[i]==busca||A[j]==busca) {
					indice=true;
				}
			}
		}
		if (indice==true) System.out.println("O item "+busca+" foi encontrado");
		else System.out.println("O item "+busca+" não foi encontrado");
	}
}
