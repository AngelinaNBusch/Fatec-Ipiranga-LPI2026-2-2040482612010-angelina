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

        if (valido) {
            System.out.println("Usuário Válido Fornecido: " + texto);
        } else { 
            System.out.println("Entrada rejeitada: o texto está nulo ou vazio. ");
        }

        sc.close();
    }
}
