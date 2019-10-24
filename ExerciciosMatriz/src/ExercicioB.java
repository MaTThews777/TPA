import java.util.Scanner;
public class ExercicioB {
	public static void main(String[]args) {
		int v[][]=new int[3][3];
		int i, j, nma=0, nme=0, l=0, c=0, ml=0, mc=0;
		for(i=0; i<=2; i++) {
			for(j=0; j<=2; j++) {
				v[i][j]=(int)(Math.random()*30);
			}
		}
		for(i=0; i<=2; i++) {
			for(j=0; j<=2; j++) {
				if(i==0 && j==0) {
					 nme=v[i][j];
				}
				if(v[i][j]<nme) {
					nme=v[i][j];
					ml=i;
					mc=j;
				}
				if(v[i][j]>nma) {
					nma=v[i][j];
					l=i;
					c=j;
				}
				System.out.print("[ "+v[i][j]+" ]");
				if(j==2) {
					System.out.print("\n");
				}
			}
		}
		System.out.println(" ");
		System.out.println("O maior número foi: "+nma);
		System.out.println("Linha: "+l);
		System.out.println("Coluna: "+c);
		System.out.println("-------------------------");
		System.out.println("O menor número foi: "+nme);
		System.out.println("Linha: "+ml);
		System.out.println("Coluna: "+mc);

	}
}

