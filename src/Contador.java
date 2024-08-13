import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int parametroUm = 0;
		int parametroDois = 0;
		
		System.out.print("Digite o primeiro parâmetro: ");
		parametroUm = inputExcecoes(leitor.nextLine());
		
		System.out.print("Digite o segundo parâmetro: ");
		parametroDois = inputExcecoes(leitor.nextLine());
		
		leitor.close();
		
		try {
			contar(parametroUm, parametroDois);
		}catch (ParametrosInvalidosException e){
			System.out.println(e.getMessage());
		}
	}
	
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
		if(parametroUm > parametroDois) {
			throw new ParametrosInvalidosException();
		}
		
		int contagem = parametroDois - parametroUm;
		
		for(int i = 0; i < contagem; i++) {
			System.out.println("Imprimindo o número " + (i + 1));
		}
	}
	
	static int inputExcecoes(String param) throws NumberFormatException{
		int resultado = 0;
		
		try{
			resultado = Integer.parseInt(param);
		}catch(NumberFormatException e){
			System.out.println("O valor deve ser inteiro.");
			System.exit(1);
		}
		
		return resultado;
	}
}
