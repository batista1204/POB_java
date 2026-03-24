import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

class Filme {
    private int id;
    private String titulo;
    private String genero;
    private int duracao; // em minutos

    public Filme(int id, String titulo, String genero, int duracao) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
    }

    public String getTitulo() { return titulo; }

    @Override
    public String toString() {
        return titulo + " (" + genero + ") - " + duracao + "min";
    }
}

class Ingresso {
    private int id;
    private String assento;
    private String tipo; // Inteira ou Meia
    private float preco;

    public Ingresso(int id, String assento, String tipo, float preco) {
        this.id = id;
        this.assento = assento;
        this.tipo = tipo;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Assento: " + assento + " | " + tipo + " | R$ " + preco;
    }
}

class Sessao {
    private int id;
    private LocalDateTime horario;
    private int sala;
    private Filme filme;                    // Agregação
    private ArrayList<Ingresso> ingressos = new ArrayList<>(); // Composição

    public Sessao(int id, LocalDateTime horario, int sala) {
        this.id = id;
        this.horario = horario;
        this.sala = sala;
    }

    public void vincularFilme(Filme f) {
        this.filme = f;
    }

    public void venderIngresso(int id, String assento, String tipo, float preco) {
        Ingresso i = new Ingresso(id, assento, tipo, preco);
        ingressos.add(i);
        System.out.println("Ingresso " + assento + " vendido com sucesso!");
    }

    @Override
    public String toString() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        StringBuilder sb = new StringBuilder();
        sb.append("=== SESSÃO ===\n");
        sb.append("Sala: ").append(sala).append(" | Horário: ").append(horario.format(fmt)).append("\n");
        if (filme != null) sb.append("Filme: ").append(filme).append("\n");
        sb.append("Ingressos vendidos: ").append(ingressos.size()).append("\n");
        for (Ingresso i : ingressos) {
            sb.append("   - ").append(i).append("\n");
        }
        return sb.toString();
    }
}

public class cineTeatro {
    public static void main(String[] args) {
        Filme f1 = new Filme(1, "Batman", "Ação", 176);
        Filme f2 = new Filme(2, "Duna: Parte Dois", "Ficção Científica", 166);

        LocalDateTime horario = LocalDateTime.of(2026, 7, 20, 20, 0);

        Sessao sessao = new Sessao(1, horario, 1);
        sessao.vincularFilme(f1);

        sessao.venderIngresso(1, "A1", "Inteira", 45.0f);
        sessao.venderIngresso(2, "A2", "Meia", 22.5f);
        sessao.venderIngresso(3, "A3", "Inteira", 45.0f);

        System.out.println(sessao);

    }
}