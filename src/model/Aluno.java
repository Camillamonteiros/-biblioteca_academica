//declaração que a classe esta no pacote model 
package model;

// 'protected' permitem que subclasses acessem estes atributos 
// cria aquilo que todos os alunos irão ter em comum (atributo nome e matrícula) 
public class Aluno {
    protected String nome;       
    protected String matricula;  
    
    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

//mensagem informando que aluno solicitou um livro
//metodo solicitarLivro
    public void solicitarLivro(String titulo) {
        System.out.println("Aluno solicitou o livro: " + titulo + ".");
    }

//metodo que faz com que aluno avalie o Item da biblioteca
    public void avaliarItem(ItemBiblioteca item) {
        System.out.print(nome + " avaliando: ");
        item.avaliar();  
    }
 // Sobrescreve  o método toString para exibir uma representação textual clara do objeto
    @Override
    public String toString() {
        return "Aluno{" +"nome='" + nome + '\'' + ", matricula='" + matricula + '\'' +'}';
    }
    // Sobrescreve o método equals para comparar dois alunos com base na matrícula
    @Override
    public boolean equals(Object obj) {
        // Verifica se os objetos são a mesma instância
        if (this == obj) return true;

        // Verifica se o objeto é nulo ou de uma classe diferente
        if (obj == null || getClass() != obj.getClass()) return false;

        // Compara as matrículas
        Aluno aluno = (Aluno) obj;
        return this.matricula.equals(aluno.matricula);
    }
}
