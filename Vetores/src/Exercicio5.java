
public class Exercicio5 {
	public static void main(String[] args) {
		int[] A= new int [] {12, 101, 147, 232, 12, 6, 10, 45, 32, 19};
		int i=0, j=0;
		for (i=0;i<10;i++) {
			System.out.println("Todos os divisores de "+A[i]);
			for (j=1;j<=A[i];j++) {
				if (A[i]%j==0) {
					System.out.println(j);
				}
			}
			System.out.println("");
		}
	}
}
