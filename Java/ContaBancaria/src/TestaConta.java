public class TestaConta {
    public static void main(String[] args) {
        Conta obj1 = new Conta(123456,1,"João Silva", 5000, true);
        System.out.println(obj1.toString());
        obj1.depositar(100);
        obj1.saque(5000);
        obj1.desativar();
  }
}

