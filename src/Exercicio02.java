import java.util.Scanner;

public class Exercicio02 {
/*Um professor quer saber quantos alunos de uma sala de 50 tiveram nota maior do que a m�dia. Fa�a um programa onde o professor informe a m�dia e as notas de cada um dos 50 alunos e, ao final, seja exibido quantos alunos tiveram nota superior � m�dia e quantos tiveram nota inferior � m�dia.*/
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double media;
		double nota;
		int totalInferior=0, totalSuperior=0;
		
		
		System.out.println("Por favor, informe a m�dia de notas dessa turma: ");
		media = leitor.nextDouble();
		
		for(int i=0;i<50;i++) {
			System.out.println("Por favor, informe a nota do " + (i+1) + "� aluno");
			nota= leitor.nextDouble();
						
			if (nota>=media) {
				totalSuperior = totalSuperior + 1;
			}else {
				totalInferior = totalInferior + 1;
			}
						
			
		}
		
		System.out.println("Para a turma informada, um total de " + totalSuperior + " alunos obtiveram nota igual ou acima da m�dia, enquanto um total de " + totalInferior + " alunos obtiveram nota abaixo da m�dia.");
		
		leitor.close();

	}

}