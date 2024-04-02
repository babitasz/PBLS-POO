public class Midia {
    protected String genero;
    protected int relevancia;
    protected int classificacao_Indicativa;
    protected String elenco;
    protected String duracao;
    protected String lingua_Disponivel;
    protected String legenda_Disponivel;
    protected String nome;
    protected String classificacao_popularidade;
    protected int ano_Lancamento;


    public Midia(String genero, int relevancia, int classificacao_indicativa,
                  String lingua_disponivel, String legenda_disponivel,
                  String duracao, String nome,
                  String classificacao_popularidade, String elenco,
                  int ano_de_lancamento) {

        this.genero = genero;
        this.relevancia = relevancia;
        this.classificacao_Indicativa = classificacao_indicativa;
        this.lingua_Disponivel = lingua_disponivel;
        this.legenda_Disponivel = legenda_disponivel;
        this.duracao = duracao;
        this.nome = nome;
        this.classificacao_popularidade = classificacao_popularidade;
        this.elenco = elenco;
        this.ano_Lancamento = ano_de_lancamento;
    }

    public String getGenero() {
        return genero;
    }

    public int getRelevancia() {
        return relevancia;
    }

    public int getClassificacaoIndicativa() {
        return classificacao_Indicativa;
    }

    public String getLinguaDisponivel() {
        return lingua_Disponivel;
    }

    public String getLegendaDisponivel() {
        return legenda_Disponivel;
    }

    public String getDuracao() {
        return duracao;
    }

    public String getNomeDoFilme() {
        return nome;
    }

    public String getClassificacaoRankingPopularidade() {
        return classificacao_popularidade;
    }

    public String getElenco() {
        return elenco;
    }

    public int getAnoDeLancamento() {
        return ano_Lancamento;
    }

    public void dar_play(){
        System.out.println("Vídeo está passando 😘❤️");
    }

    public void pausar(){
        System.out.println("Vídeo pausado");
    }

    public void adicionar_Favoritos(){
        System.out.println("Adicionado aos favoritos!");
    }
}