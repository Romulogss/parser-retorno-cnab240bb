package br.com.brvt.Modelo;

import br.com.brvt.Util.Facilitadores;

public class ComprovanteTransfContasBB {
    private HeaderArquivo headerArquivo;
    private HeaderLoteAB headerLoteAB;
    private SegmentoA segmentoA;
    private SegmentoB segmentoB;
    private SegmentoZ segmentoZ;
    private Facilitadores facilitadores;
    private String comprovante;

    public ComprovanteTransfContasBB(HeaderArquivo headerArquivo, HeaderLoteAB headerLoteAB, SegmentoA segmentoA, SegmentoB segmentoB, SegmentoZ segmentoZ) {
        this.headerArquivo = headerArquivo;
        this.headerLoteAB = headerLoteAB;
        this.segmentoA = segmentoA;
        this.segmentoB = segmentoB;
        this.segmentoZ = segmentoZ;
        this.facilitadores = new Facilitadores();
    }  

    public String GeraComprovante() {
        String espacos = "";

        comprovante = facilitadores.FormataData(segmentoA.getSaCdtDataPgto()) + "                 BANCO DO BRASIL                  "  + facilitadores.FormataHora(headerArquivo.getHArqHora()) + "\n";
        comprovante += "                    COMPROVANTE DE TRANSFERENCIA\n";
        if (segmentoA.getSasaInformacaoPoupanca().equals("11")) {
            comprovante += "                   DE CONTA CORRENTE PARA POUPANCA\n\n";
        } else {            
            comprovante += "               DE CONTA CORRENTE PARA CONTA CORRENTE\n\n";
        }
        comprovante += "CLIENTE: " + headerLoteAB.getHlEmpNome() + "\n";
        espacos = facilitadores.RetornaEspacos(22 +  facilitadores.FormataContaComDv(headerLoteAB.getHlEmpContConta(), headerLoteAB.getHlEmpContContaDv()).length());
        comprovante += "AGENCIA: " + facilitadores.FormataAgenciaComDv(headerLoteAB.getHlEmpContAgencia(), headerLoteAB.getHlEmpContAgenciaDv()) + espacos 
                     + "CONTA: "   + facilitadores.FormataContaComDv(headerLoteAB.getHlEmpContConta(), headerLoteAB.getHlEmpContContaDv()) + "\n";
        comprovante += "====================================================================\n";
        espacos = facilitadores.RetornaEspacos(32);
        comprovante += "DATA DA TRANSFERÊNCIA:" + espacos + facilitadores.FormataData(segmentoA.getSaCdtDataReal()) + "\n";
        espacos = facilitadores.RetornaEspacos(15 + facilitadores.FormataValor(segmentoA.getSaCdtValorReal()).length());  
        comprovante += "VALOR TOTAL:" + espacos + "R$ " + facilitadores.FormataValor(segmentoA.getSaCdtValorReal()) + "\n\n";
        comprovante += "*** TRANSFERIDO PARA:\n";
        comprovante += "CLIENTE: " + segmentoA.getSaFavNome() + "\n";
        espacos = facilitadores.RetornaEspacos(22 + facilitadores.FormataContaComDv(segmentoA.getSaFavContConta(), segmentoA.getSaFavContContaDv()).length());
        comprovante += "AGENCIA: " + facilitadores.FormataAgenciaComDv(segmentoA.getSaFavContAgencia(), segmentoA.getSaFavContAgenciaDv()) + espacos 
                     + "CONTA: "   + facilitadores.FormataContaComDv(segmentoA.getSaFavContConta(), segmentoA.getSaFavContContaDv()) + "\n";
        // espacos = facilitadores.RetornaEspacos(segmentoB.getSbDCompCodDocumento().substring(79,85).length());
        comprovante += "NR. DO DOCUMENTO: " + espacos + segmentoB.getSbDCompCodDocumento() + "\n";
        comprovante += "====================================================================\n";
        espacos = facilitadores.RetornaEspacos(19 +segmentoZ.getSzAutBancaria().trim().length());  
        comprovante += "AUTENTICACAO: " + espacos + facilitadores.FormataAutenticacao(segmentoZ.getSzAutBancaria()) + "\n";
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
        espacos = facilitadores.RetornaEspacos(22 + facilitadores.FormataContaComDv(segmentoA.getSaFavContConta(), segmentoA.getSaFavContContaDv()).length());
        comprovante += "AGENCIA: " + facilitadores.FormataAgenciaComDv(segmentoA.getSaFavContAgencia(), segmentoA.getSaFavContAgenciaDv()) + espacos 
                     + "CONTA: "   + facilitadores.FormataContaComDv(segmentoA.getSaFavContConta(), segmentoA.getSaFavContContaDv()) + "\n";
        comprovante += "VALOR TOTAL:" + espacos + "R$ " + facilitadores.FormataValor(segmentoA.getSaCdtValorReal()) + "\n\n";
        comprovante += "Mensagem de Erro: " + new ErrosConciliacao().getMensagemRetorno(segmentoA.getSaCodFinDoc().trim());
        return comprovante;
    }

    public String GeraNomeComprovante() {
        return segmentoA.getSaFavNome() + " - R$ " + facilitadores.FormataValor(segmentoA.getSaCdtValorReal()) + ".txt";
    }

    public String GeraNomeComprovanteErro() {
        return "ERRO " + segmentoZ.getSzOcorrencias().trim() + " - " + segmentoA.getSaFavNome() + " - R$ " + facilitadores.FormataValor(segmentoA.getSaCdtValorReal()) + ".txt";
    }
    
}
