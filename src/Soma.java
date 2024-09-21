import java.util.Scanner;
//QUESTÃO1
public class Soma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();

        int[] array = new int[tamanho];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º número:");
            array[i] = scanner.nextInt();
        }

        System.out.println("Digite um número inteiro para verificar no array: ");
        int valor = scanner.nextInt();

        boolean somaEncontrada = false;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) { // Ajuste: começa de j = i + 1
                if (array[i] + array[j] == valor) {
                    System.out.println("Os índices são: " + i + " e " + j);
                    somaEncontrada = true;
                }
            }
        }

        if (!somaEncontrada) {
            System.out.println("Nenhuma soma encontrada.");
        }

        scanner.close();
    }
}
