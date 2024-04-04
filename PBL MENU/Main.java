//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        Cliente clienteSemCadastro = new Cliente();
        Cliente cliente1 = new Cliente(2, "Bárbara, Luana", "Premium", "luaninha@gmail.com", "amogatos!2326", "41991468348", "TV Samsung XLK34", "Cartão de crédito", "Ru Pauls Drag Race, Mean Girls", "Carros, Carros 2" );

        Serie serie = new Serie("infantil", 12, 10, "PT-BR, EN", "PT-BR", "75 Horas", "Chiquititas", "Em alta", "Evelyn, João", 2010, 35, 10, 3, "A fuga da Evelyn");

        Midia midia = new Midia("Ação", 72, 14, "Inglês, Português, Espanhol, Italiano, Francês, Coreano, Japonês, Mandarim, Alemão, Russo", "Inglês(CC), Português, Espanhol, Italiano, Francês, Coreano, Japonês, Mandarim, Alemão, Russo", "1h44min", "Velozes e Furiosos: Desafio em Tóquio", "Muito Popular", "Lucas Black, Sung Kang, Brian Tee, Nathalie Kelley, Bow Wow", 2006);

        serie.dar_play();


    }
}