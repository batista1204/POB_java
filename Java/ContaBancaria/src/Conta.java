public class Conta {
    public int numeroConta;
    public int agencia;
    public String nomeCliente;
    public float saldo;
    public boolean estado;

    //metodo construtor - tem o mesmo nome da classe
    public Conta(int numeroConta, int agencia, String nomeCliente, float saldo, boolean estado) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
        this.estado = estado;
    }

    //metodo depositar
    public void depositar(float x){
        if(this.estado){
            this.saldo += x;
            System.out.printf("\nDeposito: " + x + "\nNovo saldo: " +  this.saldo);
        }
    }

    //saque
    public void saque(float y){
        if(this.estado && this.saldo >=  y){
        this.saldo -= y;
            System.out.printf("\nSaque: " + y +"\nNovo saldo: " + saldo);
        }
        else {
            System.err.println("\nErro: Saldo insuficiente ou conta desativada");
        }
    }

    //desativar
    public void desativar(){
        if(this.saldo == 0){
            this.estado = false;
            System.out.printf("\nConta desativada");
        }
        else{
            System.err.println("\nErro: Ainda há saldo, por favor sacar para desativar");
        }
    }

    public String toString() {
        //this representa o objeto que chama o metodo
        return "\nConta: " + this.numeroConta +
                " \nAgencia :" + this.agencia +
                " \nCliente: " + this.nomeCliente +
                " \nSaldo : R$" + this.saldo +
                " \nStatus: " + this.estado;
    }
}
