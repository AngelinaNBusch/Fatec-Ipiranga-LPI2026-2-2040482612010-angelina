import java.util.Scanner;
import java.util.Locale;

    public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantidade de leituras:  ");
        int quantidadeLeituras = input.nextInt();

        //Declaração
        double[] dado = new double[quantidadeLeituras];

        for(int i = 0; i < dado.length; i++) 
        {
            System.out.print("Temperatura (°C): ");
            double temperatura = input.nextDouble();
            dado[i] = temperatura;
        }
        
        //Percurso
        System.out.println("-- Leituras Registradas --");
        for(int i = 0; i < dado.length; i++) 
        {
            System.out.println("Leitura [" + i + "]:  " + dado[i] + "°C");
        }

        //Acesso
        System.out.println("-- Acesso Direto --");
        System.out.println("Primeira leitura (indice 0):  " + dado[0] + "°C");
        System.out.println("Ultima leitura (indice " + (dado.length - 1) + "):  " + dado[dado.length - 1] + "°C");

        //Busca linear
        System.out.println("-- Busca Linear:  Extremos --");
      
        //Inicialização com o primeiro vetor
        double maximo = dado[0];
        double minimo = dado[0];
        int indiceMaximo = 0;
        int indiceMinimo = 0;
        for(int i = 0; i < dado.length; i++) 
        {
            if(dado[i] > maximo) {
                maximo = dado[i];
                indiceMaximo = i;
            }
            if(dado[i] < minimo) {
                minimo = dado[i];
                indiceMinimo = i;
            }
        }
        System.out.println("Maior temperatura:  " + maximo + "°C (indice " + indiceMaximo + ")");
        System.out.println("Menor temperatura:  " + minimo + "°C (indice " + indiceMinimo + ")");
        System.out.print("Temperatura crítica de alerta (°C): ");
        double temperaturaCritica = input.nextDouble();

        System.out.println("-- Busca Linear:  Alerta --");
        boolean encontrouAlerta = false;
        for(int i = 0; i < dado.length; i++) 
        {
            if(dado[i] >= temperaturaCritica) {
                System.out.println("Alerta: temperatura critica atingida na leitura de indice " + i + " (" + dado[i] + "°C).");
                encontrouAlerta = true;
            }
        }
        if(!encontrouAlerta) {
            System.out.println("Nenhuma leitura atingiu ou ultrapassou a temperatura critica informada.");
        }
        input.close();
    }
}
