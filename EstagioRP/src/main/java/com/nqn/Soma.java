package com.nqn;

public class Soma {

    public static void main(String[] args) {
        System.out.println("O valor da soma é: " + soma());
    }

    private static int soma() {
        int soma = 0;
        for(int k = 1; k < 12; k++){
            soma = soma + k;
        }
        return soma;
    }

}
