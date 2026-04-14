public class TermostatoSmart implements DispositivoLigavel, SensorTemperatura {

    private boolean ligado = false;     // Controla se está ligado ou desligado
    private double temperatura = 25;    // Temperatura inicial

    @Override
    public void ligar() {
        ligado = true;
        System.out.println("✓ Termostato ligado!");
    }

    @Override
    public void desligar() {
        ligado = false;
        System.out.println("✗ Termostato desligado!");
    }

    @Override
    public double lerTemperatura() {
        if (ligado) {
            System.out.println("📊 Temperatura atual: " + temperatura + "°C");
            return temperatura;
        } else {
            System.out.println("⚠ Termostato desligado. Não é possível ler a temperatura.");
            return 0;
        }
    }

    // Método adicional para ajustar temperatura
    public void ajustarTemperatura(double novaTemperatura) {
        if (ligado) {
            this.temperatura = novaTemperatura;
            System.out.println("🌡 Temperatura ajustada para: " + temperatura + "°C");
        } else {
            System.out.println("⚠ Termostato desligado. Ligue-o primeiro para ajustar a temperatura.");
        }
    }
}