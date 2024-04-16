public class Ebook extends ItemBibliotecaDigital implements Baixavel{
    private String descricao;
    private String genero;

    public Ebook(String titulo, String autor, String descricao, String genero){
        super(titulo,autor);
        this.descricao = descricao;
        this.genero = genero;
    }

    @Override
    public void mostrarDescricao() {
        System.out.println(descricao);
    }

    @Override
    public void baixar() {
        System.out.println("O Ebook " + titulo + "está sendo baixado...");
        System.out.println(titulo + "foi baixado com sucesso!");
    }
}
