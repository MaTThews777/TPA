
public class Exercicio7 {
	public static void main(String[] args) {
		int[] rA= new int[15];
		int n, m, f=0;
		n= f;
		long[] B= new long[15];
		int i=0, j=0;
		for (i=0;i<15;i++) rA[i]= i;
		for (j=0;j<15;j++) {
			f= rA[j];
			n=f;
			f=1;
			while (n>1) {
				f= f*n;
				n--;
			}
			B[j]=f;
		}
		for (i=0;i<15;i++) System.out.println((i)+"! = "+B[i]);
	}
}
