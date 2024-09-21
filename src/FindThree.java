import java.util.Scanner;

public class FindThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho do array");
        int tamanho = scanner.nextInt();
        int[] array = new int[tamanho];
        int[] preencher = new int[3];
        int aux = 0;
        int aux2 = 0;
        int aux3 = 0;

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite o número da posição " + (i + 1));
            array[i] = scanner.nextInt();
        }

        //CAPTURA DO PRIMEIRO VALOR
        for (int valores : array) {

            if (valores > aux) {
                aux = valores;
            }
        }
        preencher[0] += aux;


        //CAPTURA DO SEGUNDO VALOR
        for (int valores : array) {
            if (valores > aux2 && valores != aux) {
                aux2 = valores;
            }
        }
        preencher[1] += aux2;


        //CAPTURA DO TERCEIRO VALOR
        for (int valores : array) {
            if (valores > aux3 && valores != aux) {
                if (valores != aux2) {
                    aux3 = valores;
                }
            }
        }
        preencher[2] += aux3;

        for (int i = 0; i < preencher.length; i++) {
            System.out.println(preencher[i]);
        }


        scanner.close();
    }
}
