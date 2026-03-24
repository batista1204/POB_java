import java.util.ArrayList;

class Programador {
    private int id;
    private String nome;
    private String linguagemPrincipal;

    public Programador(int id, String nome, String linguagemPrincipal) {
        this.id = id;
        this.nome = nome;
        this.linguagemPrincipal = linguagemPrincipal;
    }

    @Override
    public String toString() {
        return nome + " (" + linguagemPrincipal + ")";
    }
}

class Projeto {
    private int id;
    private String nomeProjeto;
    private ArrayList<Programador> programadores = new ArrayList<>();

    public Projeto(int id, String nomeProjeto) {
        this.id = id;
        this.nomeProjeto = nomeProjeto;
    }

    public void adicionarProgramador(Programador p) {
        programadores.add(p);
    }

    public void listarProgramadores() {
        System.out.println("Programadores do projeto '" + nomeProjeto + "':");
        for (Programador p : programadores) {
            System.out.println(" - " + p);
        }
    }
}

public class softwareProject {
    public static void main(String[] args) {
        Programador p1 = new Programador(1, "Ana Clara", "Java");
        Programador p2 = new Programador(2, "Bruno Costa", "Python");

        Projeto proj = new Projeto(1, "Sistema de Gestão Hospitalar");
        proj.adicionarProgramador(p1);
        proj.adicionarProgramador(p2);

        proj.listarProgramadores();
    }
}