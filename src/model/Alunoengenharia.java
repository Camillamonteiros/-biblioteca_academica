package model;


// Criando uma classe chamada AlunoEngenharia que herda da classe AlunoGraduacao
public class AlunoEngenharia extends AlunoGraduacao {
    // Construtor recebe nome, matrícula e semestre
    public AlunoEngenharia(String nome, String matricula, int semestre) { 
        // Chama o construtor da superclasse com o curso fixo "Engenharia"
        super(nome, matricula, "Engenharia", semestre);
    }

    // Sobrescreve o método solicitarLivro
    @Override
    public void solicitarLivro(String titulo) {
        System.out.println("Aluno de Engenharia solicitou o livro: " + titulo + ". Tem prioridade em materiais técnicos.");
    }
}
