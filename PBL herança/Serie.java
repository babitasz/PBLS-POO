public class Serie extends Midia {

    private int quantidade_de_episodio;
    private int quantidade_de_temporadas;
    private int numero_do_episodio;
    private String nome_do_episodio;


    public Serie(String genero, int relevancia, int classificacao_indicativa,
                 String lingua_disponivel, String legenda_disponivel,
                 String duracao, String nome,
                 String classificacao_popularidade, String elenco,
                 int ano_Lancamento,int quantidade_de_episodio, int quantidade_de_temporadas, int numero_do_episodio, String nome_do_episodio) {
        super(genero, relevancia, classificacao_indicativa, lingua_disponivel, legenda_disponivel,duracao, nome,classificacao_popularidade, elenco,ano_Lancamento);
        this.quantidade_de_episodio = quantidade_de_episodio;
        this.quantidade_de_temporadas = quantidade_de_temporadas;
        this.numero_do_episodio = numero_do_episodio;
        this.nome_do_episodio = nome_do_episodio;
    }

    public int getQuantidadeDeEpisodio() {
        return quantidade_de_episodio;
    }

    public int getQuantidadeDeTemporadas() {
        return quantidade_de_temporadas;
    }


    public int getNumeroDoEpisodio() {
        return numero_do_episodio;
    }

    public String getNomeDoEpisodio() {
        return nome_do_episodio;
    }

}