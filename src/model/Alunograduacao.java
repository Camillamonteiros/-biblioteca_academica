// Declaração que a classe está no pacote "model"
package model;

// Criando uma classe chamada AlunoGraduacao que herda da classe Aluno
// Herda os atributos nome e matrícula, e o método solicitarLivro
// Adiciona dois atributos específicos: curso e semestre
public class AlunoGraduacao extends Aluno {

    // Atributos específicos da graduação
    protected String curso;
    protected int semestre;

    // Construtor da classe AlunoGraduacao
    // Usa super(nome, matricula) para aproveitar o construtor da classe pai (Aluno)
    public AlunoGraduacao(String nome, String matricula, String curso, int semestre) {
        super(nome, matricula); // Chama o construtor da superclasse (Aluno)
        this.curso = curso;     // Inicializa o atributo curso
        this.semestre = semestre; // Inicializa o atributo semestre
    }

    // Sobrescreve o método solicitarLivro para personalizar a mensagem
    @Override
    public void solicitarLivro(String titulo) {
        System.out.println("Aluno de Graduação solicitou o livro: " + titulo);
    }
    @Override
    public String toString() {
        return "AlunoGraduacao{" + "nome='" + nome + "', curso='" + curso + "', semestre=" + semestre + "}";
    }
}

