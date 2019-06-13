package custouniformeempresa;

/**
 *
 * @author Vanessa
 */
public class Vertice implements Comparable<Vertice> {
    
    private String cidade;
    private Vertice pai;
    private boolean wasVisited;
    private boolean isFinal;
    private int posicao;
    private double custoVertice;
    private int tipoServico;
    
    public Vertice (String cidade, int posicao){
        this.cidade = cidade;
        this.pai = null;
        this.wasVisited = false;
        this.isFinal = false;
        this.posicao = posicao;
        this.custoVertice = 0.0;
        this.tipoServico = 0;
    }
    
    public Vertice(){
        
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Vertice getPai() {
        return pai;
    }

    public void setPai(Vertice pai) {
        this.pai = pai;
    }

    public boolean isWasVisited() {
        return wasVisited;
    }

    public void setWasVisited(boolean wasVisited) {
        this.wasVisited = wasVisited;
    }

    public boolean isIsFinal() {
        return isFinal;
    }

    public void setIsFinal(boolean isFinal) {
        this.isFinal = isFinal;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public double getCustoVertice() {
        return custoVertice;
    }

    public void setCustoVertice(double custoVertice) {
        this.custoVertice = custoVertice;
    }

    public int getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(int tipoServico) {
        this.tipoServico = tipoServico;
    }
    
    @Override
    public String toString() {
        return "[" + cidade.toUpperCase() + "] ";
    }
     
    @Override
    public int compareTo (Vertice vertice){
        if(this.getCustoVertice() < vertice.getCustoVertice()){
            return -1;
        }
        if(this.getCustoVertice() > vertice.getCustoVertice()){
            return 1;
        }
        return 0;
    }
        
}
