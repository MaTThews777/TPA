import java.util.Scanner;
public class ExercicioC {
	public static void main(String[]args) {
		int v[][]=new int[3][4];
		int i, j, soma=0;
		for(i=0; i<=2; i++) {
			for(j=0; j<=3; j++) {
				if(j!=3) {
					v[i][j]=(int)(Math.random()*10);
				}
			}
		}
		for(i=0; i<=2; i++) {
			soma=0;
			for(j=0; j<=3; j++) {
				soma=soma+v[i][j];
				if(j!=3) {
					System.out.print("[ "+v[i][j]+" ]");
				}
				else {
					System.out.println(" = [ "+soma+" ]");
				}
				if(j==3) {
					System.out.print("\n");
				}
			}
		}
	}
}
