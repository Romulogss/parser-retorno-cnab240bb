package br.com.brvt.Util;

import br.com.brvt.Modelo.CodigosCompe;
import br.com.brvt.Modelo.HeaderArquivo;
import br.com.brvt.Modelo.HeaderLoteAB;
import br.com.brvt.Modelo.SegmentoA;
import br.com.brvt.Modelo.SegmentoB;
import br.com.brvt.Modelo.SegmentoZ;
import br.com.brvt.enums.OcorrenciaPagforEnum;

import java.util.stream.Collectors;

public class CompTransferenciasGerar {

    private final HeaderArquivo headerArquivo;
    private final HeaderLoteAB headerLoteAB;
    private final SegmentoA segmentoA;
    private final SegmentoB segmentoB;
    private final SegmentoZ segmentoZ;
    private final Util util;
    private final String pastaDestino;
    private String comprovante;

    public CompTransferenciasGerar(HeaderArquivo headerArquivo, HeaderLoteAB headerLoteAB,
                                   SegmentoA segmentoA, SegmentoB segmentoB, SegmentoZ segmentoZ,
                                   String pastaDestino) {
        this.headerArquivo = headerArquivo;
        this.headerLoteAB = headerLoteAB;
        this.segmentoA = segmentoA;
        this.segmentoB = segmentoB;
        this.segmentoZ = segmentoZ;
        this.util = new Util();
        this.pastaDestino = pastaDestino;
        this.comprovante = "";
    }

    private String geraNomeArquivo() {
        return segmentoA.getSaFavBanco().trim() + " - " + segmentoA.getSaFavNome().trim() + "-" + segmentoB.getSbDCompFavInscNumero() + " - R$ " + util.FormataValor(segmentoA.getSaCdtValorReal()) + ".txt";
    }

    private String geraConteudoArquivoComErro() {
        return "ERRO " + segmentoA.getOcorrenciasEnum().stream().map(OcorrenciaPagforEnum::getDescricao).collect(Collectors.joining(",")) + " - " + segmentoA.getSaFavNome().trim() + " - R$ " + util.FormataValor(segmentoA.getSaCdtValorReal()) + ".txt";
    }

    private String geraNomeArquivoComErro() {
        return "ERRO - " + segmentoA.getSaFavNome().trim() + " - R$ " + util.FormataValor(segmentoA.getSaCdtValorReal()) + ".txt";
    }

    private String geraArquivoTransfBB() {
        String espacos = "";

        comprovante = "\n" + util.FormataData(segmentoA.getSaCdtDataPgto()) + "                 CAIXA ECÔNOMICA FEDERAL                  " + util.FormataHora(headerArquivo.getHArqHora()) + "\n";
        comprovante += "                    COMPROVANTE DE TRANSFERENCIA\n";
        if (segmentoA.getSasaInformacaoPoupanca().equals("11")) {
            comprovante += "                   DE CONTA CORRENTE PARA POUPANCA\n\n";
        } else {
            comprovante += "               DE CONTA CORRENTE PARA CONTA CORRENTE\n\n";
        }
        comprovante += "CLIENTE: " + headerLoteAB.getHlEmpNome() + "\n";
        espacos = util.RetornaEspacos(22 + util.FormataContaComDv(headerLoteAB.getHlEmpContConta(), headerLoteAB.getHlEmpContContaDv()).length());
        comprovante += "AGENCIA: " + util.FormataAgenciaComDv(headerLoteAB.getHlEmpContAgencia(), headerLoteAB.getHlEmpContAgenciaDv()) + espacos
                + "CONTA: " + util.FormataContaComDv(headerLoteAB.getHlEmpContConta(), headerLoteAB.getHlEmpContContaDv()) + "\n";
        comprovante += "====================================================================\n";
        espacos = util.RetornaEspacos(32);
        comprovante += "DATA DA TRANSFERÊNCIA:" + espacos + util.FormataData(segmentoA.getSaCdtDataReal()) + "\n";
        espacos = util.RetornaEspacos(15 + util.FormataValor(segmentoA.getSaCdtValorReal()).length());
        comprovante += "VALOR TOTAL:" + espacos + "R$ " + util.FormataValor(segmentoA.getSaCdtValorReal()) + "\n\n";
        comprovante += "*** TRANSFERIDO PARA:\n";
        comprovante += "CLIENTE: " + segmentoA.getSaFavNome() + "\n";
        espacos = util.RetornaEspacos(22 + util.FormataContaComDv(segmentoA.getSaFavContConta(), segmentoA.getSaFavContContaDv()).length());
        comprovante += "AGENCIA: " + util.FormataAgenciaComDv(segmentoA.getSaFavContAgencia(), segmentoA.getSaFavContAgenciaDv()) + espacos
                + "CONTA: " + util.FormataContaComDv(segmentoA.getSaFavContConta(), segmentoA.getSaFavContContaDv()) + "\n";
        // espacos = facilitadores.RetornaEspacos(segmentoB.getSbDCompCodDocumento().substring(79,85).length());
        comprovante += "NR. DO DOCUMENTO: " + espacos + segmentoB.getSbDCompCodDocumento() + "\n";
        comprovante += "====================================================================\n";
        espacos = util.RetornaEspacos(19 + segmentoZ.getSzAutBancaria().trim().length());
        comprovante += "AUTENTICACAO: " + espacos + util.FormataAutenticacao(segmentoZ.getSzAutBancaria()) + "\n";
        espacos = new Util().RetornaEspacos(20 + segmentoZ.getSzCtrBanco().length() + headerArquivo.getHBcoNome().trim().length());
        comprovante += "AGENTE ARRECADADOR:" + espacos + segmentoZ.getSzCtrBanco() + " " + headerArquivo.getHBcoNome().trim() + "\n\n";
        return comprovante;

    }

