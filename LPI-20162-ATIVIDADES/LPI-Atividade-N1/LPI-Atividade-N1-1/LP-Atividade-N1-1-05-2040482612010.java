import java.util.Scanner;
public class Estoque { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        // ENTRADA DE DADOS
        System.out.print("Estoque inicial: ");
        int estoqueInicial = sc.nextInt();
        System.out.print("Quantidade de entrada: ");
        int qtdEntrada = sc.nextInt();
        System.out.print("Quantidade de saída 1: ");
        int qtdSaida1 = sc.nextInt();
        System.out.print("Quantidade de saída 2: ");
        int qtdSaida2 = sc.nextInt();
        System.out.print("Estoque mínimo: ");
        int estMinimo = sc.nextInt();
        System.out.print("Tamanho do lote (caixa): ");
        int tamLote = sc.nextInt();

        //SAÍDA 
       int estoque = estoqueInicial;
        System.out.println("Estoque inicial: " + estoqueInicial + " unidades.");
        estoque += qtdEntrada;
        System.out.println("Após entrada (+" + qtdEntrada + "): " + estoque + " unidades.");
        estoque -= qtdSaida1;
        System.out.println("Após saída (-" + qtdSaida1 + "): " + estoque + " unidades.");
        estoque -= qtdSaida2;
        System.out.println("Após outra saída (-" + qtdSaida2 + "): " + estoque + " unidades.");
        boolean abaixoEstoqueMinimo = estMinimo > estoque;
        System.out.println("O nível de estoque atual (" + estoque + ") está abaixo do mínimo (" + estMinimo + ")? " + abaixoEstoqueMinimo);
    int unidadesForaCaixa = estoque % tamLote;
    boolean fracPerfeitamente = unidadesForaCaixa == 0;
    System.out.println("Unidades fora de caixas fechadas de " + tamLote + ": " + unidadesForaCaixa);
    System.out.println("O estoque está perfeitamente fracionado em caixas completas? " + fracPerfeitamente);

    sc.close();

        

    }
}
