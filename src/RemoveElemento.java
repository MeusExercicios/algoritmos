import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//QUESTÃO 27
public class RemoveElemento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o tamanho da lista ?");
        int tamanho = scanner.nextInt();

        List<Integer> list = new ArrayList<>();

        System.out.println("Preencha a lista com números inteiros: ");

        for (int i = 0; i < tamanho; i++) {
            int valor = scanner.nextInt();
            list.add(valor);
        }

        System.out.println("Qual valor deseja retirar da lista ?");
        int retirar = scanner.nextInt();

        list.remove(Integer.valueOf(retirar));


        System.out.println("O tamanho atual da lista é: " + list.size() + "\nA nova lista é : " + list);


        scanner.close();
    }
}
