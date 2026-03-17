public class TestaAcademico {

    public static void main(String[] args) {

        // Criando alunos (independentes)
        Aluno a1 = new Aluno(1, "João", "12345", "Ciência da Computação");
        Aluno a2 = new Aluno(2, "Maria", "67890", "Ciência da Computação");

        // Criando disciplina
        Disciplina d = new Disciplina(1, "Programação Orientada a Objetos", "Prof. Carlos");

        // Agregação
        d.matricularAluno(a1);
        d.matricularAluno(a2);

        // Composição (avaliacao nasce na disciplina)
        d.criarAvaliacao(1, "Prova Semestral");

        // Pegando a avaliação criada
        Avaliacao av = d.getAvaliacoes().get(0);

        // Composição aninhada (questões dentro da avaliação)
        av.adicionarQuestao(1, "Explique o que é POO", 3.0f);
        av.adicionarQuestao(2, "Diferença entre agregação e composição", 3.5f);
        av.adicionarQuestao(3, "Explique encapsulamento", 3.5f);

        // Imprimindo a estrutura completa
        System.out.println(d);
    }
}