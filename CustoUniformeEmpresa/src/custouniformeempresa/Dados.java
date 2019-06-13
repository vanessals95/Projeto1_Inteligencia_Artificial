package custouniformeempresa;

/**
 *
 * @author Vanessa
 */
public class Dados {
    
        public static final int Aracaju = 0;
	public static final int BarraCoqueiros = 1;
	public static final int Socorro = 2;
	public static final int Laranjeiras = 3;
	public static final int SaoCristovao = 4;
	public static final int Itaporanga = 5;
	public static final int AreiaBranca = 6;
	public static final int Malhador = 7;
	public static final int MoitaBonita = 8;
	public static final int Itabaiana = 9;
	public static final int CampoDoBrito = 10;
        public static final int SaoDomingos = 11;
        public static final int Lagarto = 12;
        public static final int Macambira = 13;
        public static final int Ribeiropolis = 14;
        public static final int FreiPaulo = 15;  
        public static final int Aparecida = 16;
        public static final int Carira = 17;
        public static final int Gloria = 18;
        public static final int MonteAlegre = 19;
        public static final int PocoRedondo = 20;
        
        private Dados () {
                        
        }
    
        public static Vertice[] carregarVertices() {
               return new Vertice[] {
                  new Vertice("Aracaju ", Aracaju),
                  new Vertice("BarraCoqueiros", BarraCoqueiros),
                  new Vertice("Socorro", Socorro),
                  new Vertice("Laranjeiras", Laranjeiras),
                  new Vertice("SaoCristovao", SaoCristovao),
                  new Vertice("Itaporanga", Itaporanga),
                  new Vertice("AreiaBranca", AreiaBranca),
                  new Vertice("Malhador", Malhador),
                  new Vertice("MoitaBonita", MoitaBonita),
                  new Vertice("Itabaiana", Itabaiana),
                  new Vertice("CampoDoBrito", CampoDoBrito),
                  new Vertice("SaoDomingos", SaoDomingos),
                  new Vertice("Lagarto", Lagarto),
                  new Vertice("Macambira", Macambira),
                  new Vertice("Ribeiropolis", Ribeiropolis),
                  new Vertice("FreiPaulo", FreiPaulo),
                  new Vertice("Aparecida", Aparecida),
                  new Vertice("Carira", Carira),
                  new Vertice("Gloria", Gloria),
                  new Vertice("MonteAlegre", MonteAlegre),
                  new Vertice("PocoRedondo", PocoRedondo)
                          
               } ;
        }
        
        public static void insereDados(double[][] matrizAdjacencia, int origem, int destino, double valor) {
		matrizAdjacencia[origem][destino] = valor;
		matrizAdjacencia[destino][origem] = valor;
	}
        
