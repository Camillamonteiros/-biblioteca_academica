package model;

// Classe Revista herda de ItemBiblioteca
public class Revista extends ItemBiblioteca {

    // Construtor que inicializa os atributos titulo e codigo
    public Revista(String titulo, String codigo) {
        super(titulo, codigo);
    }

     // Sobrescreve o método avaliar
    @Override
    public void avaliar() {
        System.out.println("Revista \"" + titulo + "\" recebeu sua avaliação. Obrigado!");
    }
}