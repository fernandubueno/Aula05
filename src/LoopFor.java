import java.util.Scanner;

public class LoopFor {
	public static void main(String [] args) {
		int qtdeAlunos;
		double notaAluno , mediaAlunos;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Para calcularmos a m�dia das notas dos alunos � preciso saber, primeiramente, quantos alunos est�o na turma:");
		qtdeAlunos = leitor.nextInt();
		mediaAlunos = 0;
		for(int i=0;i<qtdeAlunos;i++) {
			System.out.println("Digite a nota do " + (i+1) + "� aluno:");
			notaAluno = leitor.nextDouble();
			mediaAlunos = mediaAlunos + notaAluno;
			}
		mediaAlunos = mediaAlunos / qtdeAlunos;
		System.out.println("A m�dia de notas dos alunos dessa turma � " + mediaAlunos);
		leitor.close();
		}
	}