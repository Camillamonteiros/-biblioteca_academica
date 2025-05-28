// Main.java – Demonstração das Etapas 1 e 2: Herança e Polimorfismo

import model.*;

public class Main {
    public static void main(String[] args) {
        //Criação de objetos Aluno de diferentes tipos (Etapa 1)
        AlunoEnsinoMedio alunoEM = new AlunoEnsinoMedio("Camilla", "CM123", 2, "Manhã");
        AlunoEngenharia alunoEng = new AlunoEngenharia("Yago", "YP456", 5);
        AlunoDireito alunoDir = new AlunoDireito("Mateus", "MH789", 6);
        AlunoGraduacao alunoGrad = new AlunoGraduacao("Julia", "JM000", "História", 4);

        // Solicitações de livros (Etapa 1)
        alunoEM.solicitarLivro("Memórias Póstumas de Brás Cubas");
        alunoEng.solicitarLivro("Java: Como Programar");
        alunoDir.solicitarLivro("Manual de Direito Processual do Trabalho");
        alunoGrad.solicitarLivro("História do Brasil");

        System.out.println("\n--- Avaliações de Itens da Biblioteca ---");

        // Itens da biblioteca (Etapa 2)
        ItemBiblioteca livro = new Livro("Java: Como Programar", "L001");
        ItemBiblioteca revista = new Revista("Revista Ciência Hoje", "R001");

        // Chamada do método avaliarItem de cada aluno usando polimorfismo
        alunoEM.avaliarItem(livro);
        alunoEng.avaliarItem(revista);
        alunoDir.avaliarItem(livro);
        alunoGrad.avaliarItem(revista);
    }
}