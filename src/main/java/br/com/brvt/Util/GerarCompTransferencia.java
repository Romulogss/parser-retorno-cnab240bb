package br.com.brvt.Util;

import br.com.brvt.Modelo.ComprovanteTransfContasBB;
import br.com.brvt.Modelo.HeaderArquivo;
import br.com.brvt.Modelo.HeaderLoteAB;
import br.com.brvt.Modelo.SegmentoA;
import br.com.brvt.Modelo.SegmentoB;
import br.com.brvt.Modelo.SegmentoZ;

public class GerarCompTransferencia {

    private HeaderArquivo headerArquivo;
    private HeaderLoteAB headerLoteAB;
    private SegmentoA segmentoA;
    private SegmentoB segmentoB;
    private SegmentoZ segmentoZ;

    // Caso de Sucesso
    public GerarCompTransferencia(HeaderArquivo headerArquivo, HeaderLoteAB headerLoteAB, SegmentoA segmentoA, SegmentoB segmentoB, SegmentoZ segmentoZ) {
        this.headerArquivo = headerArquivo;
        this.headerLoteAB = headerLoteAB;
        this.segmentoA = segmentoA;
        this.segmentoB = segmentoB;
        this.segmentoZ = segmentoZ;
    }

    // Caso de Erro 
    public GerarCompTransferencia(HeaderArquivo headerArquivo, HeaderLoteAB headerLoteAB, SegmentoA segmentoA, SegmentoB segmentoB) {
        this.headerArquivo = headerArquivo;
        this.headerLoteAB = headerLoteAB;
        this.segmentoA = segmentoA;
        this.segmentoB = segmentoB;
    }

    public void GerarComprovante() {
        // Transferencias entre Contas BB
        if (segmentoA.getSaCodFinDoc().equals("00") && segmentoA.getSaCodFinTed().equals("00000")) {
            // System.out.println(new ComprovanteTransfContasBB(headerArquivo, headerLoteAB, segmentoA, segmentoB, segmentoZ).GeraComprovante());
            // System.out.println(new ComprovanteTransfContasBB(headerArquivo, headerLoteAB, segmentoA, segmentoB, segmentoZ).GeraNomeComprovante());
            
            new ComprovanteGravarArquivo(" ", new ComprovanteTransfContasBB(headerArquivo, headerLoteAB, segmentoA, segmentoB, segmentoZ).GeraNomeComprovante())
            .gravarArquivo(new ComprovanteTransfContasBB(headerArquivo, headerLoteAB, segmentoA, segmentoB, segmentoZ).GeraComprovante());
        } else {
            // TED
            if (segmentoA.getSaCodFinDoc().equals("00") && !segmentoA.getSaCodFinTed().equals("00000")) {
            // DOC
            } else {
            // doc
            }
        }
    }

    public void GerarComprovanteErro() {
        // Transferencias entre Contas BB
        if (segmentoA.getSaCodFinDoc().equals("00") && segmentoA.getSaCodFinTed().equals("00000")) {
            System.out.println("Erro Transf CC BB");
        } else {
            // TED
            if (segmentoA.getSaCodFinDoc().equals("00") && !segmentoA.getSaCodFinTed().equals("00000")) {
            // DOC
            } else {
            // doc
            }
        }
    }




}
