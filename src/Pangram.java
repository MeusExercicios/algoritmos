import java.util.Scanner;

public class Pangram {

    public static String verificar(String x) {
        String[] array = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
                "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        StringBuilder letrasFaltando = new StringBuilder();

        for (String letra : array) {
            if (x.indexOf(letra) == -1) {
                letrasFaltando.append(letra);
            }
        }
        if (letrasFaltando.length() == 0) {
            return "Não falta letra";
        } else {
            return "Letras faltantes " + letrasFaltando.toString();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine().toLowerCase();

        String resposta = verificar(frase);

        System.out.println(resposta);


        scanner.close();
    }
}
