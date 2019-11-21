import java.util.ArrayList;
public class Exercicio10 {
	public static void main(String[] args) {
		int A[]= new int[] {0, 1, 2 ,3 ,4 ,5 ,6 ,7 ,8 ,9};
		int B[]= new int[] {-1,-2,-3,-4,-5,6,7,8,9, 0};
		int C[]= new int[10];
		int j=0, i=0, dif=0;
		for (i=0;i<10;i++) {
			dif=0;
			for (j=0;j<10;j++){
				if (A[i]!=B[j]) dif++;
				if (dif==10) C[i]=A[i];
			}
		}
		for (i=0;i<10;i++) {
			dif=0;
			for (j=0;j<10;j++){
				if (B[i]!=A[j]) dif++;
				if (dif==10) C[i]=B[i];
			}
		}
		for (i=0;i<10;i++) System.out.print(C[i]+" 	");
		System.out.println("");
	}
}
