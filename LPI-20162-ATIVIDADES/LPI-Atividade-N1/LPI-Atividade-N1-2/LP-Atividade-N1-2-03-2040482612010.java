//Finalmente, achei que seria melhor usar do-while novamente, pelo número 
//de tentativas do usuário ser desconhecido e também pela necessidade
//de pedir a senha obrigatoriamente ao menos uma vez.

import java.util.Scanner;
public class Senha {
    public static final int PIN_CERTO = 1234;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tentativas = 0;
        int pinDigitado;
    
        do {
        System.out.print("Informe o PIN de acesso: ");
         pinDigitado = sc.nextInt();
         tentativas++;
         if (pinDigitado != PIN_CERTO) {
            System.out.println("PIN incorreto. Tente novamente.");
         }
         } while (pinDigitado != PIN_CERTO);
        if (pinDigitado == PIN_CERTO) {
            System.out.print("Acesso concedido! Você utilizou " + tentativas + " tentativa(s).");
        }
        sc.close();

    }
}
