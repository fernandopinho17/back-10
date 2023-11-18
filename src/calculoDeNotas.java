import java.util.Scanner;
public class calculoDeNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler as 4 notas do aluno
        System.out.println("Informe a primeira nota:");
        double nota1 = scanner.nextDouble();

        System.out.println("Informe a segunda nota:");
        double nota2 = scanner.nextDouble();

        System.out.println("Informe a terceira nota:");
        double nota3 = scanner.nextDouble();

        System.out.println("Informe a quarta nota:");
        double nota4 = scanner.nextDouble();

        // Calcular a média das notas
        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        // Imprimir o resultado de acordo com as condições
        System.out.println("Média: " + media);

        if (media >= 7) {
            System.out.println("Aprovado!");
        } else if (media >= 5) {
            System.out.println("Em recuperação.");
        } else {
            System.out.println("Reprovado.");
        }

        // Fechar o scanner
        scanner.close();
    }
}
