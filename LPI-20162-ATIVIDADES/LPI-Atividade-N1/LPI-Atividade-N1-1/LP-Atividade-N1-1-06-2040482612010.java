import java.util.Scanner;
public class Curto {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        
        String texto;

        System.out.println("--- Execução 1 ---");
        System.out.print("Informe o nome de usuário: ");
        
        if (sc.hasNextLine()) { 
            texto = sc.nextLine();
        } else {
            texto = null;
        }

        boolean valido = texto != null && texto.length() > 0;

        //O & simples avalia os dois lados, ainda que o primeiro já seja suficiente para
        //decidir o resultado. Ou seja, se o texto for null, o Java ainda tentaria executar
        //texto.length(), e chamar algum método em um objeto nulo gera NullPointerException.
        //O && evita este cenário pois para de avaliar assim que o o primeiro lado da expressão 
        //seja falso.

        if (valido) {
            System.out.println("Usuário Válido Fornecido: " + texto);
        } else { 
            System.out.println("Entrada rejeitada: o texto está nulo ou vazio. ");
        }

        sc.close();
    }
}
