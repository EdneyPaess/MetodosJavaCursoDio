public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv= new SmartTv();
        //Tv ligada/Desligada
        smartTv.ligar();
        System.out.println("Novo Status - TV Ligada?: " +smartTv.ligada);
        smartTv.desligar();
        System.out.println("Novo Status - TV Ligada?: " +smartTv.ligada);

        //Mudança de volume
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume Atual?: " +smartTv.volume);

        //Mudança de canal
        System.out.println("Canal Atual?: " +smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal Atual?: " +smartTv.canal);


    }
}
