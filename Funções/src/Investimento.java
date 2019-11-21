import java.util.Scanner;
public class Investimento {
	
	private static Scanner ler;
	
	public static double investimento(double inv, int mes) {
		for(int i = 0; i< mes; i++) {
			inv += inv*0.01;
		}
		return inv;
	}
	
	public static void main (String[] args) {
		ler = new Scanner(System.in);
		double inv;
		int mes;
		System.out.println("Diga-me o quanto investiu no banco");
		inv = ler.nextDouble();
		System.out.println("Diga-me o número de meses que ficou guardado no banco");
		mes = ler.nextInt();
		System.out.printf("Até agora rendeu: %.2f" ,(investimento(inv,mes)));
		
	}

}
