import java.util.ArrayList;

public class Avaliacao {

    private int id;
    private String nome;
    private ArrayList<Questao> questoes;

    public Avaliacao(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.questoes = new ArrayList<>();
    }

    public void adicionarQuestao(int num, String texto, float peso) {
        Questao q = new Questao(num, texto, peso);
        questoes.add(q);
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Questao> getQuestoes() {
        return questoes;
    }

    @Override
    public String toString() {
        return "\nAvaliacao{id=" + id + ", nome='" + nome + "', questoes=" + questoes + "}";
    }
}