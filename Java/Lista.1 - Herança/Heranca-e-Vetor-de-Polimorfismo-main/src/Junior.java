public class Junior extends Desenvolvedor {// filho
    private String mentor;

    public Junior(){  // sempre tem que fazer
        super(); // chama construtor da superclasse
    }

    public String getMentor() {
        return mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }

    public Junior(String nome, String linguagem, float salarioBase, String mentor) {
        super(nome, linguagem, salarioBase);
        this.mentor = mentor;
    }
    @Override // anulação de metodo
    public void codar(){
        System.out.println("JR desenvolveu um código com mentoria de " + this.mentor);
    }
    @Override
    public float calcularBonus(){
        return super.salarioBase * 0.5f;  // bonus de 5% salario
    }

    @Override
    public String toString() {
        return "Junior{" +
                super.toString() +
                "mentor='" + mentor + '\'' +
                '}';
    }
}
