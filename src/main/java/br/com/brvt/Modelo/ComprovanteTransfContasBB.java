package br.com.brvt.Modelo;

import br.com.brvt.Util.Facilitadores;

public class ComprovanteTransfContasBB {
    private HeaderArquivo headerArquivo;
    private HeaderLoteAB headerLoteAB;
    private SegmentoA segmentoA;
    private SegmentoB segmentoB;
    private SegmentoZ segmentoZ;
    private Facilitadores util;
    private String comprovante;

    public ComprovanteTransfContasBB(HeaderArquivo headerArquivo, HeaderLoteAB headerLoteAB, SegmentoA segmentoA, SegmentoB segmentoB) {
        this.headerArquivo = headerArquivo;
        this.headerLoteAB = headerLoteAB;
        this.segmentoA = segmentoA;
        this.segmentoB = segmentoB;
        this.util = new Facilitadores();
    }  

    public ComprovanteTransfContasBB(HeaderArquivo headerArquivo, HeaderLoteAB headerLoteAB, SegmentoA segmentoA, SegmentoB segmentoB, SegmentoZ segmentoZ) {
        this.headerArquivo = headerArquivo;
        this.headerLoteAB = headerLoteAB;
        this.segmentoA = segmentoA;
        this.segmentoB = segmentoB;
        this.segmentoZ = segmentoZ;
        this.util = new Facilitadores();
    }  

    public String GeraComprovante() {
        String espacos = "";

        comprovante = "\n" + util.FormataData(segmentoA.getSaCdtDataPgto()) + "                 BANCO DO BRASIL                  "  + util.FormataHora(headerArquivo.getHArqHora()) + "\n";
        comprovante += "                    COMPROVANTE DE TRANSFERENCIA\n";
        if (segmentoA.getSasaInformacaoPoupanca().equals("11")) {
            comprovante += "                   DE CONTA CORRENTE PARA POUPANCA\n\n";
        } else {            
            comprovante += "               DE CONTA CORRENTE PARA CONTA CORRENTE\n\n";
        }
        comprovante += "CLIENTE: " + headerLoteAB.getHlEmpNome() + "\n";
        espacos = util.RetornaEspacos(22 +  util.FormataContaComDv(headerLoteAB.getHlEmpContConta(), headerLoteAB.getHlEmpContContaDv()).length());
        comprovante += "AGENCIA: " + util.FormataAgenciaComDv(headerLoteAB.getHlEmpContAgencia(), headerLoteAB.getHlEmpContAgenciaDv()) + espacos 
                     + "CONTA: "   + util.FormataContaComDv(headerLoteAB.getHlEmpContConta(), headerLoteAB.getHlEmpContContaDv()) + "\n";
        comprovante += "====================================================================\n";
        espacos = util.RetornaEspacos(32);
        comprovante += "DATA DA TRANSFERÊNCIA:" + espacos + util.FormataData(segmentoA.getSaCdtDataReal()) + "\n";
        espacos = util.RetornaEspacos(15 + util.FormataValor(segmentoA.getSaCdtValorReal()).length());  
        comprovante += "VALOR TOTAL:" + espacos + "R$ " + util.FormataValor(segmentoA.getSaCdtValorReal()) + "\n\n";
        comprovante += "*** TRANSFERIDO PARA:\n";
        comprovante += "CLIENTE: " + segmentoA.getSaFavNome() + "\n";
        espacos = util.RetornaEspacos(22 + util.FormataContaComDv(segmentoA.getSaFavContConta(), segmentoA.getSaFavContContaDv()).length());
        comprovante += "AGENCIA: " + util.FormataAgenciaComDv(segmentoA.getSaFavContAgencia(), segmentoA.getSaFavContAgenciaDv()) + espacos 
                     + "CONTA: "   + util.FormataContaComDv(segmentoA.getSaFavContConta(), segmentoA.getSaFavContContaDv()) + "\n";
        // espacos = facilitadores.RetornaEspacos(segmentoB.getSbDCompCodDocumento().substring(79,85).length());
        comprovante += "NR. DO DOCUMENTO: " + espacos + segmentoB.getSbDCompCodDocumento() + "\n";
        comprovante += "====================================================================\n";
        espacos = util.RetornaEspacos(19 +segmentoZ.getSzAutBancaria().trim().length());  
        comprovante += "AUTENTICACAO: " + espacos + util.FormataAutenticacao(segmentoZ.getSzAutBancaria()) + "\n";
        espacos = new Facilitadores().RetornaEspacos(20 +segmentoZ.getSzCtrBanco().length() +headerArquivo.getHBcoNome().trim().length()); 
        comprovante += "AGENTE ARRECADADOR:" + espacos + segmentoZ.getSzCtrBanco() + " " + headerArquivo.getHBcoNome().trim() + "\n\n";
        return comprovante;
    }

    public String GeraComprovanteErro() {
        String espacos;
        comprovante += "OPERAÇAO: TRANSFERENCIA ";
        if (segmentoA.getSasaInformacaoPoupanca().equals("11")) {
            comprovante += " DE CONTA CORRENTE PARA POUPANCA\n\n";
        } else {            
            comprovante += "               DE CONTA CORRENTE PARA CONTA CORRENTE\n\n";
        }
        comprovante =  "CLIENTE: " + segmentoA.getSaFavNome() + "\n";
        espacos = util.RetornaEspacos(15 + util.FormataContaComDv(segmentoA.getSaFavContConta(), segmentoA.getSaFavContContaDv()).length());
        comprovante += "AGENCIA: " + util.FormataAgenciaComDv(segmentoA.getSaFavContAgencia(), segmentoA.getSaFavContAgenciaDv()) + espacos 
                     + "CONTA: "   + util.FormataContaComDv(segmentoA.getSaFavContConta(), segmentoA.getSaFavContContaDv()) + "\n";
        espacos = util.RetornaEspacos(14 + util.FormataValor(segmentoA.getSaCdtValorReal()).length());
        comprovante += "VALOR TOTAL :" + espacos + "R$ " + util.FormataValor(segmentoA.getSaCdtValorReal()) + "\n\n";
        comprovante += "Mensagem de Erro: " + new ErrosConciliacao().getMensagemRetorno(segmentoA.getSaOcorrencias().trim());
        return comprovante;
    }

    public String GeraNomeComprovante() {
        System.out.println("segmentoA.getSaCdtValorReal()" + segmentoA.getSaCdtValorReal());
        return segmentoA.getSaFavNome().trim() + " - R$ " + util.FormataValor(segmentoA.getSaCdtValorReal()) + ".txt";
    }

    public String GeraNomeComprovanteErro() {
        return "ERRO " + segmentoA.getSaOcorrencias().trim() + " - " + segmentoA.getSaFavNome() + " - R$ " + util.FormataValor(segmentoA.getSaCdtValorReal()) + ".txt";
    }
    
}
