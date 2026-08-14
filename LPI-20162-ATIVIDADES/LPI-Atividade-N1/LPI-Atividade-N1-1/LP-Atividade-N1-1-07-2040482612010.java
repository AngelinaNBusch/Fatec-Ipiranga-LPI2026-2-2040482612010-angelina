import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class precisaoDecimal {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor A (ex: 1.00): ");
        String valorA = sc.nextLine();
        System.out.print("Informe o valor B (ex: 0.90): ");
        String valorB = sc.nextLine();
        System.out.print("Informe o valor total da compra: ");
        String valorTotal = sc.nextLine();
        System.out.print("Informe o número de parcelas: ");
        int numParcelas = Integer.parseInt(sc.nextLine());

        BigDecimal bigA = new BigDecimal(valorA);
        BigDecimal bigB = new BigDecimal(valorB);
        BigDecimal resultadoPreciso = bigA.subtract(bigB);

        double doubleA = Double.parseDouble(valorA);
        double doubleB = Double.parseDouble(valorB);
        double resultadoErrado = doubleA - doubleB;

        System.out.println("--- Demonstração da imprecisão do padrão IEEE 754 (double) ---");
        System.out.println("Resultado esperado de " + valorA + " - " + valorB + " seria: " + resultadoPreciso);
        System.out.println("Resultado real obtido com double: " + resultadoErrado);

        System.out.println("--- Correção exata usando java.math.BigDecimal ---");
        System.out.println("Resultado com BigDecimal (String Constructor): " + resultadoPreciso);

        BigDecimal bigCompra = new BigDecimal(valorTotal);
        BigDecimal valorParcela = bigCompra.divide(BigDecimal.valueOf(numParcelas), 2, RoundingMode.HALF_UP);

        System.out.println("--- Divisão de parcelas com Escala e RoundingMode.HALF_UP ---");
        System.out.println("Compra de R$ " + valorTotal + " dividida em " + numParcelas + "x: R$ " + valorParcela + " por parcela.");

        sc.close();

    }
}
