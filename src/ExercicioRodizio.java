import java.util.Scanner;

public class ExercicioRodizio {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		String nome, setor;
		int meioDeTransporte, placa;
		
		for(int i=1;i<=150;i++) {
			System.out.println("Por favor, informe o nome do " + i + "º funcionário");
			nome = leitor.next();
			System.out.println("Por favor, informe o setor do " + i + "º funcionário");
			setor = leitor.next();
			
			System.out.println("Digite 1 se o funcionário utiliza o CARRO e 2 se o funcionário utiliza ÔNIBUS");
			meioDeTransporte = leitor.nextInt();
			
			if(meioDeTransporte == 1) {
				System.out.println("Por favor, informe o último dígito da placa do carro do funcionário");
				placa = leitor.nextInt();
				
				switch(placa) {
				case 1: 
				case 2:
					System.out.println("Atenção, " + nome + " do setor "+ setor + ", seu dia de rodízio é segunda-feira");
					break;
				case 3:
				case 4:
					System.out.println("Atenção, " + nome + " do setor "+ setor + ", seu dia de rodízio é terça-feira");
					break;
				case 5:
				case 6:
					System.out.println("Atenção, " + nome + " do setor "+ setor + ", seu dia de rodízio é quarta-feira");
					break;
				case 7:
				case 8:
					System.out.println("Atenção, " + nome + " do setor "+ setor + ", seu dia de rodízio é quinta-feira");
					break;
				case 9:
				case 0:
					System.out.println("Atenção, " + nome + " do setor "+ setor + ", seu dia de rodízio é sexta-feira");
					break;
				}
			}else {
				if (meioDeTransporte ==2) {
					System.out.println("Atenção, " + nome + " do setor "+ setor + ", o rodízio municipal não se aplica ao transporte de onibus");
					
				}else {
					System.out.println("Meio de transporte inválido");
				}
			}
		}
		leitor.close();

	}

}