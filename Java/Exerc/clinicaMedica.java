import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Medico {
    private int id;
    private String nome;
    private String especialidade;

    public Medico(int id, String nome, String especialidade) {
        this.id = id;
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getEspecialidade() { return especialidade; }

    @Override
    public String toString() {
        return "Médico: " + nome + " | Especialidade: " + especialidade;
    }
}

class Paciente {
    private int id;
    private String nome;
    private String cpf;

    public Paciente(int id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getCpf() { return cpf; }

    @Override
    public String toString() {
        return "Paciente: " + nome + " | CPF: " + cpf;
    }
}

class Consulta {
    private LocalDateTime data;
    private double valorDaConsulta;
    private Medico medico;
    private Paciente paciente;

    public Consulta(LocalDateTime data, double valorDaConsulta, Medico medico, Paciente paciente) {
        this.data = data;
        this.valorDaConsulta = valorDaConsulta;
        this.medico = medico;
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return "=== CONSULTA ===\n" +
                "Data: " + data.format(fmt) + "\n" +
                "Valor: R$ " + String.format("%.2f", valorDaConsulta) + "\n" +
                medico + "\n" +
                paciente;
    }
}

public class clinicaMedica {
    public static void main(String[] args) {
        Medico m = new Medico(1, "Dr. João Silva", "Cardiologia");
        Paciente p = new Paciente(1, "Maria Oliveira", "123.456.789-00");

        LocalDateTime dataConsulta = LocalDateTime.of(2026, 5, 20, 14, 30);

        Consulta consulta = new Consulta(dataConsulta, 250.0, m, p);

        System.out.println(consulta);
    }
}