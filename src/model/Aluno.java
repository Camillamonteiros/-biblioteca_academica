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
        System.out.println("Aluno solicitou o livro: " + titulo);
    }

    public void avaliarItem(ItemBiblioteca item) {
        System.out.print(nome + " avaliando: ");
        item.avaliar();  
    }

}
