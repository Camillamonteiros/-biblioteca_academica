// Declaração que a classe está no pacote "model"
package model;

// Criando uma classe chamada AlunoEnsinoMedio que herda da classe Aluno
// Herda os atributos nome e matrícula, e o método solicitarLivro
// Adiciona dois atributos específicos: série e turno
public class AlunoEnsinoMedio extends Aluno {

    // Atributos específicos do aluno do ensino médio
    private int serie;
    private String turno;

    // Construtor da classe AlunoEnsinoMedio
    // Chama o construtor da superclasse Aluno com super(nome, matricula)
    public AlunoEnsinoMedio(String nome, String matricula, int serie, String turno) {
        super(nome, matricula);
        this.serie = serie;
        this.turno = turno;
    }

    // Sobrescreve o método solicitarLivro para personalizar a mensagem
    @Override
    public void solicitarLivro(String titulo) {
        System.out.println("Aluno de Ensino Médio solicitou o livro: " + titulo);
    }
}

