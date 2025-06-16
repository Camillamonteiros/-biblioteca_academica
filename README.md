📚 Sistema de Biblioteca Acadêmica

**Disciplina:** Programação Orientada a Objetos Java

**Turma:** 3002 – Prof. Kleber de Aguiar

**Alunos:** Camilla Aparecida Monteiro Soares, Mateus Henrique de Sousa Nogueira e Yago Possidonio Passos.

**Data de entrega:** 02/06/2025

📌 Descrição do Projeto
Este projeto é um sistema de simulação de uma Biblioteca Acadêmica, desenvolvido no contexto da disciplina de Programação Orientada a Objetos em Java (Estácio de Sá). O objetivo principal foi aplicar conceitos fundamentais de POO como herança, polimorfismo, sobrescrita de métodos, e a utilização dos métodos da classe Object.

✅ Etapas Implementadas

🧬 Etapa 1: Herança e Sobrescrita
Criação da superclasse Aluno com atributos comuns (nome, matrícula) e métodos básicos.

Implementação de subclasses:

AlunoEnsinoMedio

AlunoGraduacao

AlunoEngenharia (herda de AlunoGraduacao)

AlunoDireito (herda de AlunoGraduacao)

Sobrescrita do método solicitarLivro() de forma personalizada em cada subclasse.

🔄 Etapa 2: Polimorfismo e Composição
Criação da superclasse ItemBiblioteca e das subclasses Livro e Revista.

Utilização de composição: alunos avaliam itens da biblioteca através do método avaliarItem(ItemBiblioteca item).

Demonstração do polimorfismo com chamadas polimórficas ao método avaliar().

🧠 Etapa 3: Métodos da classe Object
Sobrescrita dos métodos toString() e equals() na classe Aluno.

Testes realizados para comparar objetos e exibir suas representações textuais no console.

💡 Extras
Utilização de herança multinível entre Aluno, AlunoGraduacao, AlunoEngenharia/AlunoDireito.

Reaproveitamento de código e boas práticas de encapsulamento e sobrescrita.

Organização por pacotes: todas as classes estão no pacote model.

🧪 Arquivos de Demonstração
Main.java: demonstração das Etapas 1 e 2 com criação de alunos e avaliação de itens.

Teste.java: demonstração da Etapa 3 com toString() e equals().

🚀 Como Executar
Compile todos os arquivos com um compilador Java (por exemplo, via terminal com javac).

Execute Main para ver o funcionamento geral do sistema.

Execute Teste para visualizar os testes dos métodos equals() e toString().
