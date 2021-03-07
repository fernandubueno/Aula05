import java.util.Scanner;

public class ExercicioRodizio {

	public static void main(String[] args) {
		String nome, setor, transporte;
		int placa;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o nome do funcionário:");
		nome = leitor.next();
		
		System.out.println("Informe em qual setor o colaborador atua:");
		setor = leitor.next();
		
		System.out.println("Informe o meio de transporte utilizado pelo funcionário:");
		transporte = leitor.next();
		
		for(transporte == .equalsIgnoreCase("carro") {
			System.out.println("Informe o final da placa do veículo:");
			placa = leitor.nextInt();
			
			if(placa == 1||2) {
				System.out.println("Seu rodízio é na segunda-feira.");
			}else(placa == 3||4){
				System.out.println("Seu rodízio é na terça-feira.");
			}else(placa == 5||6){
				System.out.println("Seu rodízio é na quarta-feira.");
			}else(placa == 7||8){
				System.out.println("Seu rodízio é na quinta-feira.");
			}else(placa == 9||0){
				System.out.println("Seu rodízio é na sexta-feira.");
			}
		}

	}

}
