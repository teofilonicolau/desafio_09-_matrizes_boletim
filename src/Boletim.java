import java.util.Scanner;

public class Boletim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lista de alunos
        String[] alunos = {"Ana", "Leo", "Mia", "Ben", "Kai", "Eva", "Lia", "Sam", "Zoe"};

        // Matriz de notas
        int[][] notas = new int[9][2];

        System.out.println("Informe as  duas notas de cada aluno:");

        // Receber as notas
        for (int i = 0; i < notas.length; i++) {
            System.out.print(alunos[i] + " ");
            System.out.println("Primeira nota :");
            notas[i][0] = scanner.nextInt(); // Primeira nota
            System.out.println("Segunda nota :");
            notas[i][1] = scanner.nextInt(); // Segunda nota
        }

        // Calcular a média e imprimir o boletim
        imprimirBoletim(alunos, calcularMedias(notas));
    }

    private static int[][] calcularMedias(int[][] notas) {
        int[][] medias = new int[notas.length][1]; // Array para armazenar as médias

        for (int i = 0; i < notas.length; i++) {
            // Calcular a média das duas notas
            medias[i][0] = (notas[i][0] + notas[i][1]) / 2;
        }

        return medias;
    }

    private static void imprimirBoletim(String[] alunos, int[][] medias) {
        System.out.println("Boletim:");
        for (int i = 0; i < alunos.length; i++) {
            // Imprimir a nota como "A" se a média for maior ou igual a 6, senão "R"
            System.out.print((medias[i][0] >= 6 ? "A" : "R") + "   ");

            // Quebra de linha a cada 3 alunos
            if ((i + 1) % 3 == 0) {
                System.out.println();
            }
        }
    }
}
