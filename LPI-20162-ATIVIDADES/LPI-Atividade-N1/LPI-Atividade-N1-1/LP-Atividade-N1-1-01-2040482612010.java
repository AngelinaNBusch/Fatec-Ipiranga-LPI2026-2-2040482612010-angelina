import java.util.Scanner;
public class Primitivos {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

         //byte: 8 bits | intervalo: -128 a 127
        byte idade;

        //short: 16 bits | intervalo: -32.768 a 32.767
        short faltas;

        //int: 32 bits | intervalo: -2.147.483.648 a 2.147.483.647
        int matriculaId;

        //long: 64 bits | intervalo: -9.223.372.036.854.775.808
        // a 9.223.372.036.854.775.807
        long codigoNacional;

        //float: 32 bits | aproximadamente ±3,4 × 10^38
        //(precisão de aproximadamente 6-7 casas decimais)
        float notaTrabalho;

        //double: 64 bits | aproximadamente ±1,7 × 10^308
        //(precisão de aproximadamente 15-16 casas decimais)
        double notaProvaFinal;

        //char: 16 bits | intervalo: '\u0000' (0) a '\uFFFF' (65.535)
        char conceitoFinal;

        //boolean só armazena true ou false, por isso não possui intervalo definido
        boolean aprovado;


        System.out.print("Idade do aluno: ");
        idade = sc.nextByte();
        System.out.print("Numero de faltas: ");
        faltas = sc.nextShort();
        System.out.print("Matricula ID: ");
        matriculaId = sc.nextInt();
        System.out.print("Codigo Nacional do Estudante: ");
        codigoNacional = sc.nextLong();
        System.out.print("Nota do trabalho: ");
        notaTrabalho = sc.nextFloat();
        System.out.print("Nota da prova final: ");
        notaProvaFinal = sc.nextDouble();
        System.out.print("Conceito final do aluno: ");
        conceitoFinal = sc.next().charAt(0);
        System.out.print("Aluno esta aprovado? (true/false) ");
        aprovado = sc.nextBoolean();

        System.out.println("Idade do aluno: " + idade);
        System.out.println("Número de faltas: " + faltas);
        System.out.println("Matrícula ID: " + matriculaId);
        System.out.println("Código Nacional do Estudante: " + codigoNacional);
        System.out.println("Nota do Trabalho: " + notaTrabalho);
        System.out.println("Nota da Prova Final: " + notaProvaFinal);
        System.out.println("Conceito Final do Aluno: " + conceitoFinal);
        System.out.println("Aluno Está Aprovado? " + aprovado);

sc.close();
 }
}
