// Declaração que a classe está no pacote "model"
package model;

// Criando uma classe chamada AlunoDireito que herda da classe AlunoGraduacao
public class AlunoDireito extends AlunoGraduacao{
    public AlunoDireito(String nome, String matricula, int semestre){
        super(nome, matricula, "Direito", semestre);
    }

    @Override
    public void solicitarLivro(String titulo){
        System.out.println("Aluno de Direito solicitou o livro: " + titulo + ". O mesmo tem prioridade em obras jurídicas");
    }
}