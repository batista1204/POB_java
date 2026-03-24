import java.util.ArrayList;

class Produto {
    private int id;
    private String nome;
    private double preco;

    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() { return nome; }
    public double getPreco() { return preco; }

    @Override
    public String toString() {
        return nome + " - R$ " + preco;
    }
}

class Cliente {
    private int id;
    private String nome;

    public Cliente(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente: " + nome;
    }
}

class ItemVenda {  // Composição com Venda
    private int id;
    private int quantidade;
    private Produto produto;   // Agregação

    public ItemVenda(int id, int quantidade, Produto produto) {
        this.id = id;
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public double getSubtotal() {
        return quantidade * produto.getPreco();
    }

    @Override
    public String toString() {
        return quantidade + "x " + produto.getNome() + " = R$ " + getSubtotal();
    }
}

class Venda {
    private int id;
    private Cliente cliente;           // Agregação
    private ArrayList<ItemVenda> itens = new ArrayList<>();  // Composição

    public Venda(int id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
    }

    public void adicionarItem(Produto p, int quantidade) {
        ItemVenda item = new ItemVenda(itens.size() + 1, quantidade, p);
        itens.add(item);
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemVenda item : itens) {
            total += item.getSubtotal();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== VENDA ===\n");
        sb.append(cliente).append("\n");
        sb.append("Itens:\n");
        for (ItemVenda i : itens) {
            sb.append(" - ").append(i).append("\n");
        }
        sb.append("Total: R$ ").append(String.format("%.2f", calcularTotal()));
        return sb.toString();
    }
}

public class supermercado {
    public static void main(String[] args) {
        Produto p1 = new Produto(1, "Arroz 5kg", 25.90);
        Produto p2 = new Produto(2, "Feijão 1kg", 8.50);

        Cliente c = new Cliente(1, "João Pedro");

        Venda venda = new Venda(1001, c);
        venda.adicionarItem(p1, 2);
        venda.adicionarItem(p2, 3);

        System.out.println(venda);
    }
}