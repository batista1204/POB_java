public class TestaVetorPolimorfico {
    public static void main(String[] args) {

        // Criando vetor do tipo da superclasse
        Desenvolvedor[] devs = new Desenvolvedor[4];

        // Preenchendo com objetos de subclasses diferentes
        devs[0] = new Junior("Gabriel","Python", 3000, "Daniel");
        devs[1] = new Pleno("Zézinho","C++", 5000, 5);
        devs[2] = new Senior("Joãozinho","C#", 8000, 10);
        devs[3] = new Desenvolvedor("Neymar","JavaScript", 2500);

        // Percorrendo o vetor
        for (Desenvolvedor dev : devs) {

            // chama o método sobrescrito de cada classe
            dev.codar();

            // imprime o bônus
            System.out.println("Bônus: " + dev.calcularBonus());

            // imprime os dados do objeto
            System.out.println(dev);


        }
    }
}