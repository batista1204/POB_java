public class Pleno extends Desenvolvedor{ // filho
    private int projEntregues;

    public Pleno() {
    }

    public Pleno(String nome, String linguagem, float salarioBase, int projEntregues) {
        super(nome, linguagem, salarioBase);
        this.projEntregues = projEntregues;
    }

    public int getProjEntregues() {
        return projEntregues;
    }

    public void setProjEntregues(int projEntregues) {
        this.projEntregues = projEntregues;
    }

    @Override
    public String toString() {
        return "Pleno{" +
                super.toString() + // se nao fizer nao mostra as variaveis da herança
                "projEntregues=" + projEntregues +
                '}';
    }
    @Override
    public void codar(){
        System.out.println(("Desenvolvendo código e fazendo code review"));
    }
    @Override
    public float calcularBonus(){
        return super.calcularBonus() * this.salarioBase * 0.15f;
    }
}
