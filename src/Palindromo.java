import javax.swing.*;
import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        String number = JOptionPane.showInputDialog(null, "Digite um número: ");
        String captura1 = "";
        String captura2 = "";

        for (int i = 0; i < number.length(); i++) {
            captura1 += number.charAt(i);
        }
        for (int i = number.length() - 1; i >= 0; i--) {
            captura2 += number.charAt(i);
        }

        if (captura1.equals(captura2)) {
            System.out.println("O número " + number + " é um palíndromo");
        } else {
            System.out.println("O número " + number + " não é um palíndromo");
        }

    }
}
