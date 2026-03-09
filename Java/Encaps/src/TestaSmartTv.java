public class TestaSmartTv {

    public static void main(String[] args){
        //cria uma instância de SmartTV
        SmartTV s1 = new SmartTV("Lenovo", "led", 0);
        s1.setVolume(-40);
        s1.setVolume(110);
        s1.setVolume(50);

        System.out.println("Volume: " + s1.getVolume());

        SmartTV s2 = new SmartTV("LG", "QLED", 0);
        SmartTV s3 = new SmartTV("Samsung", "OLED", 0);
        s1.abrirYoutube();
        s2.abrirYoutube();
        s3.abrirYoutube();
    }
}
