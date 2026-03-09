import java.sql.SQLOutput;

public class SmartTV { // atributos privados

    private String marca, modelo;
    private int volume;
    private boolean conectada;

    // construtor vazio
    public SmartTV() {

    }

    // construtor com parâmetros
    public SmartTV(String marca, String modelo, int volume) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setVolume(volume);
        this.conectada = false;
    }

    // setter volume
    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        } else {
            System.err.println("Volume inválido");
        }
    }

    // getter volume
    public int getVolume() {
        return this.volume;
    }

    // setter marca
    public void setMarca(String marca) {
        if (marca.length() <= 30) {
            this.marca = marca;
        }
        else{
            System.err.println("Larga de ser anta");
        }
    }

    // getter marca
    public String getMarca() {
        return this.marca;
    }

    // setter modelo
    public void setModelo(String modelo) {
        //todo modelo tem que iniciar com a letra maiscula
        if(Character.isUpperCase(modelo.charAt(0))) {
            this.modelo = modelo;
        }
        else{
            System.err.println("A primeira letra não é maiscula");
        }
    }

    // getter modelo
    public String getModelo() {
            return this.modelo;
    }

    // verifica conexão
    public boolean isConectadaInternet() {
        return this.conectada;
    }

    // abrir youtube
    public void abrirYoutube() {
        if (VeriIn()) {
            System.out.println("\nAbrindo Youtube...");
        }
        else {
            System.out.println("\nTV não está conectada à internet");
        }
    }

    // verificar internet
    private boolean VeriIn() {
        System.out.println("Buscando sinal de Wi-FI...");
        System.out.println("Verificando credenciais...");
        System.out.println("Autenticando IP do roteador...");
        //50% de chance de conectar e 50%  de chance de nn conectar
        int randomico = (int)(Math.random() * 10);
        if (randomico < 5){
            System.out.printf("\nConectou");
            return true;
        }
        else{
            System.err.println("Problema na conexão");
            return false;
        }
    }

    //aumentar o volume em x
    public void aumentarvolume(int x){
        this.setVolume(this.volume + x);
    }

    public void diminuavolume(int y){
        this.setVolume(this.volume - y);
    }
}