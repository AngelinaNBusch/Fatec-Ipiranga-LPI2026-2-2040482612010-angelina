/* - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*
* Disciplina : Linguagem de Programacao I *
* Prof . Verissimo *
* - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*
* Objetivo do Programa : Simulacao do Xeque Pastor *
*                        utilizando uma matriz bidimensional para representar o tabuleiro *
* Data - 02 / 09 / 2026 *
* Autor : Angelina Novaes Busch *
* - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*/

public class XequePastor {

    // Tamanho do tabuleiro.
    private static final int TAMANHO_TABULEIRO = 8;

    // Representa uma casa vazia.
    private static final String CASA_VAZIA = " ";

    // Representa a casa de onde uma peca foi movimentada.
    private static final String CASA_MOVIMENTADA = "...";

    // Matriz que representa o tabuleiro.
    private static String[][] tabuleiro =
            new String[TAMANHO_TABULEIRO][TAMANHO_TABULEIRO];


    public static void main(String[] args) {

        // Inicializacao do tabuleiro.
        inicializarTabuleiro();

        System.out.println("================================================");
        System.out.println("          Posicao Inicial do tabuleiro");
        System.out.println("================================================");

        // Mostra o tabuleiro inicial.
        exibirTabuleiro();


        // 1 Jogada

        System.out.println();
        System.out.println("================================================");
        System.out.println("                  JOGADA #1");
        System.out.println("================================================");

        executarJogada1();


        // 2 Jogada

        System.out.println();
        System.out.println("================================================");
        System.out.println("                  JOGADA #2");
        System.out.println("================================================");

        executarJogada2();


        // 3 Jogada

        System.out.println();
        System.out.println("================================================");
        System.out.println("                  JOGADA #3");
        System.out.println("================================================");

        executarJogada3();


        // 4 Jogada (Xeque Mate)

        System.out.println();
        System.out.println("================================================");
        System.out.println("           JOGADA #4 (XEQUE MATE)");
        System.out.println("================================================");

        executarJogada4();
    }

      //Prepara o tabuleiro.
      //Primeiro, todas as casas ficam vazias.
      //Depois, as pecas sao colocadas nas posicoes iniciais.
     
    private static void inicializarTabuleiro() {

        // Preenche todas as casas com espacos vazios.
        for (int linha = 0; linha < TAMANHO_TABULEIRO; linha++) {

            for (int coluna = 0; coluna < TAMANHO_TABULEIRO; coluna++) {

                tabuleiro[linha][coluna] = CASA_VAZIA;
            }
        }



        //Pecas pretas.
        //Linha 0 representa a linha 8 do tabuleiro.
        tabuleiro[0][0] = "tP1";
        tabuleiro[0][1] = "CP2";
        tabuleiro[0][2] = "bP3";
        tabuleiro[0][3] = "DP4";
        tabuleiro[0][4] = "rP5";
        tabuleiro[0][5] = "bP6";
        tabuleiro[0][6] = "CP7";
        tabuleiro[0][7] = "tP8";


        // Peoes pretos.
        for (int coluna = 0; coluna < TAMANHO_TABULEIRO; coluna++) {

            tabuleiro[1][coluna] = "PP" + (coluna + 1);
        }


        //Pecas brancas.
        //Linha 7 representa a linha 1 do tabuleiro.
        tabuleiro[7][0] = "TB1";
        tabuleiro[7][1] = "CB2";
        tabuleiro[7][2] = "BB3";
        tabuleiro[7][3] = "DB4";
        tabuleiro[7][4] = "RB5";
        tabuleiro[7][5] = "BB6";
        tabuleiro[7][6] = "CB7";
        tabuleiro[7][7] = "TB8";


        // Peoes brancos.
        for (int coluna = 0; coluna < TAMANHO_TABULEIRO; coluna++) {

            tabuleiro[6][coluna] = "PB" + (coluna + 1);
        }
    }



     //Mostra o tabuleiro na tela.
     //Cada casa possui o mesmo tamanho.
     //Assim, as colunas ficam alinhadas.
     
