import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// Receba um n�mero inteiro do usu�rio e calcule e exiba a tabuada deste n�mero
		
		int numero, resultado;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Escreva um n�mero e mostraremos a tabuada dele");
		numero = leitor.nextInt();
		
		for(int i=1; i<=10; i++) {
			resultado = numero * i;
			System.out.println(numero + " X " + i + " = " + resultado);
		}
		
		leitor.close();

	}

}
