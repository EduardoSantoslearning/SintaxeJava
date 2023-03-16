package edu.eduardo.metodos;

public class Main {
    public static void main(String[] args) {

        // variáveis
        String nome = "Eduardo";
        String sobrenome = "Santos Santana";
        int ano = 2023;
        boolean souRico = false;
        ano = 2013;
        double altura = 1.85;
        int a = 2;
        int b = 3;



        int somar = somar (a, b);
        String nomeCompleto = nomeCompleto(nome, sobrenome);

        System.out.println(nomeCompleto);
        System.out.println(somar);


    }


    //metodos
    public static String nomeCompleto (String nome, String sobrenome){
        return nome.concat(" ").concat(sobrenome);
    }

    public static int somar (int a, int b){
        return (a+b);
    }

}