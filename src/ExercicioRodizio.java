import java.util.Scanner;

public class ExercicioRodizio {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		String nome, setor;
		int meioDeTransporte, placa;
		
		for(int i=1;i<=150;i++) {
			System.out.println("Por favor, informe o nome do " + i + "� funcion�rio");
			nome = leitor.next();
			System.out.println("Por favor, informe o setor do " + i + "� funcion�rio");
			setor = leitor.next();
			
			System.out.println("Digite 1 se o funcion�rio utiliza o CARRO e 2 se o funcion�rio utiliza �NIBUS");
			meioDeTransporte = leitor.nextInt();
			
			if(meioDeTransporte == 1) {
				System.out.println("Por favor, informe o �ltimo d�gito da placa do carro do funcion�rio");
				placa = leitor.nextInt();
				
				switch(placa) {
				case 1: 
				case 2:
					System.out.println("Aten��o, " + nome + " do setor "+ setor + ", seu dia de rod�zio � segunda-feira");
					break;
				case 3:
				case 4:
					System.out.println("Aten��o, " + nome + " do setor "+ setor + ", seu dia de rod�zio � ter�a-feira");
					break;
				case 5:
				case 6:
					System.out.println("Aten��o, " + nome + " do setor "+ setor + ", seu dia de rod�zio � quarta-feira");
					break;
				case 7:
				case 8:
					System.out.println("Aten��o, " + nome + " do setor "+ setor + ", seu dia de rod�zio � quinta-feira");
					break;
				case 9:
				case 0:
					System.out.println("Aten��o, " + nome + " do setor "+ setor + ", seu dia de rod�zio � sexta-feira");
					break;
				}
			}else {
				if (meioDeTransporte ==2) {
					System.out.println("Aten��o, " + nome + " do setor "+ setor + ", o rod�zio municipal n�o se aplica ao transporte de onibus");
					
				}else {
					System.out.println("Meio de transporte inv�lido");
				}
			}
		}
		leitor.close();

	}

}