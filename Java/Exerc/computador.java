class Processador {
    private String marca;
    private String modelo;
    private double frequencia;

    public Processador(String marca, String modelo, double frequencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.frequencia = frequencia;
    }

    @Override
    public String toString() {
        return marca + " " + modelo + " (" + frequencia + "GHz)";
    }
}

class Computador {
    private int id;
    private String marca;
    private Processador processador;   // Composição

    public Computador(int id, String marca, String procMarca, String procModelo, double freq) {
        this.id = id;
        this.marca = marca;
        this.processador = new Processador(procMarca, procModelo, freq); // criado dentro
    }

    @Override
    public String toString() {
        return "Computador " + marca + " | Processador: " + processador;
    }
}

public class computador {
    public static void main(String[] args) {
        Computador pc = new Computador(1, "Dell", "Intel", "i7-13700K", 5.4);
        System.out.println(pc);

        // Se o computador for "destruído", o processador também some
        pc = null;
        // processador não pode mais ser acessado
    }
}