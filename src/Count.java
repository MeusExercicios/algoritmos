import java.util.Scanner;

public class Count {
    public static String quantidade(String x) {

        char[] letraArray = x.toCharArray();

        StringBuilder maiuscula = new StringBuilder();
        StringBuilder minuscula = new StringBuilder();
        StringBuilder numerica = new StringBuilder();
        StringBuilder especial = new StringBuilder();

        for (char letra : letraArray) {
            if (Character.isWhitespace(letra)){
                continue;
            }

            if (Character.isUpperCase(letra)) {
                maiuscula.append(letra);
            } else if (Character.isLowerCase(letra)) {
                minuscula.append(letra);
            } else if (Character.isDigit(letra)) {
                numerica.append(letra);
            } else {
                especial.append(letra);
            }
        }
        return "\nMaiúscula: " + maiuscula.length() +
                "\nMinúscula: " + minuscula.length() +
                "\nNumérica: " + numerica.length() +
                "\nEspeciais: " + especial.length();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();
        System.out.println("As quantidades são: " + quantidade(frase));

        scanner.close();
    }
}
