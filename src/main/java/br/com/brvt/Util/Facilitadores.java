package br.com.brvt.Util;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Facilitadores {
    private String espacos = "";

    public String RetornaEspacos (int tamanhoTexto) {
        espacos = "";
        int qtdEspacos = 68 -tamanhoTexto;
        for (int i = 0; i < qtdEspacos; i++) {
            espacos += " ";
        }
        return espacos;
    }
    
    public String FormataAgenciaComDv (String agencia, String dv) {
        return agencia.substring(1) + "-" + dv;
    }

    public String FormataContaComDv (String conta, String dv) {
        return new BigDecimal(conta).toString() + "-" + dv;
    }

    public String FormataData(String data){
        return data.substring(0, 2) + "/" + data.substring(2, 4) + "/" + data.substring(4, 8);
    }

    public String FormataHora(String hora) {
        return hora.substring(0, 2) + ":" + hora.substring(2, 4) + ":" + hora.substring(4, 6);
    }

    public String FormataValor(String valor) {
        BigDecimal centavos = new BigDecimal(0.01);
        BigDecimal vlr = new BigDecimal(valor).multiply(centavos).setScale(2, RoundingMode.HALF_DOWN);
        return vlr.toString().replace(".", ",");
    }

    public String FormataAutenticacao(String autenticacao) {
        return autenticacao.substring(0, 1)   + "." 
             + autenticacao.substring(1, 4)   + "."
             + autenticacao.substring(4, 7)   + "." 
             + autenticacao.substring(7, 10)  + "." 
             + autenticacao.substring(10, 13) + "." 
             + autenticacao.substring(13, 16);
    }

}
