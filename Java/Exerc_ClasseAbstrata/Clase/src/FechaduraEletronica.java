public class FechaduraEletronica implements Autenticavel, DispositivoLigavel {

    private String senhaCorreta = "0000";   // Senha para liberar acesso
    private boolean acessoLiberado = false;     // Controla se tá liberado ou não
    private boolean ligada = false;    // (true = destrancada, false = trancada)


    // Métodos
    @Override
    public void validarAcesso(String senha) {
        if (senha.equals(senhaCorreta)) {   // Se for igual
            acessoLiberado = true;          // true = libera
            System.out.println("Acesso liberado!");
        } else {
            acessoLiberado = false;         // se N = false
            System.out.println("Senha incorreta!");
        }
    }

    @Override
    public void ligar() {
        if (acessoLiberado) {
            ligada = true;      // Se liberado
            System.out.println("Fechadura destrancada!");
        } else {                // Se não liberado
            System.out.println("Acesso negado. Valide a senha primeiro.");
        }
    }

    @Override
    public void desligar() {
        ligada = false;     // Desliga o Sistema
        acessoLiberado = false; // Trava o Sistema tb   (nao necessario)
        System.out.println("Fechadura trancada!");
    }
}