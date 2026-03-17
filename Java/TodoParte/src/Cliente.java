public class Cliente{
    private int ID;
    private String nome, cpf, endereço;

    public Cliente() {
    }

    public Cliente(int ID, String nome, String cpf, String endereço) {
        this.ID = ID;
        this.nome = nome;
        this.cpf = cpf;
        this.endereço = endereço;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    @Override
    public String toString() {
        return "\nCliente{" +
                "ID=" + ID +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", endereço='" + endereço + '\'' +
                '}';
    }

}

