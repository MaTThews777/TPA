import java.util.Scanner;
public class ExercicioA {
	public static void main(String[]args) {
		int v[][]=new int[4][4];
		int i=0, j=0, dobro=2;
		for(i=0; i<=3; i++) {
			for(j=0; j<=3; j++) {
				v[i][j]=dobro;
				dobro=dobro*2;
			}
		}
		for(i=0; i<=3; i++) {
			for(j=0; j<=3; j++) {
				System.out.print("[ "+v[i][j]+" ]");
				if(j==3) {
					System.out.print("\n");
				}
			}
		}
	}
}

