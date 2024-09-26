package com.nqn;

import java.util.Arrays;

public class VerificaPalavra {

    public static void main(String[] args) {
        VerificaPalavra vp = new VerificaPalavra();
        vp.verificaPalavra("Navio", "V");
    }

    //MÉTODO PARA VERIFICAR SE A PALAVRA CONTEM A LETRA, RECEBENDO OS DOIS PARÂMETROS
    public void verificaPalavra(String palavraConsultada, String letra){
        if(palavraConsultada.toLowerCase().contains(letra.toLowerCase())){
            System.out.println(String.format("A palavra '%s' tem '%d' letras '%s'.", palavraConsultada, quantasLetras(palavraConsultada, letra), letra));
        } else {
            System.out.println(String.format("A palavra '%s' não contem a letra '%s'.", palavraConsultada, letra));
        }
    }

    //MÉTODO QUE VERIFICA A QUANTIDADE DE LETRAS NA PALAVRA CONSULTADA
    public Integer quantasLetras(String palavraConsultada, String letra){
        Integer quantidadeDeLetras = Arrays.stream(palavraConsultada.split("")).filter(l -> l.toLowerCase().equals(letra.toLowerCase())).toList().size();

        return quantidadeDeLetras;
        };
    }

