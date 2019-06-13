package custouniformeempresa;

import java.util.PriorityQueue;

/**
 *
 * @author Vanessa
 */
public class CustoUniformeEmpresa extends Vertice implements Comparable<Vertice>{
    
    protected static double [][] matrizAdjacencia;
    protected static Vertice[] vertices;
    
    public CustoUniformeEmpresa(){
        vertices = Dados.carregarVertices();
        matrizAdjacencia = Dados.iniciaMatriz(vertices.length);
    }
    
    public Vertice CustoUniformeEmpresa(int origem, int destino){
        PriorityQueue<Vertice> fila = new PriorityQueue<Vertice>();
        vertices[destino].setIsFinal(true);
        vertices[origem].setWasVisited(true);
        fila.add(vertices[origem]);
        
        while(!fila.isEmpty()){
            
            Vertice verticePai = fila.remove();
            
            if(verticePai.isIsFinal() == vertices[destino].isIsFinal())
                return verticePai;
            
            for(int verticeAtual = 0; verticeAtual < matrizAdjacencia.length; verticeAtual++){
                if((matrizAdjacencia[verticePai.getPosicao()][verticeAtual] != 0) &&
                (vertices[verticeAtual].isWasVisited() == false)){
                    
                    vertices[verticeAtual].setCustoVertice(verticePai.getCustoVertice() +
                    matrizAdjacencia[verticePai.getPosicao()][verticeAtual]);
                    
                    vertices[verticeAtual].setPai(vertices[verticePai.getPosicao()]);
                    
                    vertices[verticeAtual].setWasVisited(true);
                    
                    fila.add(vertices[verticeAtual]);
                }
            }
        }
        return null;
    }
}
