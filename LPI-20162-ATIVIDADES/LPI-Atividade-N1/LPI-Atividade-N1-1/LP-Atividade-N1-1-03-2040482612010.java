import java.util.Scanner;
public class Idade { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 

        Integer idade = null;

        System.out.println("Tentando realizar operação aritmética com Integer nulo...");
        try {
            int metade = idade / 2;
            System.out.println("Metade da idade: " + metade);
        } catch (NullPointerException e) { 
            System.out.println("Erro Capturado com Sucesso: Não foi possível calcular porque a idade não foi informada (null)");
            System.out.println("Detalhe da Exceção: java.lang.NullPointerException");
    } 
    System.out.print("Informe uma idade válida: ");
    idade = sc.nextInt();
    int idadeProxAno = idade + 1;
    
    System.out.println("Reatribuindo valor para a variável...");
    System.out.println("Operação Bem-Sucedida! Idade atual: " + idade + ". Idade no próximo ano: " +idadeProxAno);

    sc.close();

    }
}
