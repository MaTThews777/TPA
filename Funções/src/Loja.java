import java.util.Scanner;
public class Loja {
	
	private static Scanner ler;
	
	public static void opções() {
		System.out.println("Opção 1: a vista com 10% de desconto");
		System.out.println("Opção 2: em duas vezes(preço da etiqueta)");
		System.out.println("Opção 3: de 3 até 10 vezes com 3% de juros ao mês(Somente para compras a cima de R$ 100,00)");
	}
	
	public static double opção1(double gasto) {
		double r = gasto - (gasto*0.1);
		return r;
	}
	
	public static double opção2(double gasto) {
		double r = gasto/2;
		return r;
	}
	
	public static double opção3(double gasto, int vezes) {
		double r = gasto/vezes;
		return r;
	}
	
	
	public static void main(String [] args) {
		ler = new Scanner(System.in);
		double gasto, juros;
		int resposta, vezes;
		System.out.println("Qual foi o seu total de gastos na loja?");
		gasto = ler.nextDouble();
		opções();
		resposta = ler.nextInt();
		if (resposta == 1) {
			System.out.println("Você terá que pagar: " +opção1(gasto));
		}	
		else if(resposta == 2){
			System.out.println("As parcelas sairão por: " +opção2(gasto));
		}
		else if (gasto > 99 && resposta == 3) {
			System.out.println("Em quantas vezes gostaria de fazer?(entre 3 e 10)");
			vezes = ler.nextInt();
			System.out.printf("As parcelas sairão por: %.2f ",(opção3(gasto,vezes)));
			juros = opção3(gasto,vezes);
			juros += opção3(gasto,vezes) * 0.03;
			System.out.printf("Com juros ficará: %.2f ",juros);
		}else {
			System.out.println("Seus gastos não atingem o necessário para a opção ou o número da opção não existe");
		}
	}

}
