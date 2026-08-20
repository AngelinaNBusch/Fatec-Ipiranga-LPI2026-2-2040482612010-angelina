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
      
        //Análise comparativa com o BigDecimal
        //Benefícios da utilização de inteiros na representação dos valores (centavos):
        //1. As operações com long são mais diretas e eficientes do que com BigDecimal, que precisa criar
        //novos objetos imutáveis durante cada operação.
        //2. Não ocorre perda por arredondamento, já que os números inteiros armazenam valores exatos.

        //Limitações da utilização de inteiros na representação dos valores:
        //1. Essa solução é adequada apenas quando a escala é fixa e previamente definida. Caso ela seja alterada,
        //é necessário adaptar novamente a lógica responsável pela conversão.
        
        //2. A divisão inteira elimina a parte restante do cálculo, fazendo com que centavos sejam descartados.
        //Quando o valor total das parcelas precisa coincidir exatamente com o total, esse ajuste deve ser feito manualmente.
        
        //3. BigDecimal permite definir de forma clara a escala e o método de arredondamento (RoundingMode),
        //além de proporcionar maior clareza e segurança em cálculos financeiros mais complexos.

    }
}
