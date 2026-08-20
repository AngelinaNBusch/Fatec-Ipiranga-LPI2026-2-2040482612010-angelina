import java.util.Scanner;
public class Aluno {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor A: ");
        double a = sc.nextDouble();
        System.out.print("Informe o valor B: ");
        double b = sc.nextDouble();
        System.out.print("Informe o valor C: ");
        double c = sc.nextDouble();
        System.out.print("Informe o valor D: ");
        double d = sc.nextDouble();
        System.out.print("Informe a média do aluno: ");
        double mediaAluno = sc.nextDouble();
        System.out.print("Informe o percentual de presença: ");
        double presenca = sc.nextDouble();

        //Operações sem parênteses
        double semParenteses = a + b - c * d / c;

        //Operações com parênteses
        double comParenteses = a + b - ((c * d) / c);

        System.out.println("--- Demonstração de Precedência Aritmética ---");
        System.out.println("Resultado sem parênteses: " + semParenteses);
        System.out.println("Resultado com parênteses explícitos: " + comParenteses);
        System.out.println("Nota: Ambos dão o mesmo resultado pela precedência natural (*, /, depois +), mas a segunda forma é mais legível. ");
        System.out.println();
        boolean aprovadoDireto = (mediaAluno >= 6) && (presenca >= 75);
        System.out.println("--- Validação do Critério de Aprovação ---");
        System.out.println("Entrada -> Média: " + mediaAluno + " | Presença: " + presenca + "%");
        System.out.println("Resultado da avaliação (aprovadoDireto): " + aprovadoDireto);

        sc.close();
    }
}
