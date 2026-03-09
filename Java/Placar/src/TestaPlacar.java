public class TestaPlacar {
    public static void main(String[] args){
        Placar obj1 = new Placar("Franca Basquete", "Sesi Bauru");
        System.out.println(obj1.toString());
        obj1.registrarPonto("Sesi Bauru", 3);
        obj1.registrarPonto("Franca Basquete" , 3);
        System.out.println(obj1.toString());
        obj1.proximoQuarto();
        System.out.println(obj1.toString());
        obj1.proximoQuarto();
        System.out.println(obj1.toString());
        obj1.proximoQuarto();
        System.out.println(obj1.toString());
        obj1.proximoQuarto();
    }
}
