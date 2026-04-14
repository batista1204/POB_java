public class Temp {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE CASA INTELIGENTE ===\n");

        // Criando o termostato
        TermostatoSmart termostato = new TermostatoSmart();

        // Testando o termostato
        System.out.println("--- Teste do Termostato Inteligente ---");

        // Tentar ler temperatura com termostato desligado
        termostato.lerTemperatura();

        // Ligar o termostato
        termostato.ligar();

        // Ler temperatura após ligar
        termostato.lerTemperatura();

        // Ajustar temperatura
        termostato.ajustarTemperatura(22.5);

        // Ler novamente
        termostato.lerTemperatura();

        // Desligar
        termostato.desligar();

        // Tentar ajustar desligado
        termostato.ajustarTemperatura(20.0);

        System.out.println("\n=== FIM DO TESTE ===");
    }
}