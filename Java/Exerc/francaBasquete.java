import java.util.ArrayList;

class Atleta {
    private int id;
    private String nome;
    private String posicao;

    public Atleta(int id, String nome, String posicao) {
        this.id = id;
        this.nome = nome;
        this.posicao = posicao;
    }

    @Override
    public String toString() {
        return nome + " (" + posicao + ")";
    }
}

class Time {
    private int id;
    private String nome;
    private String tecnico;
    private ArrayList<Atleta> atletas = new ArrayList<>();

    public Time(int id, String nome, String tecnico) {
        this.id = id;
        this.nome = nome;
        this.tecnico = tecnico;
    }

    public void contratarAtleta(Atleta a) {
        atletas.add(a);
        System.out.println(a + " contratado pelo " + nome);
    }

    public ArrayList<Atleta> getAtletas() {
        return new ArrayList<>(atletas); // cópia defensiva
    }

    @Override
    public String toString() {
        return "Time: " + nome + " | Técnico: " + tecnico + " | Jogadores: " + atletas.size();
    }
}

public class francaBasquete {
    public static void main(String[] args) {
        Atleta a1 = new Atleta(1, "Lucas Dias", "Ala");
        Atleta a2 = new Atleta(2, "David Jackson", "Armador");

        Time franca = new Time(1, "Franca Basquete", "Helinho");

        franca.contratarAtleta(a1);
        franca.contratarAtleta(a2);

        System.out.println("\nAntes de anular o time:");
        System.out.println(franca);

        // Prova de Agregação: o Time é anulado, mas os Atletas continuam existindo
        franca = null;

        System.out.println("\nDepois de anular o time:");
        System.out.println("Atleta 1 ainda existe: " + a1);
        System.out.println("Atleta 2 ainda existe: " + a2);
    }
}