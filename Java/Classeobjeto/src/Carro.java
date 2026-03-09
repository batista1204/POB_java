public class Carro {
    public String marca, modelo; //string é um tipo de dado, do tipo classe
    public float velocidade; //float é um tipo dde dado primitivo
    public boolean motor; //boolean, um tipo de dado primitivo

    //metodo construtor - tem o mesmo nome da classe
    public Carro(String marca, String modelo, float velocidade, boolean motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.motor = motor;
    }
    //metodo que liga o carro
    public void ligar(){
        if(!this.motor){
        this.motor = true;}
        System.out.println("\nMotor ligado");
    }

    //metodo que desliga o carro
    public void desligar(){
        if(this.motor){
        this.motor = true;
        this.velocidade = 0;}
        System.out.println("\nMotor delisgado");
    }

    //metodo acelerar
    public void acelerar(float x){
        if(this.motor){
            this.velocidade += x;
            System.out.printf("\nNova velocidade: " +  this.velocidade);
        }
    }

    //metodo frear
    public void frear(float y){
        if(this.motor && this.velocidade - y > 0) {
            this.velocidade -= y;
            System.out.println("\nNova velocidade: " + this.velocidade);
        }
        else System.out.println("\nNão é possível frear");
    }

    //metodo que converte o objeto em String
    public String toString() {
        //this representa o objeto que chama o metodo 
        return "\nMarca: " + this.marca +
                " \nModelo :" + this.modelo +
                " \nVelocidade: " + this.velocidade +
                " \nMotor :" + this.motor;
    }

    }
