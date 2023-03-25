package edu.eduardo.metodos.smarttv;

public class Usuario {
    public static void main(String[] args) {

        Tv tv = new Tv();

        System.out.println("A tv está ligada? "+ tv.ligada);
        System.out.println("Canal atual: "+ tv.canal);
        System.out.println("Volume atual: "+ tv.volume);

        //ligando e desligando a tv
        tv.ligar ();
        System.out.println("Tv ligada? " + tv.ligada);

        tv.desligar ();
        System.out.println("Tv ligada? " + tv.ligada);

        //aumentando e diminuindo o volume
        tv.aumentarVolume ();
        System.out.println("Volume: "+ tv.volume);
        tv.aumentarVolume ();
        System.out.println("Volume: "+ tv.volume);
        tv.aumentarVolume ();
        System.out.println("Volume: "+ tv.volume);

        tv.diminuirVolume ();
        System.out.println("Volume: "+ tv.volume);
        tv.diminuirVolume ();
        System.out.println("Volume: "+ tv.volume);
        tv.diminuirVolume ();
        System.out.println("Volume: "+ tv.volume);
        tv.diminuirVolume ();
        System.out.println("Volume: "+ tv.volume);


        //aumentando canal, diminuindo canal e canal especifico
        tv.aumentarCanal();
        System.out.println("Canal: "+ tv.canal);

        tv.diminuirCanal();
        System.out.println("Canal: "+ tv.canal);

        tv.canalEspecifico(50);
        System.out.println("Canal: "+ tv.canal);

    }
}
