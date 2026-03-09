public class Streaming {
    public String Usuario;
    public String Plano;
    public String UltFilmeassit;
    public float mensalidade;
    public boolean atividade;

    //construtor
    public Streaming(String Usuario, String Plano){
        this.Usuario = Usuario;
        this.Plano = Plano;
        this.UltFilmeassit = "";
        if (this.Plano == "Básico"){
            this.mensalidade = 25.9F;
        } else if (this.Plano == "Premium"){
            this.mensalidade = 45.9F;
        } else if (this.Plano == "Familia") {
            this.mensalidade = 60.9F;
        }
        else{
            System.err.println("Escolha um plano correto: Básico, Premium, Familia");
        }

        this.atividade = true;
    }

    public void assistirfilme(String x){
        if (this.atividade){
            this.UltFilmeassit = x;
            System.out.println("Assistindo: " + this.UltFilmeassit);
        }
        else{
            System.err.println("Pagar a fatura");
        }
    }

    public void cancelarAssinatura(){
        if (this.atividade){
            this.atividade = false;
        }
        else{
            System.err.println("Conta já suspensa");
        }
    }

    public String toString(){
        return "\nUsuário: " + this.Usuario +
                " \nPlano: " + this.Plano +
                " \nUltimo filme assistido: " + UltFilmeassit +
                " \nMensalidade: " + mensalidade +
                " \nStatus: " + atividade;
    }
    

}