package br.com.brvt.Util;

import br.com.brvt.enums.OcorrenciaPagforEnum;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Util {

    public String RetornaEspacos(int tamanhoTexto) {
        int qtdEspacos = 68 - tamanhoTexto;
        return " ".repeat(Math.max(0, qtdEspacos));
    }

    public String FormataAgenciaComDv(String agencia, String dv) {
        return agencia.substring(1) + "-" + dv;
    }

    public String FormataAgenciaComDv(String agencia, String dv, String dv2) {
        return (agencia.substring(1) + "-" + dv + dv2).trim();
    }

    public String FormataAgenciaSemDv(String agencia) {
        return agencia.substring(1);
    }

    public String FormataContaComDv(String conta, String dv) {
        return new BigDecimal(conta).toString() + "-" + dv;
    }

    public String FormataContaComDoisDv(String conta, String dv, String dv2) {
        if (dv2.equals(" ")) {
            return new BigDecimal(conta) + "-" + dv;
        } else {
            return new BigDecimal(conta) + "-" + dv + dv2;
        }
    }

    public String FormataData(String data) {
        return data.substring(0, 2) + "/" + data.substring(2, 4) + "/" + data.substring(4, 8);
    }

    public String FormataHora(String hora) {
        return hora.substring(0, 2) + ":" + hora.substring(2, 4) + ":" + hora.substring(4, 6);
    }

    public String FormataValor(String valor) {
        BigDecimal centavos = new BigDecimal("0.01");
        BigDecimal vlr = new BigDecimal(valor).multiply(centavos).setScale(2, RoundingMode.HALF_DOWN);
        return vlr.toString().replace(".", ",");
    }

    public String FormataAutenticacao(String autenticacao) {
        return autenticacao.charAt(0) + "."
                + autenticacao.substring(1, 4) + "."
                + autenticacao.substring(4, 7) + "."
                + autenticacao.substring(7, 10) + "."
                + autenticacao.substring(10, 13) + "."
                + autenticacao.substring(13, 16);
    }

    public String FormataCPF(String cpf) {
        return cpf.substring(3, 6) + "."
                + cpf.substring(6, 9) + "."
                + cpf.substring(9, 12) + "-"
                + cpf.substring(12, 14);
    }

    public String FormataCNPJ(String cnpj) {
        return cnpj.substring(0, 2) + "."
                + cnpj.substring(2, 5) + "."
                + cnpj.substring(5, 8) + "/"
                + cnpj.substring(8, 12) + "-"
                + cnpj.substring(12, 14);
    }

    public static List<OcorrenciaPagforEnum> getOcorrenciasEnum(String motivos) {
        List<OcorrenciaPagforEnum> resultado = new ArrayList<>();
        for (int i = 0; i < motivos.length(); i += 2) {
            String motivo = motivos.substring(i, i + 2);
            if (isNotBlank(motivo)) {
                resultado.add(OcorrenciaPagforEnum.getEnum(motivo));
            }
        }
        return resultado;
    }

    public static boolean isNotBlank(CharSequence cs) {
        return !isBlank(cs);
    }

    public static boolean isBlank(CharSequence cs) {
        int strLen;
        if (cs != null && (strLen = cs.length()) != 0) {
            for (int i = 0; i < strLen; ++i) {
                if (!Character.isWhitespace(cs.charAt(i))) {
                    return false;
                }
            }

        }
        return true;
    }

}
