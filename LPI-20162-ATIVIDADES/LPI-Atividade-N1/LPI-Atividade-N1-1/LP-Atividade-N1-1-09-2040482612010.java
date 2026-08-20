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
        //Exemplo de operador ternário ENCADEADO (nested ternary), considerando um terceiro
        //resultado (por exemplo: Exame), com as opções Reprovado (<4), Exame (4 a <6) e Aprovado (>=6):
        //String situacaoComExame = (notaFinal >= 6) ? "Aprovado"
        //: (notaFinal >= 4) ? "Exame"
        //: "Reprovado";

        //Essa abordagem DEVE SER EVITADA, pois reúne diversas condições dentro de uma única
        //expressão, deixando o código mais difícil de compreender (é necessário separar mentalmente
        //cada operador ternário para entender seu funcionamento), complica a depuração (não é possível
        //definir um breakpoint diretamente em uma condição específica) e aumenta a possibilidade de erros
        //ao incluir ou modificar regras. Quando existem mais de dois resultados possíveis, utilizar
        //um if/else if tradicional torna a lógica equivalente muito mais fácil de interpretar.
    }
}
