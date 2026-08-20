//Agora, nessa situação, preferi utilizar o do-while por causa da necessidade de
//realizar a verificação ao menos uma vez antes de determinar se o valor é zero.

import java.util.Scanner;
public class Vendas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valorVenda;
        double total = 0;
        int quantidadeVendas = 0;

        do {
            System.out.print("Valor da venda (ou 0 para encerrar): ");
            valorVenda = sc.nextDouble();
            if (valorVenda != 0) {
                total += valorVenda;
                quantidadeVendas++;
            }
        } while (valorVenda != 0);
    
        if (quantidadeVendas > 0){ 
            double media = (total  / quantidadeVendas);
            System.out.println("Total vendido no turno: " + total);
            System.out.println("Quantidade de vendas: " + quantidadeVendas);
            System.out.printf("Valor médio por venda: %.2f\n ", media);
        } else {
            System.out.print("Nenhuma venda registrada nesta sessão de caixa.");
        }
        sc.close();
    }
}
