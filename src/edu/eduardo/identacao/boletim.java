package edu.eduardo.identacao;

public class boletim {
    public static void main(String[] args) {
        double nota1 = 7;
        double nota2 = 6;
        double media = (nota1 + nota2)/2;

        if(media<6)
            System.out.println("Reprovado");
        else if (media==6)
            System.out.println("Prova Minerva");
        else
            System.out.println("Aprovado");
    }

}
