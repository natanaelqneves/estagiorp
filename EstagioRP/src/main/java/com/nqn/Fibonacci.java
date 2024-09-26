package com.nqn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args) {
          Fibonacci fb = new Fibonacci();
          fb.verificaSePertence(21);
    }

    //MÉTODO PARA GERAR A SEQUÊNCIA FIBONACCI
    private Collection<Integer> gerarSequencia(Integer numeroConsultado) {
        List<Integer> sequencia = new ArrayList<>();
        sequencia.add(0);
        sequencia.add(1);

        int ultimoNumero = 1, penultimoNumero, proximoNumero = 1;

        while (proximoNumero < numeroConsultado){
            ultimoNumero = sequencia.get(sequencia.size() - 1);
            penultimoNumero = sequencia.get(sequencia.size() - 2);
            proximoNumero = penultimoNumero + ultimoNumero;

            sequencia.add(proximoNumero);
        }
        System.out.println(sequencia);
        return sequencia;
    }

    //MÉTODO PARA VERIFICAR O PERTENCIMENTO DO NÚMERO À SEQUÊNCIA
    public void verificaSePertence(Integer numeroConsultado){
        String resposta;
        if(gerarSequencia(numeroConsultado).contains(numeroConsultado)){
            System.out.println(String.format("O número %d faz parte da sequência.", numeroConsultado));
        } else {
            System.out.println(String.format("O número %d não faz parte da sequência.", numeroConsultado));
        }
    }
}
