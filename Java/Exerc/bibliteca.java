import java.time.LocalDate;

class Leitor {
    private int id;
    private String nome;

    public Leitor(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public String getNome() { return nome; }

    @Override
    public String toString() {
        return "Leitor: " + nome;
    }
}

class Livro {
    private int id;
    private String titulo;
    private String autor;

    public Livro(int id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() { return titulo; }

    @Override
    public String toString() {
        return titulo + " - " + autor;
    }
}

class Emprestimo {
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucaoPrevista;
    private Leitor leitor;
    private Livro livro;

    public Emprestimo(LocalDate dataEmprestimo, LocalDate dataDevolucaoPrevista,
                      Leitor leitor, Livro livro) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
        this.leitor = leitor;
        this.livro = livro;
    }

    @Override
    public String toString() {
        return "=== EMPRÉSTIMO ===\n" +
                "Leitor: " + leitor.getNome() + "\n" +
                "Livro: " + livro.getTitulo() + "\n" +
                "Data Empréstimo: " + dataEmprestimo + "\n" +
                "Devolução Prevista: " + dataDevolucaoPrevista;
    }
}

public class bibliteca {
    public static void main(String[] args) {
        Leitor l = new Leitor(1, "Carlos Mendes");
        Livro lv = new Livro(1, "O Senhor dos Anéis", "J.R.R. Tolkien");

        LocalDate hoje = LocalDate.now();
        LocalDate devolucao = hoje.plusDays(15);

        Emprestimo emp = new Emprestimo(hoje, devolucao, l, lv);
        System.out.println(emp);
    }
}