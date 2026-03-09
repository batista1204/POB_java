public class TestaStreaming {
    public static void main(String[] args){
        Streaming obj1 = new Streaming("Breno", "Classic" +
                "" +
                "");
        System.out.println(obj1.toString());
        obj1.assistirfilme("Moana");
        obj1.cancelarAssinatura();
        System.out.println(obj1.toString());
    }
}
