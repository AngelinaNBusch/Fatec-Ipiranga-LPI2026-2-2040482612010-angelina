import java.util.Scanner;
public class Nota { 
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a nota final do aluno: ");
        double notaFinal = sc.nextDouble();

        System.out.println("--- Abordagem 1: Estrutura Condicional Tradicional (if-else) ---");
        String situacaoIfElse;
        if (notaFinal >= 6) {
            situacaoIfElse = "Aprovado";
        } else {
            situacaoIfElse = "Reprovado";
        }
        System.out.println("Situação (if-else): " + situacaoIfElse);
        System.out.println();

        System.out.println("--- Abordagem 2: Operador Ternário Simples ---");
        String situacaoTernario = (notaFinal >= 6) ? "Aprovado" : "Reprovado";
        System.out.println("Situação (ternário): " + situacaoTernario);

        sc.close();
    }
}