    private String geraArquivoTransfDocTed() {
        String espacos = "";

        comprovante = "\n" + util.FormataData(segmentoA.getSaCdtDataPgto()) + "                 CAIXA ECÔNOMICA FEDERAL                  " + util.FormataHora(headerArquivo.getHArqHora()) + "\n";
        comprovante += "                         COMPROVANTE DOC/TED\n"; // Centralizar
        comprovante += "====================================================================\n";
        //espacos = util.RetornaEspacos(18 + segmentoB.getSbDCompCodDocumento().substring(79,85).length());
        comprovante += "NR. DO DOCUMENTO: " + espacos + segmentoA.getSaCdtSeuNumero().substring(0, 5) + "\n";
        espacos = util.RetornaEspacos(11 + headerLoteAB.getHlEmpNome().trim().length());
        comprovante += "CLIENTE: " + headerLoteAB.getHlEmpNome() + "\n";
        espacos = util.RetornaEspacos(12 + segmentoA.getSaFavNome().trim().length());
        comprovante += "FAVORECIDO: " + segmentoA.getSaFavNome().trim() + "\n";
        if (segmentoB.getSbDCompFavInscTipo().equals("1")) {
            espacos = util.RetornaEspacos(5 + util.FormataCPF(segmentoB.getSbDCompFavInscNumero()).length());
            comprovante += "CPF: " + espacos + util.FormataCPF(segmentoB.getSbDCompFavInscNumero()) + "\n";
        } else {
            espacos = util.RetornaEspacos(6 + util.FormataCNPJ(segmentoB.getSbDCompFavInscNumero()).length());
            comprovante += "CNPJ: " + espacos + util.FormataCNPJ(segmentoB.getSbDCompFavInscNumero()) + "\n";
        }
        espacos = util.RetornaEspacos(11 + new CodigosCompe().getNomeBanco(segmentoA.getSaFavBanco()).length());
        comprovante += "BANCO: " + espacos + segmentoA.getSaFavBanco() + " " + new CodigosCompe().getNomeBanco(segmentoA.getSaFavBanco()) + "\n";
        // Verificar e atualizar conta com 2 dv
        espacos = util.RetornaEspacos(16 + util.FormataAgenciaSemDv(segmentoA.getSaFavContAgencia()).length()
                + util.FormataContaComDoisDv(segmentoA.getSaFavContConta(), segmentoA.getSaFavContContaDv(), segmentoA.getSaFavContDv()).length());
        comprovante += "AGENCIA: " + util.FormataAgenciaSemDv(segmentoA.getSaFavContAgencia()) + espacos
                + "CONTA: " + util.FormataContaComDoisDv(segmentoA.getSaFavContConta(), segmentoA.getSaFavContContaDv(), segmentoA.getSaFavContDv()) + "\n";

        // Implementar FinalidadesDocTed
        comprovante += "FINALIDADE: " + "\n"; // Implementar FinalidadesDocTed mas o arquivo retorno vem sem essa informação

        espacos = util.RetornaEspacos(12 + util.FormataValor(segmentoA.getSaCdtValorReal()).length());
        comprovante += "VALOR (R$) :" + espacos + util.FormataValor(segmentoA.getSaCdtValorReal()) + "\n";
        comprovante += "====================================================================\n";
        espacos = util.RetornaEspacos(18 + util.FormataAutenticacao(segmentoZ.getSzAutBancaria()).length());
        comprovante += "NR. AUTENTICACAO: " + espacos + util.FormataAutenticacao(segmentoZ.getSzAutBancaria()) + "\n";
        return comprovante;
    }

    public void GeraComprovante() {
        String nomeArquivo = "";
        String conteudo = "";
        if (segmentoA.getSaOcorrencias().trim().equals("00")) {
            System.out.println("sem erros");
            if (this.segmentoA.getSaFavBanco().equals("001")) {
                System.out.println("- CompBB");
                conteudo = geraArquivoTransfBB();
            } else {
                System.out.println("- OutrosBcos");
                conteudo = geraArquivoTransfDocTed();
            }
            nomeArquivo = geraNomeArquivo();
        } else {
            System.out.println("Errou");
            conteudo = geraConteudoArquivoComErro();
            nomeArquivo = geraNomeArquivoComErro();
        }
        new ArquivoGravar(pastaDestino, nomeArquivo).gravaArquivo(conteudo, 0);
    }

}
