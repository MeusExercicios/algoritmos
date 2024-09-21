import javax.swing.*;
//QUESTÃO 13
public class Romano {
    public static void main(String[] args) {
        String romano = JOptionPane.showInputDialog(null, "Digite um algarismo romano: ");


        int resposta = conversao(romano);

        System.out.println(resposta);

    }

    public static int conversao(String valorTexto) {
        int i = 0;
        int resultado = 0;

        while (i < valorTexto.length()) {
            char atual = valorTexto.charAt(i);
            int convertido1 = valorConvertido(atual);


            if (i + 1 < valorTexto.length()) {
                char proximoValor = valorTexto.charAt(i + 1);
                int convertido2 = valorConvertido(proximoValor);

                if (convertido1 < convertido2) {
                    int valorFinal = convertido2 - convertido1;

                    resultado += valorFinal;
                    i += 2;
                    continue;
                }
            }
            resultado += convertido1;
            i++;
        }
        return resultado;

    }

    public static int valorConvertido(char c) {
        switch (c) {
            case 'I':
                return 1;


            case 'V':
                return 5;


            case 'X':
                return 10;


            case 'L':
                return 50;


            case 'C':
                return 100;

            case 'D':
                return 500;


            case 'M':
                return 1000;

            default:
                return 0;

        }
    }
}

