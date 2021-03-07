import java.util.Scanner;

public class ForParesImpares {
	public static void main(String [] args) {
		int qtdeAlunos,qtdePares=0,qtdeImpares=0;
		double notaAluno , mediaAlunosPares=0,mediaAlunosImpares=0;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Para calcularmos a média das notas dos alunos é preciso saber, primeiramente, quantos alunos estão na turma:");
		qtdeAlunos = leitor.nextInt();
		for(int i=0;i<qtdeAlunos;i++) {
			System.out.println("Digite a nota do " + (i+1) + "º aluno:");
			notaAluno = leitor.nextDouble();
			if ((i+1) % 2 == 0) {
				mediaAlunosPares = mediaAlunosPares + notaAluno;
				qtdePares++;
			}else {
				mediaAlunosImpares = mediaAlunosImpares + notaAluno;
				qtdeImpares++;
			}
		}
		mediaAlunosPares = mediaAlunosPares / qtdeImpares;
		mediaAlunosImpares = mediaAlunosImpares / qtdePares;
		System.out.println("A média de notas dos alunos pares dessa turma é " + mediaAlunosPares);
		System.out.println("A média de notas dos alunos pares dessa turma é " + mediaAlunosImpares);
		leitor.close();
		}
	}