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

      // O operador & sempre verifica as duas condições da expressão, mesmo quando a primeira
      // já seria suficiente para determinar o resultado. Por exemplo, se a variável texto for
      // null, o Java ainda vai tentar executar texto.length(), causando um NullPointerException,
      // pois não é possível chamar um método em uma referência nula.
      // Já o operador && funciona de maneira diferente. Ele só verifica a segunda condição se
      // a primeira for verdadeira. Assim, quando a primeira condição já for falsa, o Java para
      // a avaliação naquele momento e não executa o restante da expressão, evitando o erro.

        if (valido) {
            System.out.println("Usuário Válido Fornecido: " + texto);
        } else { 
            System.out.println("Entrada rejeitada: o texto está nulo ou vazio. ");
        }

        sc.close();
    }
}
