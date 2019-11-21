
public class Exercicio4 {
	public static void main(String[] args) {
		int[] rA= new int[] {0, 34, 17, 12, 23, 13, 56, 2, 9, 19};
		int i=0, j=0;
		for (j=0;j<10;j++) {
			System.out.println(" Todos os Pares até "+rA[j]+":");
			for (i=0;i<=rA[j];i++) {
				if(i%2==0) System.out.println(i);
			}
			System.out.println("");
		}
	}
}
