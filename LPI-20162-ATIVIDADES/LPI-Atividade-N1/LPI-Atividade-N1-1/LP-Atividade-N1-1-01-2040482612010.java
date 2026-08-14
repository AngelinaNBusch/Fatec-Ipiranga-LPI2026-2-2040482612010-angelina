import java.util.Scanner;
public class Primitivos {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        
        byte idade;

        short faltas;

        int matriculaId;

        long codigoNacional;
        
        float notaTrabalho;

        double notaProvaFinal;

        char conceitoFinal;

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
