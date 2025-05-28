package model;

// Classe Livro herda de ItemBiblioteca
public class Livro extends  ItemBiblioteca{ 
    // Construtor que inicializa os atributos titulo e codigo
    public Livro (String titulo, String codigo){
        super(titulo, codigo);
    }


    // Sobrescreve o método avaliar para personalizar a mensagem
    @Override
    public void avaliar() {
        System.out.println("Livro \"" + titulo + "\" avaliado com sucesso. Obrigado pela contribuição!");
    }

    //sobrescreve o metodo Tostring para uma declaração clara
    @Override
    public String toString() {
        return "Livro{" + "titulo='" + titulo + "', codigo='" + codigo + "'}";
    }

}
