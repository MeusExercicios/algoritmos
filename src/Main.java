import java.util.Scanner;

public class Main {

    // Método para converter algarismos romanos para inteiros usando if e else
    public static int romanoParaInt(String romano) {
        int resultado = 0;
        int i = 0;

        while (i < romano.length()) {
            char atual = romano.charAt(i);
            int valorAtual = valorRomano(atual);

            // Verifica se não é o último caractere e se o próximo é maior que o atual
            if (i + 1 < romano.length()) {
                int valorProximo = valorRomano(romano.charAt(i + 1));

                if (valorAtual < valorProximo) {
                    // Subtrai o valor atual se for menor que o próximo
                    resultado += valorProximo - valorAtual;
                    i += 2; // Pula para o próximo par de caracteres
                    continue;
                }
            }

            // Adiciona o valor atual
            resultado += valorAtual;
            i++;
        }

        return resultado;
    }

    // Método para determinar o valor de cada caractere romano usando if e else
    private static int valorRomano(char c) {
        if (c == 'I') {
            return 1;
        } else if (c == 'V') {
            return 5;
        } else if (c == 'X') {
            return 10;
        } else if (c == 'L') {
            return 50;
        } else if (c == 'C') {
            return 100;
        } else if (c == 'D') {
            return 500;
        } else if (c == 'M') {
            return 1000;
        } else {
            return 0; // Caso de caractere inválido
        }
    }

    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número romano: ");
        String entrada = scanner.nextLine(); // Lê a entrada do usuário

        // Converte o número romano para inteiro
        int numero = romanoParaInt(entrada.toUpperCase()); // Converte para maiúsculo para garantir que funcione com qualquer input

        // Exibe o resultado
        System.out.println("O algarismo romano " + entrada + " equivale ao número: " + numero);

        // Fecha o Scanner
        scanner.close();
    }
}
