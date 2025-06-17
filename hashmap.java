import java.util.Scanner;

public class hashmap {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int quantidadealunos;
        int quantidadenotas;

        System.out.print("Digite a quantidade de alunos: ");
        quantidadealunos = leia.nextInt();

        System.out.print("Digite a quantidade de notas por aluno: ");
        quantidadenotas = leia.nextInt();

        String[] nomes = new String[quantidadealunos];

        double[][] notas = new double[quantidadealunos][quantidadenotas];

        double[] medias = new double[quantidadealunos];

        leia.nextLine();

        for (int i = 0; i < quantidadealunos; i++) {
            System.out.print("\nDigite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = leia.nextLine();

            double soma = 0;

            for (int j = 0; j < quantidadenotas; j++) {
                System.out.print("Digite a nota " + (j + 1) + " do aluno " + nomes[i] + ": ");
                notas[i][j] = leia.nextDouble();
                soma += notas[i][j];
            }

            medias[i] = soma / quantidadenotas;

            leia.nextLine();
        }

        for (int i = 0; i < quantidadealunos; i++) {
            System.out.println("\nAluno: " + nomes[i]);
            System.out.printf("Média final: %.2f\n", medias[i]);

            if (medias[i] >= 6.0) {
                System.out.println("Resultado: Aprovado");
            } else {
                System.out.println("Resultado: Reprovado");
            }
        }

        leia.close();
    }
}
