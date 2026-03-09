public class TestaCarro {
    public static void main(String[] args) {
        //instaciar objeto obj1
        Carro obj1 = new Carro("Fiat", "Uno", 0, false);
        System.out.println(obj1.toString());
        obj1.ligar();
        obj1.acelerar(100);
        Carro obj2 = new Carro("GM", "Fox", 0, false);
        System.out.println(obj2.toString() );
        obj2.ligar();
        obj2.acelerar(80);
        obj2.frear(100);

        //ao encerrar
        obj1.desligar();
        obj2.desligar();
    }
}
