public class VideoDigital extends  ItemBibliotecaDigital implements Visualizavel{
    private int duracaoEmMinutos;
    private String descricao;

    public VideoDigital(String titulo, String autor, int duracaoEmMinutos, String descricao){
        super(titulo, autor);
        this.duracaoEmMinutos = duracaoEmMinutos;
        this.descricao = descricao;
    }

    @Override
    public void mostrarDescricao() {
        System.out.println(descricao);
    }

    @Override
    public void visualizar() {
        System.out.println("O vídeo " + titulo + "está passando");
        System.out.println("Seu vídeo terminou!");
    }
}
