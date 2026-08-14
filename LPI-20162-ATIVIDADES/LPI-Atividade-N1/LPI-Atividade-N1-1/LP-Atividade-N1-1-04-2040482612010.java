import java.util.Scanner;
public class Biblioteca { 

public static final String NOME_INSTITUICAO = "FATEC Ipiranga";
public static final int PRAZO_MAXIMO_PADRAO = 14;

public static int calcularDiasDevolucao(int diasEmprestimo) {
        if (diasEmprestimo > PRAZO_MAXIMO_PADRAO) {
            return PRAZO_MAXIMO_PADRAO;
        }

        return diasEmprestimo;
    }


public static void main(String[] args) {  
    Scanner sc = new Scanner(System.in);

    System.out.print("Informe o número de dias do empréstimo: ");
    final int diasEmprestimo = sc.nextInt();
    final int diasParaDevolucao = calcularDiasDevolucao(diasEmprestimo);

    //Tentar reatribuir o prazo máximo de devolução geraria um erro de compilação, pois essa variável é final.
    
    System.out.println("Instituição: " + NOME_INSTITUICAO);
    System.out.println("Prazo Máximo Padrão: " + PRAZO_MAXIMO_PADRAO + " dias." );
    System.out.println("Dias Calculados para Devolução: " + diasParaDevolucao);

    sc.close();
}
}