    private static void exibirTabuleiro() {

        System.out.println();

        for (int linha = 0; linha < TAMANHO_TABULEIRO; linha++) {

            // Muda a linha da matriz para a numeracao do xadrez.
            int numeroLinha = TAMANHO_TABULEIRO - linha;

            System.out.print(numeroLinha + " ");

            for (int coluna = 0; coluna < TAMANHO_TABULEIRO; coluna++) {

                // Todas as casas tem a mesma largura.
                System.out.printf("%-4s", tabuleiro[linha][coluna]);
            }

            System.out.println();
        }

        // Mostra as letras das colunas.
        System.out.println("  a   b   c   d   e   f   g   h");
    }



    //Indica a posicao do xadrez na matriz.
    //Por exemplo:
    //a8 -> linha 0, coluna 0
    //h1 -> linha 7, coluna 7
    
    
    private static int[] converterPosicao(String posicao) {

        char colunaLetra = posicao.charAt(0);

        int numeroLinha =
                Character.getNumericValue(posicao.charAt(1));

        int coluna = colunaLetra - 'a';

        int linha = TAMANHO_TABULEIRO - numeroLinha;

        return new int[]{linha, coluna};
    }


    //Move uma peca de uma casa para outra.
    private static void moverPeca(String origem, String destino) {

        // Altera as posicoes para indices da matriz.
        int[] coordenadasOrigem =
                converterPosicao(origem);

        int[] coordenadasDestino =
                converterPosicao(destino);


        int linhaOrigem = coordenadasOrigem[0];
        int colunaOrigem = coordenadasOrigem[1];

        int linhaDestino = coordenadasDestino[0];
        int colunaDestino = coordenadasDestino[1];


        // Guarda a peca que sera movimentada.
        String peca =
                tabuleiro[linhaOrigem][colunaOrigem];


        // A casa de origem recebe "...".
        tabuleiro[linhaOrigem][colunaOrigem] =
                CASA_MOVIMENTADA;


        // A peca vai para a casa de destino.
        tabuleiro[linhaDestino][colunaDestino] =
                peca;


        // Mostra a movimentacao.
        System.out.println("Posicao origem: " + CASA_MOVIMENTADA);
        System.out.println("Posicao final: " + peca);
    }



     //Executa a Jogada #1.
     //Brancas: e2-e4
     //Pretas: e7-e5
     
    private static void executarJogada1() {

        System.out.println();
        System.out.println("----------- Brancas jogam e4 -----------");

        // Peao branco.
        moverPeca("e2", "e4");
        exibirTabuleiro();


        System.out.println();
        System.out.println("----------- Pretas jogam e5 -----------");

        // Peao preto.
        moverPeca("e7", "e5");
        exibirTabuleiro();
    }


     //Executa a Jogada #2.
     //Brancas: Bc4
     //Pretas: Cc6
     
    private static void executarJogada2() {

        System.out.println();
        System.out.println("----------- Brancas jogam Bc4 -----------");

        // Bispo branco.
        moverPeca("f1", "c4");
        exibirTabuleiro();


        System.out.println();
        System.out.println("----------- Pretas jogam Cc6 -----------");

        // Cavalo preto.
        moverPeca("b8", "c6");
        exibirTabuleiro();
    }


    //Executa a Jogada #3.
    //Brancas: Dh5
    //Pretas: Cf6
    private static void executarJogada3() {

        System.out.println();
        System.out.println("----------- Brancas jogam Dh5 -----------");

        // Dama branca.
        moverPeca("d1", "h5");
        exibirTabuleiro();


        System.out.println();
        System.out.println("----------- Pretas jogam Cf6 -----------");

        // Cavalo preto.
        moverPeca("g8", "f6");
        exibirTabuleiro();
    }


    //Executa a Jogada #4 (Xeque Mate).
    //A dama branca vai de h5 para f7,
    //capturando o peao preto que estava em f7.
    private static void executarJogada4() {

        System.out.println();
        System.out.println(
                "----------- Brancas jogam Dxf7# -----------"
        );

        // Dama branca h5 para f7.
        moverPeca("h5", "f7");
        exibirTabuleiro();


        System.out.println();
        System.out.println("================================================");
        System.out.println("                 XEQUE MATE!");
        System.out.println("                    Dxf7#");
        System.out.println("================================================");
    }
}
