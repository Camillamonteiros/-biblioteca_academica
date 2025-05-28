// Teste.java – Demonstração da Etapa 3: toString() e equals()

import model.*;

public class Teste {
    public static void main(String[] args) {
        // Instanciando alunos com mesmo estado
        AlunoGraduacao aluno1 = new AlunoGraduacao("Lucas", "A123", "Administração", 3);
        AlunoGraduacao aluno2 = new AlunoGraduacao("Lucas", "A123", "Administração", 3);

        // Instanciando aluno com estado diferente
        AlunoGraduacao aluno3 = new AlunoGraduacao("Marina", "B456", "Biologia", 2);

        // Comparações usando equals()
        System.out.println("aluno1.equals(aluno2)? " + aluno1.equals(aluno2)); // true
        System.out.println("aluno1.equals(aluno3)? " + aluno1.equals(aluno3)); // false

        // Exibindo com toString()
        System.out.println("\nRepresentações dos alunos:");
        System.out.println(aluno1);
        System.out.println(aluno2);
        System.out.println(aluno3);
    }
}