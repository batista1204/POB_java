import java.util.ArrayList;

public class TestaDesenvolvedor {

    public static void exibir(Desenvolvedor camaleao){ // camaleao superclasse - exibir metodo
        camaleao.codar();
        System.out.println(camaleao.toString() + "BONUS" + camaleao.calcularBonus());
    }
    public static void main(String[] args){

        Junior jr1 = new Junior("Fulano","Java",4000,"Beltrano");
       // jr1.codar();
       // System.out.println(jr1.toString() + "Bônus" + jr1.calcularBonus());
        exibir((jr1));

        Pleno pl1 = new Pleno("Beltrano","Java",6000,5);
       // pl1.codar();
       // System.out.println(pl1.toString() + "BÔNUS" + pl1.calcularBonus());
        exibir(pl1);
        Senior sr1 = new Senior("Ciclano","Java", 8000,2000);
       // sr1.codar();
       // System.out.println(sr1.toString() + "BÔNUS" + sr1.calcularBonus());
        exibir(sr1);

        ArrayList<Desenvolvedor> empresa = new ArrayList<>();
        empresa.add(jr1);
        empresa.add(pl1);
        empresa.add(sr1);

    }
}
