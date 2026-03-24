import java.util.ArrayList;

class Apartamento {
    private int numero;
    private int andar;

    public Apartamento(int numero, int andar) {
        this.numero = numero;
        this.andar = andar;
    }

    @Override
    public String toString() {
        return "Apt " + numero + " - Andar " + andar;
    }
}

class Edificio {
    private String nome;
    private String endereco;
    private ArrayList<Apartamento> apartamentos = new ArrayList<>();

    public Edificio(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void construirApartamento(int num, int andar) {
        Apartamento apt = new Apartamento(num, andar);
        apartamentos.add(apt);
        System.out.println("Apartamento " + num + " construído.");
    }

    @Override
    public String toString() {
        return nome + " | Apartamentos: " + apartamentos.size();
    }
}

public class apartamentos {
    public static void main(String[] args) {
        Edificio e = new Edificio("Residencial Sol Nascente", "Av. Brasil, 1234");
        e.construirApartamento(101, 1);
        e.construirApartamento(502, 5);
        e.construirApartamento(803, 8);

        System.out.println(e);
    }
}