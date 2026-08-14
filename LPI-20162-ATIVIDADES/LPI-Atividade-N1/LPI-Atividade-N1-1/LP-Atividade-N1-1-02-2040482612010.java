import java.util.Scanner;
public class comparacaoInteger { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // entrada
        System.out.print("Valor para a comparação de primitivos: ");
        int valorPrimitivo = sc.nextInt();
        
        int aPrimitivo = valorPrimitivo;
        int bPrimitivo = valorPrimitivo;

        System.out.print("Valor para a comparação de objetos (new Integer):");
        int valorObjeto = sc.nextInt();

        Integer aObjeto = new Integer(valorObjeto);
        Integer bObjeto = new Integer(valorObjeto);

        System.out.print("Valor dentro do Integer Cache (entre -128 e 127):");
        int valorCache = sc.nextInt();

        Integer xCache = valorCache;
        Integer yCache = valorCache;

        System.out.print("Valor fora do Cache: ");
        int valorForaCache = sc.nextInt();

        Integer xForaCache = valorForaCache;
        Integer yForaCache = valorForaCache;

        // Saída
        System.out.println("--- Comparação de primitivos (int) =---");
        System.out.println("aPrimitivo == bPrimitivo: " + (aPrimitivo == bPrimitivo));
        System.out.println("--- Comparação de Objetos via 'new Integer()' ---");
        System.out.println("aObjeto == bObjeto (Identidade): " + (aObjeto == bObjeto));
        System.out.println("aObjeto.equals(bObjeto) (Valor): " + aObjeto.equals(bObjeto));
        System.out.println("--- Comparação com Autoboxing e Integer Cache ---");
        System.out.println("Dentro do Cache: xCache == yCache: " + (xCache == yCache));
        System.out.println("Fora do Cache: xForaCache == yForaCache: " + (xForaCache == yForaCache));
        System.out.println("Fora do Cache: xForaCache.equals(yForaCache):" + xForaCache.equals(yForaCache));

        sc.close();

    
    }
}
