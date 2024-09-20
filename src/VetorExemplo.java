import java.util.Scanner;

public class VetorExemplo {
    public static void main(String[] args) {
        int[] vetor = {1, 9, 2, 5, 3, 7, 4, 10, 8, 6};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para pesquisar no vetor: ");
        int numero = scanner.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("O número " + numero + " está no vetor.");
        } else {
            System.out.println("O número " + numero + " não está no vetor.");
        }

        int maior = vetor[0];
        int menor = vetor[0];
        int soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
            soma += vetor[i];
        }

        double media = (double) soma / vetor.length;

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.printf("Média dos valores: %.2f%n", media);
    }
}
