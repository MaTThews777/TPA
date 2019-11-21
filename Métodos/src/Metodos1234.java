import java.util.Scanner;
public class Metodos1234 {
	
	private static Scanner ler;
	
	
	
	public static int fatorial(int r) {
		int n = r-1;
		int f = r;
		while(n != 0) {
			f = f * n;
			n--;
		}
		return f;
	}
	
	public static void tabuada(int n) {
		for(int i = 0; i<11; i++) {
			int r = n*i;
			System.out.println("x"+i +"=" +r);
		}
		
	}
	
	public static int aposentadoria(int sexo, int id) {
		int r = 0;
		if (sexo == 1) {
			r = 55-id;
			System.out.println("Falta " +r +" anos para se aposentar");
		}else if(sexo == 2) {
			r = 60-id;
			System.out.println("Falta " +r +" anos para se aposentar");
		}
		return r;
	}
	
	public static int potencia(int b, int ex) {
		int r = b;
		while (ex > 1 ) {
			r = r*b;
			ex--;
		}
		return r;
	}
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int escolha;
		System.out.println("Escolha entre 1/2/3/4 para fatorial/tabuada/aposentadoria/potencia respectivamente");
		escolha = ler.nextInt();
		switch(escolha) {
			case 1:{
				System.out.println("Digite o número inteiro para o fatorial");
				int fatorial = ler.nextInt();
				System.out.println(fatorial(fatorial));
				break;
			}
			case 2:{
				System.out.println("Digite um número inteiro para fazermos a tabuada");
				int inteiro = ler.nextInt();
				tabuada(inteiro);
				break;
			}
			case 3:{
				System.out.println("Digite o seu sexo(1 para Feminino, 2 para Masculino)");
				int sexo = ler.nextInt();
				System.out.println("Digite a sua idade");
				int idade = ler.nextInt();
				System.out.println(aposentadoria(sexo,idade));
				break;
			}
			case 4:{
				System.out.println("Digite a base da potenciação");
				int base = ler.nextInt();
				System.out.println("Digite o expoente da potenciação");
				int expoente = ler.nextInt();
				System.out.println(potencia(base,expoente));
				break;
			}
		}
	}

}
