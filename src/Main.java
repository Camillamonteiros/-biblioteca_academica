import model.*;

public class Main {
    public static void main(String[] args) {
        AlunoEnsinoMedio alunoEM = new AlunoEnsinoMedio("Camilla", "CM123", 2, "Manhã");
        AlunoEngenharia alunoEng = new AlunoEngenharia("Yago", "YP456", 5);
        AlunoDireito alunoDir = new AlunoDireito("Mateus", "MH789", 6);
        AlunoGraduacao alunoGrad = new AlunoGraduacao("Julia", "JM000", "História", 4);

        alunoEM.solicitarLivro("Memórias Póstumas de Brás Cubas");
        alunoEng.solicitarLivro("Contenções: teoria e aplicações em obras");
        alunoDir.solicitarLivro("Manual de Direito Processual do Trabalho");
        alunoGrad.solicitarLivro("História do Brasil");
    }
}
