
public class Exercicio3 {
	public static void main(String[] args) {
		int[] rA= new int[] {2, 3, 16, 17, 19, 20, 15, 47, 9, 21};
		int i=0, j=0, t=0;
		boolean primo=false;
		for (j=0;j<10;j++) {
			t=0;
			for (i = 1; i <= rA[j]; i++) {  
			      if (rA[j] % i == 0) {  
			           t++;  
			      }  
			}
			if (t==2) {
				primo=true;
				System.out.println(rA[j]+" (é primo)");
			}
			else System.out.println(rA[j]+" (não é primo)");
		}
			 
		}
}
