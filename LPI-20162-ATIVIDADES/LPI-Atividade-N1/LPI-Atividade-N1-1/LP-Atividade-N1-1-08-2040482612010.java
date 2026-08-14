import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Informe o valor total da compra em reais: ");
      double valorTotalReais = Double.parseDouble(sc.nextLine());
      System.out.print("Informe o número de parcelas: ");
      int numeroParcelas = Integer.parseInt(sc.nextLine());

      System.out.println("--- Calculadora Financeira Escalar (Mapeamento em Centavos) ---");
      long totalCentavos = Math.round(valorTotalReais * 100);
      System.out.println("Valor total convertido: " + totalCentavos + " centavos.");

      long parcelaCentavos = totalCentavos / numeroParcelas;
      System.out.println("Divisão de R$" + valorTotalReais + " por " + numeroParcelas + " em centavos: " + parcelaCentavos + " centavos por parcela.");

      double parcelaReais = parcelaCentavos / 100.0;
      System.out.println("Valor convertido para exibição: R$" + parcelaReais);
      
      sc.close();
    }

}
