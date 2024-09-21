import java.util.Scanner;
//14
public class Prefixo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();
        scanner.nextLine();
        String [] strings = new String[tamanho];

        for (int i = 0; i < strings.length; i++){
            System.out.println("Digite a " + (i+1) + " palavra: ");
            strings[i] = scanner.nextLine();
        }

        String prefixoComum = strings[0];

        for (int i = 1; i < strings.length; i++){
            int j = 0;

            while (j < prefixoComum.length() && j < strings[i].length() && prefixoComum.charAt(j) == strings[i].charAt(j)){
                j++;
            }
            prefixoComum = prefixoComum.substring(0,j);

            if (prefixoComum.isEmpty()){
                break;
            }

            if (!prefixoComum.isEmpty()) {
                System.out.println("O prefixo comum é: " + prefixoComum);
            } else {
                System.out.println("Não há um prefixo comum.");
            }
        }
        scanner.close();
    }
}
