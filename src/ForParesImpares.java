import java.util.Scanner;

public class ForParesImpares {
	public static void main(String [] args) {
		int qtdeAlunos,qtdePares=0,qtdeImpares=0;
		double notaAluno , mediaAlunosPares=0,mediaAlunosImpares=0;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Para calcularmos a m�dia das notas dos alunos � preciso saber, primeiramente, quantos alunos est�o na turma:");
		qtdeAlunos = leitor.nextInt();
		for(int i=0;i<qtdeAlunos;i++) {
			System.out.println("Digite a nota do " + (i+1) + "� aluno:");
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
		System.out.println("A m�dia de notas dos alunos pares dessa turma � " + mediaAlunosPares);
		System.out.println("A m�dia de notas dos alunos pares dessa turma � " + mediaAlunosImpares);
		leitor.close();
		}
	}