
public class Exercicio6 {
	public static void main(String[] args) {
		int[] A= new int[] {1, 2, 4, 3, 7, 3, 4, 2, 1, 8};
		int i=0, j=0;
		for (i=0;i<10;i++) A[i]= (int) Math.pow(2, A[i]);
		for (j=0;j<10;j++) System.out.println("2 ^"+j+" = "+A[j]);
	}
}
