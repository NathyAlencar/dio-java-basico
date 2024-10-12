public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("Tv Ligada ?" + smartTv.ligada);
        System.out.println("Canal Atual :" +smartTv.canal);
        System.out.println("Volume Atual :" +smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("\nCanal Atual: "+ smartTv.canal);

        smartTv.mudarCanal(13);
        System.out.println("\nNovo Canal Atual: "+ smartTv.canal);
       
        System.out.println("\nVolume Atual : " + smartTv.volume);

        smartTv.ligar();
        System.out.println("\nNovo Status -> Tv Ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> Tv Ligada ? " + smartTv.ligada);
    }
}
