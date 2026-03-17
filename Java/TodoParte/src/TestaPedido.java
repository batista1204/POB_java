import java.util.Date;

public class TestaPedido {
    public static void main(String[] args) {

        //criar um obj da classe Cliente independente
        Cliente cl1 = new Cliente();
        Cliente cl2 = new Cliente(1, "Fulano", "123456789","Rua Brasil");

        //cria objeto-todo

        Pedido pd1 = new Pedido();
        Pedido pd2 = new Pedido(2, new Date(), cl2);
        System.out.println(pd2.toString());
    }
}
