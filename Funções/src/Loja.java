import java.util.Scanner;
public class Loja {
	
	private static Scanner ler;
	
	public static void op��es() {
		System.out.println("Op��o 1: a vista com 10% de desconto");
		System.out.println("Op��o 2: em duas vezes(pre�o da etiqueta)");
		System.out.println("Op��o 3: de 3 at� 10 vezes com 3% de juros ao m�s(Somente para compras a cima de R$ 100,00)");
	}
	
	public static double op��o1(double gasto) {
		double r = gasto - (gasto*0.1);
		return r;
	}
	
	public static double op��o2(double gasto) {
		double r = gasto/2;
		return r;
	}
	
	public static double op��o3(double gasto, int vezes) {
		double r = gasto/vezes;
		return r;
	}
	
	
	public static void main(String [] args) {
		ler = new Scanner(System.in);
		double gasto, juros;
		int resposta, vezes;
		System.out.println("Qual foi o seu total de gastos na loja?");
		gasto = ler.nextDouble();
		op��es();
		resposta = ler.nextInt();
		if (resposta == 1) {
			System.out.println("Voc� ter� que pagar: " +op��o1(gasto));
		}	
		else if(resposta == 2){
			System.out.println("As parcelas sair�o por: " +op��o2(gasto));
		}
		else if (gasto > 99 && resposta == 3) {
			System.out.println("Em quantas vezes gostaria de fazer?(entre 3 e 10)");
			vezes = ler.nextInt();
			System.out.printf("As parcelas sair�o por: %.2f ",(op��o3(gasto,vezes)));
			juros = op��o3(gasto,vezes);
			juros += op��o3(gasto,vezes) * 0.03;
			System.out.printf("Com juros ficar�: %.2f ",juros);
		}else {
			System.out.println("Seus gastos n�o atingem o necess�rio para a op��o ou o n�mero da op��o n�o existe");
		}
	}

}
