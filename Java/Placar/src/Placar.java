public class Placar{
    public String Timecasa;
    public String Timevisitante;
    public int Pontoscasa;
    public int Pontosvisitante;
    public int Periodo;

    //construtor

    public Placar(String Timecasa, String Timevisitante){
        this.Timecasa = Timecasa;
        this.Timevisitante = Timevisitante;
        this.Pontoscasa = 0;
        this.Pontosvisitante = 0;
        this.Periodo = 1;
    }

    public void registrarPonto(String time, int tipo){
        if(time == this.Timecasa){
            this.Pontoscasa += tipo;
            System.out.println("Pontos casa: " + this.Pontoscasa);
        } else if (time == Timevisitante) {
            this.Pontosvisitante += tipo;
            System.out.println("Pontos visitante: " + this.Pontosvisitante);
        }
        else {
            System.out.println("TIME NÃO ESTA JOGANDO");
        }
    }

    public void proximoQuarto(){
        if(this.Periodo < 4){
            Periodo += 1;
            System.out.println("Periodo: " + Periodo);
        }
        else {
            System.out.println("JOGO FINALIZADO");;
        }
    }

    public String toString(){
        return "\nPLACAR ATUAL\n TIME CASA-" + this.Pontoscasa + " X " + this.Pontosvisitante + "-TIME VISITANTE" +
        "\nPeríodo: " + this.Periodo;
    }
}