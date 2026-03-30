public class Aviao extends Veiculo{
    private float altitudeMax;

    public Aviao() {
    }

    public Aviao(float altitudeMax) {
        this.altitudeMax = altitudeMax;
    }

    public Aviao(String marca, String modelo, float velocidade, float altitudeMax) {
        super(marca, modelo, velocidade);
        this.altitudeMax = altitudeMax;
    }

    public float getAltitudeMax() {
        return altitudeMax;
    }

    public void setAltitudeMax(float altitudeMax) {
        this.altitudeMax = altitudeMax;
    }

    @Override
    public void mover(){
        System.out.println("Avião voando a " + getVelocidade() +
                " km/h e " + altitudeMax + " metros");
    }

    @Override
    public void abastecer(){
        System.out.println("Avião está reabastacendo com querosene de aviação...");
    }

    @Override
    public String toString() {
        return "Aviao{" +
                "altitudeMax=" + altitudeMax +
                super.toString() +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", velocidade=" + velocidade +
                '}';
    }
}
