
public class Main {
    public static void main(String[] args) {
        Ebook ebook1 = new Ebook("Baleias azuis deveriam usar fones de ouvido?", "Juliano Reis", "Esse é um livro sobre o uso de fones de ouvido em baleias e suas consequências", "Biologia");
        Ebook ebook2 = new Ebook("O Senhor dos Anéis", "J.R.R. Tolkien", "Uma saga épica que se passa na Terra Média", "Fantasia");
        Ebook ebook3 = new Ebook("O Código Da Vinci", "Dan Brown", "Um thriller que mistura arte, religião e simbologia", "Suspense");

        VideoDigital video1 = new VideoDigital("Introdução à Inteligência Artificial", "Universidade X", 60, "Uma introdução básica aos conceitos de IA");
        VideoDigital video2 = new VideoDigital("História da Arte Moderna", "Prof. Y", 90, "Um panorama das principais correntes artísticas do século XX");
        VideoDigital video3 = new VideoDigital("Como Cozinhar um Bolo", "Chef Z", 45, "Um tutorial passo a passo para fazer um delicioso bolo de chocolate");

        ebook1.mostrarDescricao();
        video2.mostrarDescricao();
        ebook3.baixar();
        video1.visualizar();

    }
}