        public static double [][] iniciaMatriz(int tamanho){
            double [][] matrizAdjacencia = new double [tamanho][tamanho];
            
            //Aracaju
            insereDados(matrizAdjacencia, Aracaju, Aracaju, 0);
            insereDados(matrizAdjacencia, Aracaju, BarraCoqueiros, 3.84);
            insereDados(matrizAdjacencia, Aracaju, Socorro, 4.48);
            insereDados(matrizAdjacencia, Aracaju, SaoCristovao, 0.432);
            insereDados(matrizAdjacencia, Aracaju, Laranjeiras, 0);
            insereDados(matrizAdjacencia, Aracaju, AreiaBranca, 0);
            insereDados(matrizAdjacencia, Aracaju, Itaporanga, 0);
            insereDados(matrizAdjacencia, Aracaju, Malhador, 0);
            insereDados(matrizAdjacencia, Aracaju, MoitaBonita, 0);
            insereDados(matrizAdjacencia, Aracaju, Itabaiana, 0);
            insereDados(matrizAdjacencia, Aracaju, CampoDoBrito, 0);
            insereDados(matrizAdjacencia, Aracaju, Macambira, 0);
            insereDados(matrizAdjacencia, Aracaju, SaoDomingos, 0);
            insereDados(matrizAdjacencia, Aracaju, Lagarto, 0);
            insereDados(matrizAdjacencia, Aracaju, Ribeiropolis, 0);
            insereDados(matrizAdjacencia, Aracaju, FreiPaulo, 0);
            insereDados(matrizAdjacencia, Aracaju, Aparecida, 0);
            insereDados(matrizAdjacencia, Aracaju, Carira, 0);
            insereDados(matrizAdjacencia, Aracaju, Gloria, 0);
            insereDados(matrizAdjacencia, Aracaju, MonteAlegre, 0);
            insereDados(matrizAdjacencia, Aracaju, PocoRedondo, 0);
            
            //Barra dos Coqueiros
            insereDados(matrizAdjacencia, BarraCoqueiros, Aracaju, 3.84);
            insereDados(matrizAdjacencia, BarraCoqueiros, BarraCoqueiros, 0);
            insereDados(matrizAdjacencia, BarraCoqueiros, Socorro, 0);
            insereDados(matrizAdjacencia, BarraCoqueiros, SaoCristovao, 0);
            insereDados(matrizAdjacencia, BarraCoqueiros, Laranjeiras, 0);
            insereDados(matrizAdjacencia, BarraCoqueiros, AreiaBranca, 0);
            insereDados(matrizAdjacencia, BarraCoqueiros, Itaporanga, 0);
            insereDados(matrizAdjacencia, BarraCoqueiros, Malhador, 0);
            insereDados(matrizAdjacencia, BarraCoqueiros, MoitaBonita, 0);
            insereDados(matrizAdjacencia, BarraCoqueiros, Itabaiana, 0);
            insereDados(matrizAdjacencia, BarraCoqueiros, CampoDoBrito, 0);
            insereDados(matrizAdjacencia, BarraCoqueiros, Macambira, 0);
            insereDados(matrizAdjacencia, BarraCoqueiros, SaoDomingos, 0);
            insereDados(matrizAdjacencia, BarraCoqueiros, Lagarto, 0);
            insereDados(matrizAdjacencia, BarraCoqueiros, Ribeiropolis, 0);
            insereDados(matrizAdjacencia, BarraCoqueiros, FreiPaulo, 0);
            insereDados(matrizAdjacencia, BarraCoqueiros, Aparecida, 0);
            insereDados(matrizAdjacencia, BarraCoqueiros, Carira, 0);
            insereDados(matrizAdjacencia, BarraCoqueiros, Gloria, 0);
            insereDados(matrizAdjacencia, BarraCoqueiros, MonteAlegre, 0);
            insereDados(matrizAdjacencia, BarraCoqueiros, PocoRedondo, 0);
            
            //Nossa Senhora do Socorro
            insereDados(matrizAdjacencia, Socorro, Aracaju, 4.48);
            insereDados(matrizAdjacencia, Socorro, BarraCoqueiros, 0);
            insereDados(matrizAdjacencia, Socorro, Socorro, 0);
            insereDados(matrizAdjacencia, Socorro, SaoCristovao, 0.216);
            insereDados(matrizAdjacencia, Socorro, Laranjeiras, 7.056);
            insereDados(matrizAdjacencia, Socorro, AreiaBranca, 4.56);
            insereDados(matrizAdjacencia, Socorro, Itaporanga, 0);
            insereDados(matrizAdjacencia, Socorro, Malhador, 0);
            insereDados(matrizAdjacencia, Socorro, MoitaBonita, 0);
            insereDados(matrizAdjacencia, Socorro, Itabaiana, 0);
            insereDados(matrizAdjacencia, Socorro, CampoDoBrito, 0);
            insereDados(matrizAdjacencia, Socorro, Macambira, 0);
            insereDados(matrizAdjacencia, Socorro, SaoDomingos, 0);
            insereDados(matrizAdjacencia, Socorro, Lagarto, 0);
            insereDados(matrizAdjacencia, Socorro, Ribeiropolis, 0);
            insereDados(matrizAdjacencia, Socorro, FreiPaulo, 0);
            insereDados(matrizAdjacencia, Socorro, Aparecida, 0);
            insereDados(matrizAdjacencia, Socorro, Carira, 0);
            insereDados(matrizAdjacencia, Socorro, Gloria, 0);
            insereDados(matrizAdjacencia, Socorro, MonteAlegre, 0);
            insereDados(matrizAdjacencia, Socorro, PocoRedondo, 0);
            
            //São Cristóvão
            insereDados(matrizAdjacencia, SaoCristovao, Aracaju, 0.432);
            insereDados(matrizAdjacencia, SaoCristovao, BarraCoqueiros, 0);
            insereDados(matrizAdjacencia, SaoCristovao, Socorro, 0.216);
            insereDados(matrizAdjacencia, SaoCristovao, SaoCristovao, 0);
            insereDados(matrizAdjacencia, SaoCristovao, Laranjeiras, 0);
            insereDados(matrizAdjacencia, SaoCristovao, AreiaBranca, 0);
            insereDados(matrizAdjacencia, SaoCristovao, Itaporanga, 14.553);
            insereDados(matrizAdjacencia, SaoCristovao, Malhador, 0);
            insereDados(matrizAdjacencia, SaoCristovao, MoitaBonita, 0);
            insereDados(matrizAdjacencia, SaoCristovao, Itabaiana, 0);
            insereDados(matrizAdjacencia, SaoCristovao, CampoDoBrito, 0);
            insereDados(matrizAdjacencia, SaoCristovao, Macambira, 0);
            insereDados(matrizAdjacencia, SaoCristovao, SaoDomingos, 0);
            insereDados(matrizAdjacencia, SaoCristovao, Lagarto, 0);
            insereDados(matrizAdjacencia, SaoCristovao, Ribeiropolis, 0);
            insereDados(matrizAdjacencia, SaoCristovao, FreiPaulo, 0);
            insereDados(matrizAdjacencia, SaoCristovao, Aparecida, 0);
            insereDados(matrizAdjacencia, SaoCristovao, Carira, 0);
            insereDados(matrizAdjacencia, SaoCristovao, Gloria, 0);
            insereDados(matrizAdjacencia, SaoCristovao, MonteAlegre, 0);
            insereDados(matrizAdjacencia, SaoCristovao, PocoRedondo, 0);
            
            //Laranjeiras
            insereDados(matrizAdjacencia, Laranjeiras, Aracaju, 0);
            insereDados(matrizAdjacencia, Laranjeiras, BarraCoqueiros, 0);
            insereDados(matrizAdjacencia, Laranjeiras, Socorro, 7.056);
            insereDados(matrizAdjacencia, Laranjeiras, SaoCristovao, 0);
            insereDados(matrizAdjacencia, Laranjeiras, Laranjeiras, 0);
            insereDados(matrizAdjacencia, Laranjeiras, AreiaBranca, 1.44);
            insereDados(matrizAdjacencia, Laranjeiras, Itaporanga, 0);
            insereDados(matrizAdjacencia, Laranjeiras, Malhador, 0);
            insereDados(matrizAdjacencia, Laranjeiras, MoitaBonita, 0);
            insereDados(matrizAdjacencia, Laranjeiras, Itabaiana, 0);
            insereDados(matrizAdjacencia, Laranjeiras, CampoDoBrito, 0);
            insereDados(matrizAdjacencia, Laranjeiras, Macambira, 0);
            insereDados(matrizAdjacencia, Laranjeiras, SaoDomingos, 0);
            insereDados(matrizAdjacencia, Laranjeiras, Lagarto, 0);
            insereDados(matrizAdjacencia, Laranjeiras, Ribeiropolis, 0);
            insereDados(matrizAdjacencia, Laranjeiras, FreiPaulo, 0);
            insereDados(matrizAdjacencia, Laranjeiras, Aparecida, 0);
            insereDados(matrizAdjacencia, Laranjeiras, Carira, 0);
            insereDados(matrizAdjacencia, Laranjeiras, Gloria, 0);
            insereDados(matrizAdjacencia, Laranjeiras, MonteAlegre, 0);
            insereDados(matrizAdjacencia, Laranjeiras, PocoRedondo, 0);
            
            //Itaporanga
            insereDados(matrizAdjacencia, Itaporanga, Aracaju, 0);
            insereDados(matrizAdjacencia, Itaporanga, BarraCoqueiros, 0);
            insereDados(matrizAdjacencia, Itaporanga, Socorro, 7.44);
            insereDados(matrizAdjacencia, Itaporanga, SaoCristovao, 14.553);
            insereDados(matrizAdjacencia, Itaporanga, Laranjeiras, 0);
            insereDados(matrizAdjacencia, Itaporanga, AreiaBranca, 0);
            insereDados(matrizAdjacencia, Itaporanga, Itaporanga, 0);
            insereDados(matrizAdjacencia, Itaporanga, Malhador, 0);
            insereDados(matrizAdjacencia, Itaporanga, MoitaBonita, 0);
            insereDados(matrizAdjacencia, Itaporanga, Itabaiana, 0);
            insereDados(matrizAdjacencia, Itaporanga, CampoDoBrito, 0);
            insereDados(matrizAdjacencia, Itaporanga, Macambira, 0);
            insereDados(matrizAdjacencia, Itaporanga, SaoDomingos, 0);
            insereDados(matrizAdjacencia, Itaporanga, Lagarto, 18.424);
            insereDados(matrizAdjacencia, Itaporanga, Ribeiropolis, 0);
            insereDados(matrizAdjacencia, Itaporanga, FreiPaulo, 0);
            insereDados(matrizAdjacencia, Itaporanga, Aparecida, 0);
            insereDados(matrizAdjacencia, Itaporanga, Carira, 0);
            insereDados(matrizAdjacencia, Itaporanga, Gloria, 0);
            insereDados(matrizAdjacencia, Itaporanga, MonteAlegre, 0);
            insereDados(matrizAdjacencia, Itaporanga, PocoRedondo, 0);
            
            //Areia Branca
            insereDados(matrizAdjacencia, AreiaBranca, Aracaju, 0);
            insereDados(matrizAdjacencia, AreiaBranca, BarraCoqueiros, 0);
            insereDados(matrizAdjacencia, AreiaBranca, Socorro, 4.56);
            insereDados(matrizAdjacencia, AreiaBranca, SaoCristovao, 0);
            insereDados(matrizAdjacencia, AreiaBranca, Laranjeiras, 1.44);
            insereDados(matrizAdjacencia, AreiaBranca, AreiaBranca, 0);
            insereDados(matrizAdjacencia, AreiaBranca, Itaporanga, 0);
            insereDados(matrizAdjacencia, AreiaBranca, Malhador, 0);
            insereDados(matrizAdjacencia, AreiaBranca, MoitaBonita, 0);
            insereDados(matrizAdjacencia, AreiaBranca, Itabaiana, 9.576);
            insereDados(matrizAdjacencia, AreiaBranca, CampoDoBrito, 0);
            insereDados(matrizAdjacencia, AreiaBranca, Macambira, 0);
            insereDados(matrizAdjacencia, AreiaBranca, SaoDomingos, 0);
            insereDados(matrizAdjacencia, AreiaBranca, Lagarto, 0);
            insereDados(matrizAdjacencia, AreiaBranca, Ribeiropolis, 0);
            insereDados(matrizAdjacencia, AreiaBranca, FreiPaulo, 0);
            insereDados(matrizAdjacencia, AreiaBranca, Aparecida, 0);
            insereDados(matrizAdjacencia, AreiaBranca, Carira, 0);
            insereDados(matrizAdjacencia, AreiaBranca, Gloria, 0);
            insereDados(matrizAdjacencia, AreiaBranca, MonteAlegre, 0);
            insereDados(matrizAdjacencia, AreiaBranca, PocoRedondo, 0);
            
            //Malhador
            insereDados(matrizAdjacencia, Malhador, Aracaju, 0);
            insereDados(matrizAdjacencia, Malhador, BarraCoqueiros, 0);
            insereDados(matrizAdjacencia, Malhador, Socorro, 0);
            insereDados(matrizAdjacencia, Malhador, SaoCristovao, 0);
            insereDados(matrizAdjacencia, Malhador, Laranjeiras, 0);
            insereDados(matrizAdjacencia, Malhador, AreiaBranca, 0);
            insereDados(matrizAdjacencia, Malhador, Itaporanga, 0);
            insereDados(matrizAdjacencia, Malhador, Malhador, 0);
            insereDados(matrizAdjacencia, Malhador, MoitaBonita, 1.512);
            insereDados(matrizAdjacencia, Malhador, Itabaiana, 0);
            insereDados(matrizAdjacencia, Malhador, CampoDoBrito, 0);
            insereDados(matrizAdjacencia, Malhador, Macambira, 0);
            insereDados(matrizAdjacencia, Malhador, SaoDomingos, 0);
            insereDados(matrizAdjacencia, Malhador, Lagarto, 0);
            insereDados(matrizAdjacencia, Malhador, Ribeiropolis, 0);
            insereDados(matrizAdjacencia, Malhador, FreiPaulo, 0);
            insereDados(matrizAdjacencia, Malhador, Aparecida, 0);
            insereDados(matrizAdjacencia, Malhador, Carira, 0);
            insereDados(matrizAdjacencia, Malhador, Gloria, 0);
            insereDados(matrizAdjacencia, Malhador, MonteAlegre, 0);
            insereDados(matrizAdjacencia, Malhador, PocoRedondo, 0);
            
            //Moita Bonita
            insereDados(matrizAdjacencia, MoitaBonita, Aracaju, 0);
            insereDados(matrizAdjacencia, MoitaBonita, BarraCoqueiros, 0);
            insereDados(matrizAdjacencia, MoitaBonita, Socorro, 0);
            insereDados(matrizAdjacencia, MoitaBonita, SaoCristovao, 0);
            insereDados(matrizAdjacencia, MoitaBonita, Laranjeiras, 0);
            insereDados(matrizAdjacencia, MoitaBonita, AreiaBranca, 0);
            insereDados(matrizAdjacencia, MoitaBonita, Itaporanga, 0);
            insereDados(matrizAdjacencia, MoitaBonita, Malhador, 1.512);
            insereDados(matrizAdjacencia, MoitaBonita, MoitaBonita, 0);
            insereDados(matrizAdjacencia, MoitaBonita, Itabaiana, 0.648);
            insereDados(matrizAdjacencia, MoitaBonita, CampoDoBrito, 0);
            insereDados(matrizAdjacencia, MoitaBonita, Macambira, 0);
            insereDados(matrizAdjacencia, MoitaBonita, SaoDomingos, 0);
            insereDados(matrizAdjacencia, MoitaBonita, Lagarto, 0);
            insereDados(matrizAdjacencia, MoitaBonita, Ribeiropolis, 3.696);
            insereDados(matrizAdjacencia, MoitaBonita, FreiPaulo, 0);
            insereDados(matrizAdjacencia, MoitaBonita, Aparecida, 0);
            insereDados(matrizAdjacencia, MoitaBonita, Carira, 0);
            insereDados(matrizAdjacencia, MoitaBonita, Gloria, 0);
            insereDados(matrizAdjacencia, MoitaBonita, MonteAlegre, 0);
            insereDados(matrizAdjacencia, MoitaBonita, PocoRedondo, 0);
            
            //Itabaiana
            insereDados(matrizAdjacencia, Itabaiana, Aracaju, 0);
            insereDados(matrizAdjacencia, Itabaiana, BarraCoqueiros, 0);
            insereDados(matrizAdjacencia, Itabaiana, Socorro, 0);
            insereDados(matrizAdjacencia, Itabaiana, SaoCristovao, 0);
            insereDados(matrizAdjacencia, Itabaiana, Laranjeiras, 0);
            insereDados(matrizAdjacencia, Itabaiana, AreiaBranca, 9.576);
            insereDados(matrizAdjacencia, Itabaiana, Itaporanga, 0);
            insereDados(matrizAdjacencia, Itabaiana, Malhador, 0);
            insereDados(matrizAdjacencia, Itabaiana, MoitaBonita, 0.648);
            insereDados(matrizAdjacencia, Itabaiana, Itabaiana, 0);
            insereDados(matrizAdjacencia, Itabaiana, CampoDoBrito, 2.8);
            insereDados(matrizAdjacencia, Itabaiana, Macambira, 4.032);
            insereDados(matrizAdjacencia, Itabaiana, SaoDomingos, 0);
            insereDados(matrizAdjacencia, Itabaiana, Lagarto, 0);
            insereDados(matrizAdjacencia, Itabaiana, Ribeiropolis, 0);
            insereDados(matrizAdjacencia, Itabaiana, FreiPaulo, 9.408);
            insereDados(matrizAdjacencia, Itabaiana, Aparecida, 0);
            insereDados(matrizAdjacencia, Itabaiana, Carira, 0);
            insereDados(matrizAdjacencia, Itabaiana, Gloria, 0);
            insereDados(matrizAdjacencia, Itabaiana, MonteAlegre, 0);
            insereDados(matrizAdjacencia, Itabaiana, PocoRedondo, 0);
            
            //Campo do Brito
            insereDados(matrizAdjacencia, CampoDoBrito, Aracaju, 0);
            insereDados(matrizAdjacencia, CampoDoBrito, BarraCoqueiros, 0);
            insereDados(matrizAdjacencia, CampoDoBrito, Socorro, 0);
            insereDados(matrizAdjacencia, CampoDoBrito, SaoCristovao, 0);
            insereDados(matrizAdjacencia, CampoDoBrito, Laranjeiras, 0);
            insereDados(matrizAdjacencia, CampoDoBrito, AreiaBranca, 0);
            insereDados(matrizAdjacencia, CampoDoBrito, Itaporanga, 0);
            insereDados(matrizAdjacencia, CampoDoBrito, Malhador, 0);
            insereDados(matrizAdjacencia, CampoDoBrito, MoitaBonita, 0);
            insereDados(matrizAdjacencia, CampoDoBrito, Itabaiana, 2.8);
            insereDados(matrizAdjacencia, CampoDoBrito, CampoDoBrito, 0);
            insereDados(matrizAdjacencia, CampoDoBrito, Macambira, 2.64);
            insereDados(matrizAdjacencia, CampoDoBrito, SaoDomingos, 2.184);
            insereDados(matrizAdjacencia, CampoDoBrito, Lagarto, 0);
            insereDados(matrizAdjacencia, CampoDoBrito, Ribeiropolis, 0);
            insereDados(matrizAdjacencia, CampoDoBrito, FreiPaulo, 0);
            insereDados(matrizAdjacencia, CampoDoBrito, Aparecida, 0);
            insereDados(matrizAdjacencia, CampoDoBrito, Carira, 0);
            insereDados(matrizAdjacencia, CampoDoBrito, Gloria, 0);
            insereDados(matrizAdjacencia, CampoDoBrito, MonteAlegre, 0);
            insereDados(matrizAdjacencia, CampoDoBrito, PocoRedondo, 0);
            
            //Macambira
            insereDados(matrizAdjacencia, Macambira, Aracaju, 0);
            insereDados(matrizAdjacencia, Macambira, BarraCoqueiros, 0);
            insereDados(matrizAdjacencia, Macambira, Socorro, 0);
            insereDados(matrizAdjacencia, Macambira, SaoCristovao, 0);
            insereDados(matrizAdjacencia, Macambira, Laranjeiras, 0);
            insereDados(matrizAdjacencia, Macambira, AreiaBranca, 0);
            insereDados(matrizAdjacencia, Macambira, Itaporanga, 0);
            insereDados(matrizAdjacencia, Macambira, Malhador, 0);
            insereDados(matrizAdjacencia, Macambira, MoitaBonita, 0);
            insereDados(matrizAdjacencia, Macambira, Itabaiana, 4.032);
            insereDados(matrizAdjacencia, Macambira, CampoDoBrito, 2.64);
            insereDados(matrizAdjacencia, Macambira, Macambira, 0);
            insereDados(matrizAdjacencia, Macambira, SaoDomingos, 1.44);
            insereDados(matrizAdjacencia, Macambira, Lagarto, 0);
            insereDados(matrizAdjacencia, Macambira, Ribeiropolis, 0);
            insereDados(matrizAdjacencia, Macambira, FreiPaulo, 0);
            insereDados(matrizAdjacencia, Macambira, Aparecida, 0);
            insereDados(matrizAdjacencia, Macambira, Carira, 0);
            insereDados(matrizAdjacencia, Macambira, Gloria, 0);
            insereDados(matrizAdjacencia, Macambira, MonteAlegre, 0);
            insereDados(matrizAdjacencia, Macambira, PocoRedondo, 0);
            
            //São Domingos
            insereDados(matrizAdjacencia, SaoDomingos, Aracaju, 0);
            insereDados(matrizAdjacencia, SaoDomingos, BarraCoqueiros, 0);
            insereDados(matrizAdjacencia, SaoDomingos, Socorro, 0);
            insereDados(matrizAdjacencia, SaoDomingos, SaoCristovao, 0);
            insereDados(matrizAdjacencia, SaoDomingos, Laranjeiras, 0);
            insereDados(matrizAdjacencia, SaoDomingos, AreiaBranca, 0);
            insereDados(matrizAdjacencia, SaoDomingos, Itaporanga, 0);
            insereDados(matrizAdjacencia, SaoDomingos, Malhador, 0);
            insereDados(matrizAdjacencia, SaoDomingos, MoitaBonita, 0);
            insereDados(matrizAdjacencia, SaoDomingos, Itabaiana, 0);
            insereDados(matrizAdjacencia, SaoDomingos, CampoDoBrito, 2.184);
            insereDados(matrizAdjacencia, SaoDomingos, Macambira, 1.44);
            insereDados(matrizAdjacencia, SaoDomingos, SaoDomingos, 0);
            insereDados(matrizAdjacencia, SaoDomingos, Lagarto, 0.792);
            insereDados(matrizAdjacencia, SaoDomingos, Ribeiropolis, 0);
            insereDados(matrizAdjacencia, SaoDomingos, FreiPaulo, 0);
            insereDados(matrizAdjacencia, SaoDomingos, Aparecida, 0);
            insereDados(matrizAdjacencia, SaoDomingos, Carira, 0);
            insereDados(matrizAdjacencia, SaoDomingos, Gloria, 0);
            insereDados(matrizAdjacencia, SaoDomingos, MonteAlegre, 0);
            insereDados(matrizAdjacencia, SaoDomingos, PocoRedondo, 0);
            
            //Lagarto
            insereDados(matrizAdjacencia, Lagarto, Aracaju, 0);
            insereDados(matrizAdjacencia, Lagarto, BarraCoqueiros, 0);
            insereDados(matrizAdjacencia, Lagarto, Socorro, 0);
            insereDados(matrizAdjacencia, Lagarto, SaoCristovao, 0);
            insereDados(matrizAdjacencia, Lagarto, Laranjeiras, 0);
            insereDados(matrizAdjacencia, Lagarto, AreiaBranca, 0);
            insereDados(matrizAdjacencia, Lagarto, Itaporanga, 18.424);
            insereDados(matrizAdjacencia, Lagarto, Malhador, 0);
            insereDados(matrizAdjacencia, Lagarto, MoitaBonita, 0);
            insereDados(matrizAdjacencia, Lagarto, Itabaiana, 0);
            insereDados(matrizAdjacencia, Lagarto, CampoDoBrito, 0);
            insereDados(matrizAdjacencia, Lagarto, Macambira, 0);
            insereDados(matrizAdjacencia, Lagarto, SaoDomingos, 0.792);
            insereDados(matrizAdjacencia, Lagarto, Lagarto, 0);
            insereDados(matrizAdjacencia, Lagarto, Ribeiropolis, 0);
            insereDados(matrizAdjacencia, Lagarto, FreiPaulo, 0);
            insereDados(matrizAdjacencia, Lagarto, Aparecida, 0);
            insereDados(matrizAdjacencia, Lagarto, Carira, 0);
            insereDados(matrizAdjacencia, Lagarto, Gloria, 0);
            insereDados(matrizAdjacencia, Lagarto, MonteAlegre, 0);
            insereDados(matrizAdjacencia, Lagarto, PocoRedondo, 0);
            
            //Ribeirópolis
            insereDados(matrizAdjacencia, Ribeiropolis, Aracaju, 0);
            insereDados(matrizAdjacencia, Ribeiropolis, BarraCoqueiros, 0);
            insereDados(matrizAdjacencia, Ribeiropolis, Socorro, 0);
            insereDados(matrizAdjacencia, Ribeiropolis, SaoCristovao, 0);
            insereDados(matrizAdjacencia, Ribeiropolis, Laranjeiras, 0);
            insereDados(matrizAdjacencia, Ribeiropolis, AreiaBranca, 0);
            insereDados(matrizAdjacencia, Ribeiropolis, Itaporanga, 0);
            insereDados(matrizAdjacencia, Ribeiropolis, Malhador, 0);
            insereDados(matrizAdjacencia, Ribeiropolis, MoitaBonita, 3.696);
            insereDados(matrizAdjacencia, Ribeiropolis, Itabaiana, 6.16);
            insereDados(matrizAdjacencia, Ribeiropolis, CampoDoBrito, 0);
            insereDados(matrizAdjacencia, Ribeiropolis, Macambira, 0);
            insereDados(matrizAdjacencia, Ribeiropolis, SaoDomingos, 0);
            insereDados(matrizAdjacencia, Ribeiropolis, Lagarto, 0);
            insereDados(matrizAdjacencia, Ribeiropolis, Ribeiropolis, 0);
            insereDados(matrizAdjacencia, Ribeiropolis, FreiPaulo, 3.456);
            insereDados(matrizAdjacencia, Ribeiropolis, Aparecida, 9.576);
            insereDados(matrizAdjacencia, Ribeiropolis, Carira, 0);
            insereDados(matrizAdjacencia, Ribeiropolis, Gloria, 0);
            insereDados(matrizAdjacencia, Ribeiropolis, MonteAlegre, 0);
            insereDados(matrizAdjacencia, Ribeiropolis, PocoRedondo, 0);
            
            //Frei Paulo
            insereDados(matrizAdjacencia, FreiPaulo, Aracaju, 0);
            insereDados(matrizAdjacencia, FreiPaulo, BarraCoqueiros, 0);
            insereDados(matrizAdjacencia, FreiPaulo, Socorro, 0);
            insereDados(matrizAdjacencia, FreiPaulo, SaoCristovao, 0);
            insereDados(matrizAdjacencia, FreiPaulo, Laranjeiras, 0);
            insereDados(matrizAdjacencia, FreiPaulo, AreiaBranca, 0);
            insereDados(matrizAdjacencia, FreiPaulo, Itaporanga, 0);
            insereDados(matrizAdjacencia, FreiPaulo, Malhador, 0);
            insereDados(matrizAdjacencia, FreiPaulo, MoitaBonita, 0);
            insereDados(matrizAdjacencia, FreiPaulo, Itabaiana, 0);
            insereDados(matrizAdjacencia, FreiPaulo, CampoDoBrito, 0);
            insereDados(matrizAdjacencia, FreiPaulo, Macambira, 0);
            insereDados(matrizAdjacencia, FreiPaulo, SaoDomingos, 0);
            insereDados(matrizAdjacencia, FreiPaulo, Lagarto, 0);
            insereDados(matrizAdjacencia, FreiPaulo, Ribeiropolis, 3.456);
            insereDados(matrizAdjacencia, FreiPaulo, FreiPaulo, 0);
            insereDados(matrizAdjacencia, FreiPaulo, Aparecida, 0.875);
            insereDados(matrizAdjacencia, FreiPaulo, Carira, 2.592);
            insereDados(matrizAdjacencia, FreiPaulo, Gloria, 0);
            insereDados(matrizAdjacencia, FreiPaulo, MonteAlegre, 0);
            insereDados(matrizAdjacencia, FreiPaulo, PocoRedondo, 0);
            
            //Nossa Senhora Aparecida
            insereDados(matrizAdjacencia, Aparecida, Aracaju, 0);
            insereDados(matrizAdjacencia, Aparecida, BarraCoqueiros, 0);
            insereDados(matrizAdjacencia, Aparecida, Socorro, 0);
            insereDados(matrizAdjacencia, Aparecida, SaoCristovao, 0);
            insereDados(matrizAdjacencia, Aparecida, Laranjeiras, 0);
            insereDados(matrizAdjacencia, Aparecida, AreiaBranca, 0);
            insereDados(matrizAdjacencia, Aparecida, Itaporanga, 0);
            insereDados(matrizAdjacencia, Aparecida, Malhador, 0);
            insereDados(matrizAdjacencia, Aparecida, MoitaBonita, 0);
            insereDados(matrizAdjacencia, Aparecida, Itabaiana, 0);
            insereDados(matrizAdjacencia, Aparecida, CampoDoBrito, 0);
            insereDados(matrizAdjacencia, Aparecida, Macambira, 0);
            insereDados(matrizAdjacencia, Aparecida, SaoDomingos, 0);
            insereDados(matrizAdjacencia, Aparecida, Lagarto, 0);
            insereDados(matrizAdjacencia, Aparecida, Ribeiropolis, 9.576);
            insereDados(matrizAdjacencia, Aparecida, FreiPaulo, 0.875);
            insereDados(matrizAdjacencia, Aparecida, Aparecida, 0);
            insereDados(matrizAdjacencia, Aparecida, Carira, 0);
            insereDados(matrizAdjacencia, Aparecida, Gloria, 3.08);
            insereDados(matrizAdjacencia, Aparecida, MonteAlegre, 0);
            insereDados(matrizAdjacencia, Aparecida, PocoRedondo, 0);
            
            //Carira
            insereDados(matrizAdjacencia, Carira, Aracaju, 0);
            insereDados(matrizAdjacencia, Carira, BarraCoqueiros, 0);
            insereDados(matrizAdjacencia, Carira, Socorro, 0);
            insereDados(matrizAdjacencia, Carira, SaoCristovao, 0);
            insereDados(matrizAdjacencia, Carira, Laranjeiras, 0);
            insereDados(matrizAdjacencia, Carira, AreiaBranca, 0);
            insereDados(matrizAdjacencia, Carira, Itaporanga, 0);
            insereDados(matrizAdjacencia, Carira, Malhador, 0);
            insereDados(matrizAdjacencia, Carira, MoitaBonita, 0);
            insereDados(matrizAdjacencia, Carira, Itabaiana, 0);
            insereDados(matrizAdjacencia, Carira, CampoDoBrito, 0);
            insereDados(matrizAdjacencia, Carira, Macambira, 0);
            insereDados(matrizAdjacencia, Carira, SaoDomingos, 0);
            insereDados(matrizAdjacencia, Carira, Lagarto, 0);
            insereDados(matrizAdjacencia, Carira, Ribeiropolis, 0);
            insereDados(matrizAdjacencia, Carira, FreiPaulo, 2.592);
            insereDados(matrizAdjacencia, Carira, Aparecida, 0);
            insereDados(matrizAdjacencia, Carira, Carira, 0);
            insereDados(matrizAdjacencia, Carira, Gloria, 16.128);
            insereDados(matrizAdjacencia, Carira, MonteAlegre, 0);
            insereDados(matrizAdjacencia, Carira, PocoRedondo, 0);
            
            //Gloria
            insereDados(matrizAdjacencia, Gloria, Aracaju, 0);
            insereDados(matrizAdjacencia, Gloria, BarraCoqueiros, 0);
            insereDados(matrizAdjacencia, Gloria, Socorro, 0);
            insereDados(matrizAdjacencia, Gloria, SaoCristovao, 0);
            insereDados(matrizAdjacencia, Gloria, Laranjeiras, 0);
            insereDados(matrizAdjacencia, Gloria, AreiaBranca, 0);
            insereDados(matrizAdjacencia, Gloria, Itaporanga, 0);
            insereDados(matrizAdjacencia, Gloria, Malhador, 0);
            insereDados(matrizAdjacencia, Gloria, MoitaBonita, 0);
            insereDados(matrizAdjacencia, Gloria, Itabaiana, 0);
            insereDados(matrizAdjacencia, Gloria, CampoDoBrito, 0);
            insereDados(matrizAdjacencia, Gloria, Macambira, 0);
            insereDados(matrizAdjacencia, Gloria, SaoDomingos, 0);
            insereDados(matrizAdjacencia, Gloria, Lagarto, 0);
            insereDados(matrizAdjacencia, Gloria, Ribeiropolis, 0);
            insereDados(matrizAdjacencia, Gloria, FreiPaulo, 0);
            insereDados(matrizAdjacencia, Gloria, Aparecida, 3.08);
            insereDados(matrizAdjacencia, Gloria, Carira, 16.128);
            insereDados(matrizAdjacencia, Gloria, Gloria, 0);
            insereDados(matrizAdjacencia, Gloria, MonteAlegre, 0);
            insereDados(matrizAdjacencia, Gloria, PocoRedondo, 0);
            
            //Monte Alegre
            insereDados(matrizAdjacencia, MonteAlegre, Aracaju, 0);
            insereDados(matrizAdjacencia, MonteAlegre, BarraCoqueiros, 0);
            insereDados(matrizAdjacencia, MonteAlegre, Socorro, 0);
            insereDados(matrizAdjacencia, MonteAlegre, SaoCristovao, 0);
            insereDados(matrizAdjacencia, MonteAlegre, Laranjeiras, 0);
            insereDados(matrizAdjacencia, MonteAlegre, AreiaBranca, 0);
            insereDados(matrizAdjacencia, MonteAlegre, Itaporanga, 0);
            insereDados(matrizAdjacencia, MonteAlegre, Malhador, 0);
            insereDados(matrizAdjacencia, MonteAlegre, MoitaBonita, 0);
            insereDados(matrizAdjacencia, MonteAlegre, Itabaiana, 0);
            insereDados(matrizAdjacencia, MonteAlegre, CampoDoBrito, 0);
            insereDados(matrizAdjacencia, MonteAlegre, Macambira, 0);
            insereDados(matrizAdjacencia, MonteAlegre, SaoDomingos, 0);
            insereDados(matrizAdjacencia, MonteAlegre, Lagarto, 0);
            insereDados(matrizAdjacencia, MonteAlegre, Ribeiropolis, 0);
            insereDados(matrizAdjacencia, MonteAlegre, FreiPaulo, 0);
            insereDados(matrizAdjacencia, MonteAlegre, Aparecida, 0);
            insereDados(matrizAdjacencia, MonteAlegre, Carira, 0);
            insereDados(matrizAdjacencia, MonteAlegre, Gloria, 1.344);
            insereDados(matrizAdjacencia, MonteAlegre, MonteAlegre, 0);
            insereDados(matrizAdjacencia, MonteAlegre, PocoRedondo, 0);
            
            //Poço Redondo
            insereDados(matrizAdjacencia, PocoRedondo, Aracaju, 0);
            insereDados(matrizAdjacencia, PocoRedondo, BarraCoqueiros, 0);
            insereDados(matrizAdjacencia, PocoRedondo, Socorro, 0);
            insereDados(matrizAdjacencia, PocoRedondo, SaoCristovao, 0);
            insereDados(matrizAdjacencia, PocoRedondo, Laranjeiras, 0);
            insereDados(matrizAdjacencia, PocoRedondo, AreiaBranca, 0);
            insereDados(matrizAdjacencia, PocoRedondo, Itaporanga, 0);
            insereDados(matrizAdjacencia, PocoRedondo, Malhador, 0);
            insereDados(matrizAdjacencia, PocoRedondo, MoitaBonita, 0);
            insereDados(matrizAdjacencia, PocoRedondo, Itabaiana, 0);
            insereDados(matrizAdjacencia, PocoRedondo, CampoDoBrito, 0);
            insereDados(matrizAdjacencia, PocoRedondo, Macambira, 0);
            insereDados(matrizAdjacencia, PocoRedondo, SaoDomingos, 0);
            insereDados(matrizAdjacencia, PocoRedondo, Lagarto, 0);
            insereDados(matrizAdjacencia, PocoRedondo, Ribeiropolis, 0);
            insereDados(matrizAdjacencia, PocoRedondo, FreiPaulo, 0);
            insereDados(matrizAdjacencia, PocoRedondo, Aparecida, 0);
            insereDados(matrizAdjacencia, PocoRedondo, Carira, 0);
            insereDados(matrizAdjacencia, PocoRedondo, Gloria, 0);
            insereDados(matrizAdjacencia, PocoRedondo, MonteAlegre, 14.616);
            insereDados(matrizAdjacencia, PocoRedondo, PocoRedondo, 0);
            
            return matrizAdjacencia;
        }
}

