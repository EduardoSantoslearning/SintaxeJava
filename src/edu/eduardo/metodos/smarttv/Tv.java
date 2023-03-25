package edu.eduardo.metodos.smarttv;

public class Tv {

    boolean ligada = false;
    int canal=1;
    int volume = 100;


    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada = false;
    }


    public void aumentarVolume() {
        if (volume == 100){
            System.out.println("volume maximo");
        }
        else{
            volume++;
        }

    }

    public void diminuirVolume() {
        if (volume == 0){
            System.out.println("volume mínimo");
        }
        else{
            volume--;
        }
    }

    public void aumentarCanal() {
        if (canal == 100){
            canal=1;
        }
        else{
            canal++;
        }
    }

    public void diminuirCanal() {
        if (canal == 1){
            canal =100;
        }
        else{
            canal--;
        }
    }

    public void canalEspecifico(int novoCanal){
        canal = novoCanal;

    }

}
